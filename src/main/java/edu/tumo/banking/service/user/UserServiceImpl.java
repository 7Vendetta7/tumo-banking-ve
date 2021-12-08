package edu.tumo.banking.service.user;

import edu.tumo.banking.domain.user.UserModel;
import edu.tumo.banking.exception.ResourceNotFound;
import edu.tumo.banking.repository.user.UserRepositoryImp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService{

    private final Logger logger = LogManager.getLogger(UserServiceImpl.class);

    private final UserRepositoryImp userRepositoryImp;

    @Autowired
    public UserServiceImpl(UserRepositoryImp userRepositoryImp) {
        this.userRepositoryImp = userRepositoryImp;
    }

    @Override
    @Transactional
    public List<UserModel> findAll() {

        logger.info("The users are found");
        return userRepositoryImp.findAll();
    }

    @Override
    @Transactional
    public UserModel add(UserModel userModel) {



        return userRepositoryImp.add(userModel);
    }

    @Override
    @Transactional
    public UserModel update(UserModel userModel) {

        return userRepositoryImp.update(userModel);
    }

    @Override
    @Transactional
    public UserModel findById(Long id) {
        UserModel userModel = userRepositoryImp.findById(id).orElse(null);
        if(userModel == null) {
            logger.warn("user {} is not found", id);
          //  Throwable e =  "exception of user not found with id " +
          //  throw new ResourceNotFound("ssjhdj"+ e);

        }
        return userRepositoryImp.findById(id).get();
    }

    @Override
    @Transactional
    public void deleteUserById(Long id)
    {

        userRepositoryImp.deleteUserById(id);
    }


}
