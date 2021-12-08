package edu.tumo.banking.utils.mock.address.valueobjects;

import edu.tumo.banking.utils.mock.common.CommonMock;

public class CityMock {
    public static String mockValidCity(int length){
        return CommonMock.mockValidWord(length);
    }

    public static String mockInvalidCity(int length){
        return CommonMock.mockInvalidWord(length);
    }
}
