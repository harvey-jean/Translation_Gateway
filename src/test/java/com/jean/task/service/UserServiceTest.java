package com.jean.task.service;

import com.jean.task.dto.UserDto;
import com.jean.task.entity.User;
import com.jean.task.repository.UserDataProvider;
import org.junit.jupiter.api.Test;

import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void itShouldTest_CreateUser_Successfully() {

        //Given
        UserService userService = new UserService();
        User user = User.create("Jean", 30, "en");

        //When
        UUID createdUserId = userService.createUser(user);
        UUID expectedUserId = UserDataProvider.users.get(createdUserId).id();

        //Then
        assertEquals(expectedUserId, createdUserId);
    }

    @Test
    void itShouldTest_FindUserById_Successfully() {
        //Given
        UserService userService = new UserService();
        User user = User.create("Jean", 30, "en");

        //When
        UUID createdUserId = userService.createUser(user);
        UserDto findUserById = userService.findUserById(createdUserId);
        UserDto expectedUser = UserDto.createFrom(user);

        //Then
        assertEquals(expectedUser, findUserById);
    }

    @Test
    void itShouldTest_FindUserById_UserNotFound() {
        //Given
        UserService userService = new UserService();
        User user = User.create("Jean", 30, "en");

        //When
        userService.createUser(user);
        UUID userIdToBeSearched = UUID.randomUUID();
        UserDto findUserById = userService.findUserById(userIdToBeSearched);

        //Then
        assertNull(findUserById);
    }
}