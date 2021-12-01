package edu.tumo.banking.service.user;

import edu.tumo.banking.domain.user.UserModel;
import edu.tumo.banking.repository.user.UserRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl {

    private final UserRepositoryImp userRepositoryImp;

    @Autowired
    public UserServiceImpl(UserRepositoryImp userRepositoryImp) {
        this.userRepositoryImp = userRepositoryImp;
    }

    public List<UserModel> findUsers(){ return userRepositoryImp.findAll();}

    public UserModel addUser(UserModel user){return userRepositoryImp.add(user);}

    public Optional<UserModel> findUserById(Long id) {return userRepositoryImp.findById(id);}

    public Optional<UserModel> updateUser(UserModel user) {
        UserModel user1= userRepositoryImp.update(user);
        return Optional.of(user1);
    }

    public void deleteUserById(Long id) {userRepositoryImp.deleteUserById(id);}


}
