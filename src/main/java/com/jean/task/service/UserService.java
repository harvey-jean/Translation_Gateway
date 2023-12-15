package com.jean.task.service;

import com.jean.task.dto.UserDto;
import com.jean.task.entity.User;
import com.jean.task.repository.UserDataProvider;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    public UUID createUser(final User newUser){
        return UserDataProvider
                .saveUser(newUser)
                .id();
    }

    public UserDto findUserById(final UUID id){
        User user = UserDataProvider.findUserById(id);
        return (user != null) ? UserDto.createFrom(user) : null;
    }

}
