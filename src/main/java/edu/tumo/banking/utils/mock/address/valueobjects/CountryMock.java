package edu.tumo.banking.utils.mock.address.valueobjects;

import edu.tumo.banking.utils.mock.common.CommonMock;

public class CountryMock {
    public static String mockValidCountry(int wordLength, int wordNumber) {
        if (1 == wordNumber){
            return CommonMock.mockValidWord(wordLength);
        }
        return CommonMock.mockValidWords(wordLength, wordNumber);
    }

    public static String mockInvalidCountry(int length) {
        return CommonMock.mockInvalidWord(length);
    }
}
