package edu.tumo.banking.validation.address.valueobjects.buildingnumber;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {BuildingNumberValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BuildingNumber {
    int a() default 0;
    String message();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
