package edu.tumo.banking.validation.address.valueobjects.province;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static edu.tumo.banking.utils.common.CommonUtils.isValidSingleWord;

public class ProvinceValidator implements ConstraintValidator<Province, String> {
    @Override
    public void initialize(Province constraintAnnotation) {

    }

    @Override
    public boolean isValid(String province, ConstraintValidatorContext constraintValidatorContext) {
        return isValidSingleWord(province);
    }
}
