package edu.tumo.banking.controller;

import edu.tumo.banking.domain.employee.model.EmployeeModel;
import edu.tumo.banking.domain.user.UserModel;
import edu.tumo.banking.repository.validation.UserValidation;
import edu.tumo.banking.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserValidation userValidation;

    @Autowired
    public UserController(UserService userService, UserValidation userValidation) {
        this.userService = userService;
        this.userValidation = userValidation;
    }

    @PostMapping
    public ResponseEntity<UserModel> adduser(@RequestBody UserModel user){
        if(!(userValidation.validateForNull(user)))
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(userService.add(user), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> findUsers() {
        List<UserModel> user = userService.findAll();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> findUserById(@PathVariable Long id){
        Optional<UserModel> model=userService.findById(id);
        return new ResponseEntity<>(model.get(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<UserModel> updateUser(@RequestBody UserModel updatedUser){
        if(!(userValidation.validateForNull(updatedUser)))
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(userService.update(updatedUser), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
