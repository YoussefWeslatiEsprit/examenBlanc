package com.example.exam2.services;

import com.example.exam2.entities.User;
import com.example.exam2.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService{
    private final UserRepository userRepository;



    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void assignProjectToUser(int projectId, int userId) {
        Project = ;
    }

}
