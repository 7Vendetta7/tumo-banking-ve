package edu.tumo.banking.utils.mock.common;

import org.apache.commons.lang3.RandomStringUtils;

public class CommonMock {
    public static String mockValidWords(int wordLength, int wordNumber) {
        StringBuilder sb = new StringBuilder(wordLength * wordNumber * (wordNumber - 1));
        for (int i = 0; i < wordNumber - 1; i++) {
            sb.append(RandomStringUtils.randomAlphabetic(wordLength)).append(" ");
        }
        return sb.append(RandomStringUtils.randomAlphabetic(wordLength)).toString();
    }

    public static String mockValidWord(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public static String mockInvalidWord(int length) {
        return RandomStringUtils.randomAlphabetic(length - 1) + RandomStringUtils.randomNumeric(1);
    }
}
