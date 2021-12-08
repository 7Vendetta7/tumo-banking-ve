package edu.tumo.banking.address.valueobjects;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.utils.mock.address.valueobjects.ZipCodeMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static edu.tumo.banking.utils.constants.Constants.*;

public class ZipCodeValidatorTest {

    @Autowired
    Validator validator;

    private AddressDTO address = null;

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
    public void test_validate_when_zipCode_is_valid() {
        address.setZipCode(ZipCodeMock.mockValidZipCode());
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "zipCode");
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(0, violations.size());
    }

    @Test
    public void test_validate_when_zipCode_has_invalid_length() {
        address.setZipCode(ZipCodeMock.mockInvalidLengthZipCode());
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "zipCode");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(1, violations.size());
        Assertions.assertEquals("{zipCode.error.length.message}", violation.getMessage());
        Assertions.assertEquals("zipCode", violation.getPropertyPath().toString());
    }

    @Test
    public void test_validate_when_zipCode_has_invalid_value() {
        address.setZipCode(ZipCodeMock.mockInvalidValueZipCode());
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "zipCode");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(1, violations.size());
        Assertions.assertEquals("{zipCode.error.message}", violation.getMessage());
        Assertions.assertEquals("zipCode", violation.getPropertyPath().toString());
    }

    @Test
    public void test_validate_when_zipCode_is_null() {
        address.setZipCode(null);
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "zipCode");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals("zipCode", violation.getPropertyPath().toString());
    }
}