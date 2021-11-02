package edu.tumo.banking.repository.address;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AddressRepository<A, I> extends CrudRepository<AddressDTO, Id> {
    List<AddressDTO> findall();
    AddressDTO add(AddressDTO address);
    Optional<AddressDTO> findBy(Id i);
    void deleteAddressDTOBy(Id i);
    void deleteAll();
}
