package com.jean.task.service;

import com.jean.task.dto.UserDto;
import com.jean.task.entity.User;
import com.jean.task.repository.UserDataProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDtoMapper userDtoMapper;

    public UUID createUser(User newUser){
        return UserDataProvider
                .saveUser(newUser)
                .id();
    }

    public UserDto findUserById(UUID id){
        User user = UserDataProvider.findUserById(id);
        return (user != null) ? userDtoMapper.apply(user) : null;
    }

}
