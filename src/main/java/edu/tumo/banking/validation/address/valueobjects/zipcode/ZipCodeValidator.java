package edu.tumo.banking.validation.address.valueobjects.zipcode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static edu.tumo.banking.utils.common.CommonUtils.isValidPositiveNumeric;

public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {
    @Override
    public void initialize(ZipCode constraintAnnotation) {

    }

    @Override
    public boolean isValid(String zipCode, ConstraintValidatorContext constraintValidatorContext) {
        return isValidPositiveNumeric(zipCode);
    }
}
