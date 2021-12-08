package edu.tumo.banking.utils.customexceptions.address;

import edu.tumo.banking.utils.constants.Constants;

import java.text.MessageFormat;

public class AddressNotFoundException extends BaseAddressException{
    public AddressNotFoundException(Long id){
        super(MessageFormat.format(Constants.ADDRESS_NOT_FOUND_EXCEPTION, id));
    }
}
