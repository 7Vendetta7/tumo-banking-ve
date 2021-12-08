package edu.tumo.banking.utils.address.valueobjects;

import org.apache.commons.lang3.StringUtils;

import static edu.tumo.banking.utils.common.CommonUtils.isValidPositiveNumeric;

/**
 * @Description: This class is designed for defining the methods which can
 *              be useful for organizing the validation stage of the
 *              BuildingNumber of our Addresses.
 *
 * @author Argishti_Tigranyan
 */

public class BuildingNumberUtils {
    /**
     * @Description: This methods is designed for defining the business logic for the
     *               valid building numbers. At first it stores as boolean the fact
     *               of whether the last character of the String is alphabetic or not.
     *               If the String does not contain / and the last character is alphabetic
     *               it checks whether the substring of the string without last character
     *               is valid numeric. And if the last character was not alphabetic
     *               it checks whether the whole string is valid numeric. If this
     *               condition is false in that case we have some building number
     *               which contains /. In this case we split the string by / and
     *               check if the parts of the building number are valid numerics.
     *
     *
     * @param value Strings without any limitations
     * @return true or false, if true the data was valid and false if it was invalid.
     */
    public static boolean isValidBuildingNumber(final String value) {
        String trim = value.trim();
        if (StringUtils.isBlank(trim)){
            return false;
        }
        final boolean isLastCharAlphabetic = Character.isAlphabetic(trim.charAt(trim.length() - 1));
        if (!trim.contains("/")) {
            if (isLastCharAlphabetic) {
                return isValidPositiveNumeric(trim.substring(0, trim.length() - 1));
            }
            return isValidPositiveNumeric(trim);
        }
        if (trim.chars().filter(ch -> ch == '/').count() > 1){
            return false;
        }
        String[] splitParts;
        if (isLastCharAlphabetic) {
            splitParts = trim.substring(0, trim.length() - 1).split("/");
        } else {
            splitParts = trim.split("/");
        }
        for (String part : splitParts) {
            if (!isValidPositiveNumeric(part)) {
                return false;
            }
        }
        return true;
    }
}
