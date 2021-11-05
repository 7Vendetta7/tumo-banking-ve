package edu.tumo.banking.repository.address;
import java.util.List;
import java.util.Optional;

public interface AddressRepository<AddressModel,Long>
{
    List<AddressModel> findall();
    AddressModel add(Long id);
    Optional<AddressModel> findBy(Long id);
    void deleteAddressModelBy(Long id);
    void deleteAll();
}
