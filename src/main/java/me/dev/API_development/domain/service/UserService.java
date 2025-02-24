package me.dev.API_development.domain.service;

import me.dev.API_development.domain.model.UserModel;

import java.util.UUID;

public interface UserService {
    UserModel findById(UUID id);

    UserModel createUser(UserModel userToCreate);
}
