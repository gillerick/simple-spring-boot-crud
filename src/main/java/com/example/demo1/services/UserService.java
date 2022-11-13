package com.example.demo1.services;

import com.example.demo1.models.UserEntity;
import com.example.demo1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;

  public UserEntity createUser(UserEntity user) {
    //Validations: Check if first name is provided
    //Logging
    return userRepository.save(user);
  }
}
