package edu.tumo.banking.validation;

import edu.tumo.banking.domain.user.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserValidation {
    public boolean validateForNull(UserModel userModel){
        if(userModel.getUserId() == null){
            System.out.println("Id of bank is null");
            return false;
        }
        if(userModel.getUsername() == null){
            System.out.println("Username of user is null");
            return false;
        }
        if(userModel.getPassword() == null){
            System.out.println("Password of user is null");
            return false;
        }
        return true;
    }
}
