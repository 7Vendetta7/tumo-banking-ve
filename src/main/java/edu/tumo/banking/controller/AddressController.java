package edu.tumo.banking.controller;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.domain.address.model.AddressModel;
import edu.tumo.banking.service.address.AddressService;
import edu.tumo.banking.utils.address.filter.AddressFilter;
import edu.tumo.banking.utils.address.normalizer.AddressNormalizer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/address", consumes = MediaType.APPLICATION_JSON_VALUE)
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody AddressDTO dto) {
        AddressNormalizer.addressNormalizer(dto);
        System.out.println(dto);
        return ResponseEntity.ok(addressService.create(dto));
    }

    @GetMapping(value = "/search/{id}")
    public ResponseEntity<AddressModel> searchById(@PathVariable(name = "id") Long ID) {
        return ResponseEntity.ok(addressService.findById(ID).orElseThrow());
    }

    @GetMapping(value = "/search")
    public ResponseEntity<List<AddressModel>> search(@RequestBody AddressFilter addressFilter,
                                                     @RequestParam(defaultValue = "0") Integer pageNumber,
                                                     @RequestParam(defaultValue = "3") Integer pageSize) throws IllegalAccessException {
        return ResponseEntity.ok(addressService.search(addressFilter, pageNumber, pageSize));
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<AddressModel> update(@RequestBody AddressDTO dto, @PathVariable(name = "id") Long ID) {
        return ResponseEntity.ok(addressService.update(dto, ID));
    }

    @PutMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable(name = "id") Long ID) {
        addressService.deleteById(ID);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

