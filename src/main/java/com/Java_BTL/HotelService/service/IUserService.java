package com.Java_BTL.HotelService.service;

import com.Java_BTL.HotelService.model.User;

import java.util.List;



public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
