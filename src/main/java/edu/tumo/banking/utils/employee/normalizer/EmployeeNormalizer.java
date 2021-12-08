package edu.tumo.banking.utils.employee.normalizer;

import edu.tumo.banking.domain.employee.dto.EmployeeDTO;

import static edu.tumo.banking.utils.address.normalizer.AddressNormalizer.addressNormalizer;
import static edu.tumo.banking.utils.common.normalizer.CommonNormalizer.normalizeWord;
import static edu.tumo.banking.utils.common.normalizer.CommonNormalizer.normalizeWords;
/**
 * @Description: This class is designed for defining some methods which should
 *               modify and normalize the data collected from the "web" with our
 *               business logic.
 *
 * @author Argishti_Tigranyan
 */

public class EmployeeNormalizer {
    /**
     * @Description: This method accepts as parameter instance of EmployeeDTO
     *               and normalizes its data. It trims the zipCode and building
     *               number, normalizes country, province, city and street
     *               by "upper-casing" first character of the string and
     *               "lower-casing" the rest (using normalizeWord and
     *               normalizeWords methods).
     * @param employee
     */
    public static void employeeNormalizer(EmployeeDTO employee){
        employee.setFirstName(normalizeWord(employee.getFirstName()));
        employee.setLastName(normalizeWord(employee.getLastName()));
        employee.setPosition(normalizeWords(employee.getPosition()));
        addressNormalizer(employee.getAddress());
    }
}
