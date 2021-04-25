package com.project.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

}
