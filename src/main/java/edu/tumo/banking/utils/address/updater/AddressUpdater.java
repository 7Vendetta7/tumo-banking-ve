package edu.tumo.banking.utils.address.updater;

import edu.tumo.banking.domain.address.dao.AddressDAO;

import java.time.Clock;
import java.time.Instant;

public class AddressUpdater {
    public static void updater(AddressDAO newDAO, AddressDAO existingDAO){
        existingDAO.setZipCode(newDAO.getZipCode());
        existingDAO.setCountry(newDAO.getCountry());
        existingDAO.setProvince(newDAO.getProvince());
        existingDAO.setCity(newDAO.getCity());
        existingDAO.setStreet(newDAO.getStreet());
        existingDAO.setBuildingNumber(newDAO.getBuildingNumber());
        existingDAO.setUpdatedDate(Instant.now(Clock.systemUTC()));
    }
}
