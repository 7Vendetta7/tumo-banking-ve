package edu.tumo.banking.validation.employee.valueobjects.firstName;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {FirstNameValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstName {
    int a() default 0;
    String message() default "firstName.error.message";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
