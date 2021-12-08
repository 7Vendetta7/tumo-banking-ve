package edu.tumo.banking.validation.employee.valueobjects.firstName;

import edu.tumo.banking.utils.common.CommonUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FirstNameValidator implements ConstraintValidator<FirstName, String> {
    @Override
    public void initialize(FirstName constraintAnnotation) {

    }

    @Override
    public boolean isValid(String firstName, ConstraintValidatorContext constraintValidatorContext) {
        return CommonUtils.isValidSingleWord(firstName);
    }
}
