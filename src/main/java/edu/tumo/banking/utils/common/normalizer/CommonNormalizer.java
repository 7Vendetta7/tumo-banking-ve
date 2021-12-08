package edu.tumo.banking.utils.common.normalizer;

import edu.tumo.banking.utils.common.CommonUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static edu.tumo.banking.utils.common.CommonUtils.*;

public class CommonNormalizer {
    public static String normalizeWord(String word){
        word = valueToLowerCaseStartingFromSecondCharacter(word.trim());
        return valueToUpperCaseFirstCharacter(word);
    }

    public static String normalizeWords(String words){
        List<String> splitWords = splitWordSequence(words);
        return splitWords.parallelStream().map(item -> {
            String a = CommonUtils.wordSequenceToLowerCaseStartingFromSecondCharacter(Collections.singletonList(item));
            a = CommonUtils.wordSequenceToUpperCaseFirstCharacters(Collections.singletonList(a));
            return a;
        }).collect(Collectors.joining(" "));
    }
}
