package me.dev.API_development.domain.controller;

import jakarta.validation.Valid;
import me.dev.API_development.domain.dto.UserRecordDTO;
import me.dev.API_development.domain.model.UserModel;
import me.dev.API_development.domain.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    ResponseEntity<Object> findUserById(@PathVariable(value ="id")UUID id){

        UserModel user = userService.findById(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

    @PostMapping
    ResponseEntity<Object> saveUserPost(@RequestBody @Valid UserRecordDTO userDTO) throws BeansException {
        UserModel user = new UserModel();
        BeanUtils.copyProperties(userDTO,user);

        var userCreated = userService.createUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(userCreated.getId()).toUri();
        return ResponseEntity.created(location).body(userCreated);


    }
}
