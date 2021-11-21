package edu.tumo.banking.domain.user;

public class UserModel {

    Integer userId;
    String username;
    String password;

    public UserModel() {
    }

    public UserModel(Integer userId, String userLogin, String password) {
        this.userId = userId;
        this.username = userLogin;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUserLogin(String userLogin) {
        this.username = userLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
