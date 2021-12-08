package edu.tumo.banking.validation.address.valueobjects.country;

import javax.validation.Payload;
import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {CountryValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Country {
    int a() default 0;
    String message() default "country.error.message";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
