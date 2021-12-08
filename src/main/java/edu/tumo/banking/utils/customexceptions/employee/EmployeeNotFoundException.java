package edu.tumo.banking.utils.customexceptions.employee;

import edu.tumo.banking.utils.constants.Constants;

import java.text.MessageFormat;

public class EmployeeNotFoundException extends BaseEmployeeException{
    public EmployeeNotFoundException(Long id){
        super(MessageFormat.format(Constants.EMPLOYEE_NOT_FOUND_EXCEPTION, id));
    }
}
