package edu.tumo.banking.repository.address;

import edu.tumo.banking.domain.address.model.AddressModel;

import java.util.List;
import java.util.Optional;


public class AddressRepositoryImpl implements AddressRepository<AddressModel, Long> {
    @Override
    public List<AddressModel> findall() {
        return null;
    }

    @Override
    public AddressModel add(Long id) {
        return null;
    }

    @Override
    public Optional<AddressModel> findBy(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteAddressModelBy(Long id) {

    }

    @Override
    public void deleteAll() {

    }
}
