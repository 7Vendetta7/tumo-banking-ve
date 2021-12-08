package edu.tumo.banking.validation.address.valueobjects.province;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {ProvinceValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Province {
    int a() default 0;
    String message() default "province.error.message";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
