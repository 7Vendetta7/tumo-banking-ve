package edu.tumo.banking.utils.customexceptions.address;

import java.util.List;

public class InvalidAddressException extends BaseAddressException {
//    private Logger logger = LoggerFactory.getLogger(InvalidAddressException.class.getName());
//    public InvalidAddressException(List<String> errors){
//        errors.forEach(error -> logger.info(error));
//    }

    private final List<String> errors;

    public InvalidAddressException(List<String> errors){
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }
}
