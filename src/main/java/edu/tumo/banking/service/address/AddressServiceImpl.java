package edu.tumo.banking.service.address;

import edu.tumo.banking.domain.address.dao.AddressDAO;
import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.domain.address.model.AddressModel;
import edu.tumo.banking.repository.address.AddressRepository;
import edu.tumo.banking.utils.address.filter.AddressFilter;
import edu.tumo.banking.utils.address.updater.AddressUpdater;
import edu.tumo.banking.utils.address.converter.AddressConverter;
import edu.tumo.banking.utils.common.filter.CommonFilterUtils;
import edu.tumo.banking.utils.customexceptions.address.AddressNotFoundException;
import edu.tumo.banking.utils.customexceptions.address.InvalidAddressException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


/**
 * Description: One of the implementation of the AddressService interface. This class
 * overrides the behaviour defined by Service interface and adds its
 * business logic on it. This class can easily act under the name of
 * the AddressService, that is why at the level of the Controller we
 * have instance of AddressService class. Due to @Service annotation
 * program understands that it should use this implementation.
 *
 * @author Argishti_Tigranyan
 */

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public AddressModel create(AddressDTO dto) {
        AddressDAO dao = AddressConverter.fromDTOtoDAO(dto);
        addressRepository.save(dao);
        return AddressConverter.fromDAOtoModel(dao);
    }

    @Override
    public Optional<AddressModel> findById(Long id) {
        Optional<AddressDAO> addressDAO = addressRepository.findById(id);
        if (addressDAO.isEmpty()) {
            throw new AddressNotFoundException(id);
        }
        return Optional.of(AddressConverter.fromDAOtoModel(addressDAO.get()));
    }

    @Transactional(readOnly = true)
    @Override
    public List<AddressModel> search(AddressFilter addressFilter, Integer pageNumber, Integer pageSize) throws IllegalAccessException {
        final Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Specification<AddressDAO> searchSpec = AddressFilter.search(addressFilter);
        Page<AddressDAO> searchResults = addressRepository.findAll(searchSpec, pageable);
        if (searchResults.hasContent()) {
            return AddressConverter.fromDAOListToModelList(searchResults);
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public AddressModel update(AddressDTO dto, Long id) {
        AddressDAO existingDAO = addressRepository.findById(id).orElseThrow(() -> new AddressNotFoundException(id));
        AddressDAO newDAO = AddressConverter.fromDTOtoDAO(dto);
        AddressUpdater.updater(newDAO, existingDAO);
        addressRepository.save(existingDAO);
        return AddressConverter.fromDAOtoModel(existingDAO);
    }

    @Override
    public void deleteById(Long id) {
        AddressDAO existingDAO = addressRepository.findById(id).orElseThrow(() -> new AddressNotFoundException(id));
        existingDAO.setRemovedDate(Instant.now(Clock.systemUTC()));
        existingDAO.setEnabled(false);
        addressRepository.save(existingDAO);
    }
}
