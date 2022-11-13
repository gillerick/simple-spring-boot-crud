package com.example.demo1.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String firstName;
  String LastName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", LastName='" + LastName + '\'' +
        '}';
  }
}
