package edu.tumo.banking.service.address;


import edu.tumo.banking.repository.address.AddressRepository;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AddressServiceImpl {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    public Address save(Address address) {
    }

    public Iterable<Address> findAll() {
    }
}
