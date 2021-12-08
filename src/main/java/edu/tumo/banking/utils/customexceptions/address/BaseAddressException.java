package edu.tumo.banking.utils.customexceptions.address;

import edu.tumo.banking.utils.constants.Constants;

public class BaseAddressException extends RuntimeException{

    public BaseAddressException(String message){
        super(message);
    }

    public BaseAddressException(){
        super(Constants.BASE_ADDRESS_EXCEPTION_MESSAGE);
    }

}
