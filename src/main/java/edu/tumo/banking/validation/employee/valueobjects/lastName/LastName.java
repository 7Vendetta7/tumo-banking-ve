package edu.tumo.banking.validation.employee.valueobjects.lastName;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {LastNameValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LastName {
    String message() default "lastName.error.message";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
