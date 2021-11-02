package edu.tumo.banking.domain.address.dao;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.domain.address.model.AddressModel;
import edu.tumo.banking.repository.address.AddressRepository;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Optional;

public abstract class AddressDAO implements AddressRepository<AddressModel,Id> {

    @Override
    public List<AddressDTO> findall() {
        return null;
    }

    @Override
    public AddressDTO add(AddressDTO address) {
        return null;
    }

    @Override
    public Optional<AddressDTO> findBy(Id i) {
        return Optional.empty();
    }

    @Override
    public void deleteAddressDTOBy(Id i) {

    }

    @Override
    public void deleteAll() {

    }
}
