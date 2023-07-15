package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}