package com.example.exam2.services;

import com.example.exam2.entities.User;

public interface IUserService {
    User addUser(User user);
    public void assignProjectToUser (int projectId, int userId);
}
