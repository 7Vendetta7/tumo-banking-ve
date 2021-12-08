package edu.tumo.banking.validation.address.valueobjects.city;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static edu.tumo.banking.utils.common.CommonUtils.isValidSingleWord;

public class CityValidator implements ConstraintValidator<City, String> {
    @Override
    public void initialize(City constraintAnnotation) {

    }

    @Override
    public boolean isValid(String city, ConstraintValidatorContext constraintValidatorContext) {
        return isValidSingleWord(city);
    }

}
