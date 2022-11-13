package com.example.demo1.repositories;

import com.example.demo1.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  List<UserEntity> findByFirstName(String name);
}
