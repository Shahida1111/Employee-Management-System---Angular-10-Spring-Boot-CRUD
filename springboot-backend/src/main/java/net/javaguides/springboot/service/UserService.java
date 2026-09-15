package net.javaguides.springboot.service;

import net.javaguides.springboot.model.User;

public interface UserService  {

    User registerUser(User user);

    User loginUser(String email, String password);
}
