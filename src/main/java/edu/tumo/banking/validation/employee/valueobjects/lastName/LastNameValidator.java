package edu.tumo.banking.validation.employee.valueobjects.lastName;

import edu.tumo.banking.utils.common.CommonUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LastNameValidator implements ConstraintValidator<LastName, String> {
    @Override
    public void initialize(LastName constraintAnnotation) {

    }

    @Override
    public boolean isValid(String lastName, ConstraintValidatorContext constraintValidatorContext) {
        return CommonUtils.isValidSingleWord(lastName);
    }
}
