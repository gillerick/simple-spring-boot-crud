package com.example.demo1.controllers;

import com.example.demo1.models.UserEntity;
import com.example.demo1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
  @Autowired
  UserService userService;

  @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
  public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
    return ResponseEntity.ok(userService.createUser(userEntity));
  }

  @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
  public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity userEntity) {
    return ResponseEntity.ok(userService.updateUser(userEntity));
  }

  //ToDO: Update user, delete user, fetch user, fetch all users
}
