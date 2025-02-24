package me.dev.API_development.domain.service.imp;

import me.dev.API_development.domain.model.UserModel;
import me.dev.API_development.domain.repository.UserRepository;
import me.dev.API_development.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class UserServiceImp implements UserService {


    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserModel findById(UUID id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public UserModel createUser(UserModel userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
