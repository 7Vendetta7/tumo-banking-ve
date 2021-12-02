package edu.tumo.banking.service.user;

import edu.tumo.banking.domain.user.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserModel> findAll();
    UserModel add(UserModel userModel);
    UserModel update(UserModel userModel);
    Optional<UserModel> findById(Long id);
    void deleteUserById(Long id);
}
