package edu.tumo.banking.address.valueobjects;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.utils.mock.address.valueobjects.CityMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static edu.tumo.banking.utils.constants.Constants.*;

public class CityValidatorTest {
    private AddressDTO address = null;


    Validator validator = null;

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
    public void test_validate_when_city_is_valid(){
        address.setCity(CityMock.mockValidCity(8));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "city");
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(0, violations.size());
    }

    @Test
    public void test_validate_when_city_is_invalid(){
        address.setCity(CityMock.mockInvalidCity(8));
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "city");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(1, violations.size());
        Assertions.assertEquals("{city.error.message}", violation.getMessage());
        Assertions.assertEquals("city", violation.getPropertyPath().toString());
    }

    @Test
    public void test_validate_when_city_is_null(){
        address.setCity(null);
        AddressDTO address = this.address;
        Set<ConstraintViolation<AddressDTO>> violations = validator.validateProperty(address, "city");
        ConstraintViolation<AddressDTO> violation = violations.iterator().next();
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(3, violations.size());
        Assertions.assertEquals("city", violation.getPropertyPath().toString());
    }
}
