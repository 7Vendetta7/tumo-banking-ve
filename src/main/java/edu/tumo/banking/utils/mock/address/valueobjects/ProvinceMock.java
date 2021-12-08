package edu.tumo.banking.utils.mock.address.valueobjects;

import edu.tumo.banking.utils.mock.common.CommonMock;

public class ProvinceMock {
    public static String mockValidProvince(int length){
        return CommonMock.mockValidWord(length);
    }

    public static String mockInvalidProvince(int length){
        return CommonMock.mockInvalidWord(length);
    }

}
