package edu.tumo.banking.utils.address.valueobjects;

/**
 * @Description: This class is designed for defining the methods which can
 *              be useful for organizing the validation stage of the
 *              ZipCode of our Addresses.
 *
 * @author Argishti_Tigranyan
 */

public class ZipCodeUtils {
    /**
     * @Description: This method is designed for checking whether the length of the ZipCode
     *               is 4 or not. The reason of 4 is the business logic. We consider working
     *               with Armenian addresses and the zipCodes in our country are represented
     *               with 4 characters.
     *
     * @param value String without any limitations
     * @return true or false
     */
    public static boolean isValidZipCodeLength(String value) {
        return value.length() == 4;
    }
}
