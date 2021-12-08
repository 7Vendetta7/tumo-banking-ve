package edu.tumo.banking.utils.mock.address.valueobjects;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class BuildingNumberMock {
    public static String mockValidPartialBuildingNumber(int length){
        return (new Random().nextInt(10) + 1)+RandomStringUtils.randomNumeric(length-1);
    }

    public static String mockValidFullNumericBuildingNumber(int partsLength){
        return mockValidPartialBuildingNumber(partsLength) + "/" + mockValidPartialBuildingNumber(partsLength);
    }

    public static String mockValidFullBuildingNumber(int partsLength){
        return mockValidFullNumericBuildingNumber(partsLength) + RandomStringUtils.randomAlphabetic(1).toUpperCase();
    }

    public static String mockInvalidPartialBuildingNumber(int length){
        return RandomStringUtils.randomAlphabetic(1) + RandomStringUtils.randomNumeric(length - 1);
    }

    public static String mockInvalidFullNumericBuildingNumber(int partsLength){
        return mockInvalidPartialBuildingNumber(partsLength) + "/" + mockValidPartialBuildingNumber(partsLength);
    }

    public static String mockInvalidFullBuildingNumber(int partsLength){
        return mockValidFullBuildingNumber(partsLength) + RandomStringUtils.randomAlphabetic(1);
    }
}
