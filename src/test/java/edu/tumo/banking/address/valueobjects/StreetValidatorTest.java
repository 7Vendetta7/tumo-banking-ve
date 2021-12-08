package edu.tumo.banking.address.valueobjects;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.utils.mock.address.valueobjects.StreetMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.*;
import java.util.Set;

import static edu.tumo.banking.utils.constants.Constants.*;

public class StreetValidatorTest {
    private AddressDTO address = null;

    @Autowired
    Validator validator;

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
    public void test_validate_when_street_is_valid(){
        address.setStreet(StreetMock.mockValidStreet(8, 3));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "street");
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(0, violations.size());
    }

    @Test
    public void test_validate_when_street_is_invalid(){
        address.setStreet(StreetMock.mockInvalidStreet(8));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "street");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(1, violations.size());
        Assertions.assertEquals("{street.error.message}", violation.getMessage());
        Assertions.assertEquals("street", violation.getPropertyPath().toString());
    }

    @Test
    public void test_validate_when_street_is_null(){
        address.setStreet(null);
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "street");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(3, violations.size());
        Assertions.assertEquals("street", violation.getPropertyPath().toString());
    }
}
