package edu.tumo.banking.validation.address.valueobjects.street;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static edu.tumo.banking.utils.common.CommonUtils.isValidWordSequence;

public class StreetValidator implements ConstraintValidator<Street, String> {
    @Override
    public void initialize(Street constraintAnnotation) {

    }

    @Override
    public boolean isValid(String street, ConstraintValidatorContext constraintValidatorContext) {
        return isValidWordSequence(street);
    }
}
