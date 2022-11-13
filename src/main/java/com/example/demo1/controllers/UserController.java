package com.example.demo1.controllers;

import com.example.demo1.models.UserEntity;
import com.example.demo1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
  @Autowired
  UserService userService;

  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
    return ResponseEntity.ok(userService.createUser(userEntity));
  }

  @RequestMapping(method = RequestMethod.PUT)
  public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity userEntity) {
    return ResponseEntity.ok(userService.updateUser(userEntity));
  }

  @RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
  public ResponseEntity<Void> deleteUser(@RequestParam(name = "userId") Long userId) {
    userService.deleteUser(userId);
    return ResponseEntity.ok(null);
  }

  @RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
  public ResponseEntity<Optional<UserEntity>> getUser(@PathVariable Long userId) {
    return ResponseEntity.ok(userService.fetchUser(userId));
  }

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<List<UserEntity>> getUsers() {
    return ResponseEntity.ok(userService.fetchAllUsers());
  }
}
