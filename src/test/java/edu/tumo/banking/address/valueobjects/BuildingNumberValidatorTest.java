package edu.tumo.banking.address.valueobjects;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.utils.mock.address.valueobjects.BuildingNumberMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static edu.tumo.banking.utils.constants.Constants.*;

public class BuildingNumberValidatorTest {

    private AddressDTO address = null;

    private Validator validator = null;

    @BeforeEach
    public void init() {
        address = new AddressDTO(ZIP_CODE,
                COUNTRY,
                PROVINCE,
                CITY,
                STREET,
                FULL_BUILDING_NUMBER);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void test_validate_when_partial_building_number_is_valid(){
        address.setBuildingNumber(BuildingNumberMock.mockValidPartialBuildingNumber(2));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "buildingNumber");
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(0, violations.size());
    }

    @Test
    public void test_validate_when_full_numeric_building_number_is_valid(){
        address.setBuildingNumber(BuildingNumberMock.mockValidFullNumericBuildingNumber(2));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "buildingNumber");
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(0, violations.size());
    }

    @Test
    public void test_validate_when_full_building_number_is_valid(){
        address.setBuildingNumber(BuildingNumberMock.mockValidFullBuildingNumber(2));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "buildingNumber");
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(0, violations.size());
    }

    @Test
    public void test_validate_when_partial_building_number_is_invalid(){
        address.setBuildingNumber(BuildingNumberMock.mockInvalidPartialBuildingNumber(2));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "buildingNumber");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(1, violations.size());
        Assertions.assertEquals("{buildingNumber.error.message}", violation.getMessage());
        Assertions.assertEquals("buildingNumber", violation.getPropertyPath().toString());
    }

    @Test
    public void test_validate_when_full_numeric_building_number_is_invalid(){
        address.setBuildingNumber(BuildingNumberMock.mockInvalidFullNumericBuildingNumber(2));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "buildingNumber");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(1, violations.size());
        Assertions.assertEquals("{buildingNumber.error.message}", violation.getMessage());
        Assertions.assertEquals("buildingNumber", violation.getPropertyPath().toString());
    }

    @Test
    public void test_validate_when_full_building_number_is_invalid(){
        address.setBuildingNumber(BuildingNumberMock.mockInvalidFullBuildingNumber(2));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "buildingNumber");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(1, violations.size());
        Assertions.assertEquals("{buildingNumber.error.message}", violation.getMessage());
        Assertions.assertEquals("buildingNumber", violation.getPropertyPath().toString());
    }

    @Test
    public void test_validate_when_full_building_number_is_null(){
        address.setBuildingNumber(null);
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "buildingNumber");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(3, violations.size());
        Assertions.assertEquals("buildingNumber", violation.getPropertyPath().toString());
    }
}
