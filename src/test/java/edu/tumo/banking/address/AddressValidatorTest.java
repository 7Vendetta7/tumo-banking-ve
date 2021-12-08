package edu.tumo.banking.address;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.*;
import java.util.Set;

import static edu.tumo.banking.utils.mock.address.AddressMock.mockInvalidAddress;
import static edu.tumo.banking.utils.mock.address.AddressMock.mockValidAddress;

public class AddressValidatorTest {

    Validator validator;

    @BeforeEach
    public void init() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void test_validate_when_address_is_valid() {
        AddressDTO address = mockValidAddress();
        Set<ConstraintViolation<AddressDTO>> violations = validator.validate(address);
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(0, violations.size());
    }

    @Test
    public void test_validate_when_address_is_invalid() {
        AddressDTO address = mockInvalidAddress();
        Set<ConstraintViolation<AddressDTO>> violations = validator.validate(address);
        Assertions.assertNotNull(violations);
        Assertions.assertEquals(6, violations.size());
    }
}
