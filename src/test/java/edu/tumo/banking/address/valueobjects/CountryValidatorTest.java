package edu.tumo.banking.address.valueobjects;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.utils.mock.address.valueobjects.CountryMock;
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

public class CountryValidatorTest {

    private edu.tumo.banking.domain.address.dto.AddressDTO address = null;

    @Autowired
    Validator validator;

    @BeforeEach
    public void init(){
        address = new edu.tumo.banking.domain.address.dto.AddressDTO(ZIP_CODE,
                COUNTRY,
                PROVINCE,
                CITY,
                STREET,
                FULL_BUILDING_NUMBER);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void test_validate_when_country_is_valid() {
        address.setCountry(CountryMock.mockValidCountry(8, 2));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "country");
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(0, violations.size());
    }

    @Test
    public void test_validate_when_country_is_invalid(){
        address.setCountry(CountryMock.mockInvalidCountry(9));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "country");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(1, violations.size());
        Assertions.assertEquals("{country.error.message}", violation.getMessage());
        Assertions.assertEquals("country", violation.getPropertyPath().toString());
    }

    @Test
    public void test_validate_when_country_is_null(){
        address.setCountry(null);
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "country");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(3, violations.size());
        Assertions.assertEquals("country", violation.getPropertyPath().toString());
    }
}
