package edu.tumo.banking.validation.address.valueobjects.buildingnumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static edu.tumo.banking.utils.address.valueobjects.BuildingNumberUtils.isValidBuildingNumber;

public class BuildingNumberValidator implements ConstraintValidator<BuildingNumber, String> {
    @Override
    public void initialize(BuildingNumber constraintAnnotation) {

    }

    @Override
    public boolean isValid(String buildingNumber, ConstraintValidatorContext constraintValidatorContext) {
        return isValidBuildingNumber(buildingNumber);
    }
}
