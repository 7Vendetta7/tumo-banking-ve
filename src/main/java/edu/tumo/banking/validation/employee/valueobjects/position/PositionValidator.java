package edu.tumo.banking.validation.employee.valueobjects.position;

import edu.tumo.banking.utils.common.CommonUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PositionValidator implements ConstraintValidator<Position, String> {
    @Override
    public void initialize(Position constraintAnnotation) {

    }

    @Override
    public boolean isValid(String position, ConstraintValidatorContext constraintValidatorContext) {
        return CommonUtils.isValidWordSequence(position);
    }
}
