package edu.tumo.banking.utils.mock.address.valueobjects;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;

public class ZipCodeMock {
    public static String mockValidZipCode() {
        return String.valueOf(ThreadLocalRandom.current().nextInt(1000, 10000));
    }

    public static String mockInvalidLengthZipCode() {
        return String.valueOf(ThreadLocalRandom.current().nextInt(1, 1000));
    }

    public static String mockInvalidValueZipCode() {
        return ThreadLocalRandom.current().nextInt(100, 1000)
                + RandomStringUtils.randomAlphabetic(1);
    }
}
