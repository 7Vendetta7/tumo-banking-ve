package edu.tumo.banking.utils.common;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonUtils {

    public static boolean isValidSingleWord(String value) {
        if (value == null){
            return false;
        }
        if (StringUtils.isBlank(value)) {
            return false;
        }
        return value.trim().chars().allMatch(Character::isAlphabetic);
//       return Optional.ofNullable(value)
//               .map(CharSequence::chars)
//               .map(it -> it.allMatch(Character::isAlphabetic))
//               .orElse(false);
// Optional.of(value).flatMap(it -> it.split(""))
    }

    public static String valueToLowerCaseStartingFromSecondCharacter(String value) {
        if (StringUtils.isBlank(value)) {
            return StringUtils.EMPTY;
        }
        StringBuilder sb = new StringBuilder(value.toLowerCase());
        sb.setCharAt(0, value.charAt(0));
        value = sb.toString();
        return value;
    }

    public static String valueToUpperCaseFirstCharacter(String value) {
        if (!startsWithUpperCase(value)) {
            StringBuilder sb = new StringBuilder(value.toLowerCase());
            sb.setCharAt(0, (char) (value.charAt(0) - 32));
            value = sb.toString();
            return value;
        }
        return value;
    }

    public static boolean isValidWordSequence(String valueSequence) {
        if (StringUtils.isBlank(valueSequence)){
            return false;
        }
        List<String> words = splitWordSequence(valueSequence);
        for (String word : words) {
            if (!isValidSingleWord(word)) {
                return false;
            }
        }
        return true;
    }

    public static String wordSequenceToLowerCaseStartingFromSecondCharacter(List<String> valueSequence) {
        //List<String> words = splitWordSequence(valueSequence);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < valueSequence.size() - 1; i++) {
            sb.append(valueToLowerCaseStartingFromSecondCharacter(valueSequence.get(i))).append(" ");
        }
        sb.append(valueToLowerCaseStartingFromSecondCharacter(valueSequence.get(valueSequence.size() - 1)));
        return sb.toString();
    }


    // do with streams (join..)
    public static String wordSequenceToUpperCaseFirstCharacters(List<String> valueSequence) {
        //List<String> words = splitWordSequence(valueSequence);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < valueSequence.size() - 1; i++) {
            sb.append(valueToUpperCaseFirstCharacter(valueSequence.get(i))).append(" ");
        }
        sb.append(valueToUpperCaseFirstCharacter(valueSequence.get(valueSequence.size() - 1)));
        return sb.toString();
    }

    public static boolean isValidPositiveNumeric(String value) {
        if (StringUtils.isBlank(value)){
            return false;
        }
        for (char c : value.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidNumeric(String value){
        if (value.charAt(0) == '-'){
            return isValidPositiveNumeric(value.substring(1));
        }
        return isValidPositiveNumeric(value);
    }

    public static List<String> splitWordSequence(String valueSequence) {
        return Arrays.stream(valueSequence.split(" "))
                .filter(StringUtils::isNotEmpty)
                .collect(Collectors.toList());
    }

    private static boolean startsWithUpperCase(String value) {
        return value.charAt(0) >= 'A' && value.charAt(0) <= 'Z';
    }
}
