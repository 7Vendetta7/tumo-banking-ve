package edu.tumo.banking.validation.address.valueobjects.street;

import javax.validation.Payload;
import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {StreetValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Street {
    int a() default 0;
    String message() default "street.error.message";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
