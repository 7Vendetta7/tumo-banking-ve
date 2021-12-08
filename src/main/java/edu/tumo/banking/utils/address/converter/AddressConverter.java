package edu.tumo.banking.utils.address.converter;

import edu.tumo.banking.domain.address.dao.AddressDAO;
import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.domain.address.model.AddressModel;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class AddressConverter {
    public static AddressDAO fromDTOtoDAO(AddressDTO addressDTO){
        AddressDAO addressDAO = new AddressDAO();
        addressDAO.setZipCode(addressDTO.getZipCode());
        addressDAO.setCountry(addressDTO.getCountry());
        addressDAO.setProvince(addressDTO.getProvince());
        addressDAO.setCity(addressDTO.getCity());
        addressDAO.setStreet(addressDTO.getStreet());
        addressDAO.setBuildingNumber(addressDTO.getBuildingNumber());
        addressDAO.setCreatedDate((Instant.now(Clock.systemUTC())));
        addressDAO.setEnabled(true);
        return addressDAO;
    }

    public static AddressModel fromDAOtoModel(AddressDAO addressDAO){
            return new AddressModel.AddressModelBuilder()
                    .id(addressDAO.getId())
                    .zipCode(addressDAO.getZipCode())
                    .country(addressDAO.getCountry())
                    .province(addressDAO.getProvince())
                    .city(addressDAO.getCity())
                    .street(addressDAO.getStreet())
                    .buildingNumber(addressDAO.getBuildingNumber())
                    .createdDate(addressDAO.getCreatedDate())
                    .build();
    }

    public static List<AddressModel> fromDAOListToModelList(Iterable<AddressDAO> addressDAOS){
        List<AddressModel> addressModels = new ArrayList<>();
        for (AddressDAO dao: addressDAOS) {
            addressModels.add(fromDAOtoModel(dao));
        }
        return addressModels;
    }
}
