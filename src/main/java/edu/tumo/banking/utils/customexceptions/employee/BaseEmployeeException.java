package edu.tumo.banking.utils.customexceptions.employee;

import edu.tumo.banking.utils.constants.Constants;

public class BaseEmployeeException extends RuntimeException{
    public BaseEmployeeException(String message){
        super(message);
    }

    public BaseEmployeeException(){
        super(Constants.BASE_EMPLOYEE_EXCEPTION_MESSAGE);
    }
}
