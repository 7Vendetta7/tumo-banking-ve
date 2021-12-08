package edu.tumo.banking.validation.address.valueobjects.country;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static edu.tumo.banking.utils.common.CommonUtils.isValidWordSequence;

public class CountryValidator implements ConstraintValidator<Country, String> {
    @Override
    public boolean isValid(String country, ConstraintValidatorContext constraintValidatorContext) {
        return isValidWordSequence(country);
    }

    @Override
    public void initialize(Country constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}

