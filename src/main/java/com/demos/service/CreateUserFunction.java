package com.demos.service;

import com.demos.model.CreateUserRequest;
import com.demos.model.User;
import com.demos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CreateUserFunction implements Function<CreateUserRequest, CreateUserRequest> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CreateUserRequest apply(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setName(createUserRequest.getName());
        user.setEmail(createUserRequest.getEmail());
        userRepository.save(user);
        return createUserRequest;
    }
}
