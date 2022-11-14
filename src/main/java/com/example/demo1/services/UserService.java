package com.example.demo1.services;

import com.example.demo1.models.UserEntity;
import com.example.demo1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

//TODO: Add Validations and logging
@Service
public class UserService {
  @Autowired
  UserRepository userRepository;

  public UserEntity createUser(UserEntity user) {
    return userRepository.save(user);
  }

  @Transactional
  public UserEntity updateUser(UserEntity user) {
    userRepository.findById(user.getId())
        .ifPresent(userEntity1 -> {
          userEntity1.setFirstName(user.getFirstName());
          userEntity1.setLastName(user.getLastName());

          userRepository.save(userEntity1);
        });
    return user;
  }

  public Optional<UserEntity> fetchUser(Long userId) {
    return userRepository.findById(userId);
  }

  public List<UserEntity> fetchAllUsers() {
    return userRepository.findAll();
  }

  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }

  public List<UserEntity> fetchByFirstName(String name){
    return userRepository.findByFirstName(name);
  }
}
