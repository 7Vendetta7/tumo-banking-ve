package edu.tumo.banking.utils.mock.address.valueobjects;

import edu.tumo.banking.utils.mock.common.CommonMock;

public class StreetMock {
    public static String mockValidStreet(int wordLength, int wordNumber) {
        if (1 == wordNumber){
            return CommonMock.mockValidWord(wordLength);
        }
        return CommonMock.mockValidWords(wordLength, wordNumber);
    }

    public static String mockInvalidStreet(int length) {
        return CommonMock.mockInvalidWord(length);
    }
}
