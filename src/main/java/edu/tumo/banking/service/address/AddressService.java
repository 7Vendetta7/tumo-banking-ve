package edu.tumo.banking.service.address;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.domain.address.model.AddressModel;
import edu.tumo.banking.utils.address.filter.AddressFilter;

import edu.tumo.banking.utils.customexceptions.address.InvalidAddressException;

import java.util.List;
import java.util.Optional;

/**
 * Description: The goal of AddressService interface is defining the ways with which
 *              its implementations should "work". As long as Spring's powerful side
 *              is dependency injection we define AddressService's instance at Controller
 *              and due to polymorphism the role of the service starts to hold its
 *              implementation: see AddressServiceImpl class at edu.egs.banking.service.address
 *              package.
 *
 * @author Argishti_Tigranyan
 */

public interface AddressService {
    AddressModel create(AddressDTO dto) throws InvalidAddressException;
    Optional<AddressModel> findById(Long id);
    List<AddressModel> search(AddressFilter addressFilter, Integer pageNumber, Integer pageSize) throws IllegalAccessException;
    AddressModel update(AddressDTO dto, Long id);
    void deleteById(Long id);
}
