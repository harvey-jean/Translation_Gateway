package com.jean.task.repository;

import com.jean.task.constant.CustomizedMessageProvider;
import com.jean.task.entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserDataProvider {
    private static final Map<UUID, User> users = new HashMap<>();

    public static User saveUser(User user){
        User newUser = User.create(user.name(), user.age(), user.language());
        users.put(newUser.id(), newUser);
        return newUser;
    }

    public static User findUserById(UUID id){
        return users.get(id);
    }
}
