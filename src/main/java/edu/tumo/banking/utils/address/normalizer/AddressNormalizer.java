package edu.tumo.banking.utils.address.normalizer;

import edu.tumo.banking.domain.address.dto.AddressDTO;

import static edu.tumo.banking.utils.common.normalizer.CommonNormalizer.normalizeWord;
import static edu.tumo.banking.utils.common.normalizer.CommonNormalizer.normalizeWords;

/**
 * @Description: This class is designed for defining some methods which should
 *               modify and normalize the data collected from the "web" with our
 *               business logic.
 *
 * @author Argishti_Tigranyan
 */

public class AddressNormalizer {
    /**
     * @Description: This method accepts as parameter instance of AddressDTO
     *               and normalizes its data. It trims the zipCode and building
     *               number, normalizes country, province, city and street
     *               by "upper-casing" first character of the string and
     *               "lower-casing" the rest (using normalizeWord and
     *               normalizeWords methods).
     * @param address
     */
    public static void addressNormalizer(AddressDTO address) {
//        addresses.forEach(address -> {
            address.setZipCode(address.getZipCode().trim());
            address.setCountry(normalizeWords(address.getCountry()));
            address.setProvince(normalizeWord(address.getProvince()));
            address.setCity(normalizeWord(address.getCity()));
            address.setStreet(normalizeWords(address.getStreet()));
            address.setBuildingNumber(address.getBuildingNumber().trim());
//        });
    }
}
