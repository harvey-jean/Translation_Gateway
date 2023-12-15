package com.jean.task.service;

import com.jean.task.dto.UserDto;
import com.jean.task.entity.User;
import com.jean.task.repository.UserDataProvider;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Test
    void testCreateUser() {

        //Given
        UserDtoMapper userDtoMapper = new UserDtoMapper();
        UserService userService = new UserService(userDtoMapper);
        User user = User.create("Jean", 30, "en");

        //When
        UUID createdUserId = userService.createUser(user);
        UUID expectedUserId = UserDataProvider.users.get(createdUserId).id();

        //Then
        assertEquals(expectedUserId, createdUserId);
    }

    @Test
    void testFindUserById() {
        //Given
        UserDtoMapper userDtoMapper = new UserDtoMapper();
        UserService userService = new UserService(userDtoMapper);
        User user = User.create("Jean", 30, "en");

        //When
        UUID createdUserId = userService.createUser(user);
        UserDto findUserById = userService.findUserById(createdUserId);
        UserDto expectedUser = userDtoMapper.apply(user);

        //Then
        assertEquals(expectedUser, findUserById);
    }
}