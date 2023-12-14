package com.jean.task.service;

import com.jean.task.dto.UserDto;
import com.jean.task.entity.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserDtoMapper implements Function<User, UserDto> {

    @Override
    public UserDto apply(User user) {
        return UserDto.create(user.name(),
                                user.age(),
                                user.language());
    }
}
