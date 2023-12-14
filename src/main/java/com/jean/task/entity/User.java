package com.jean.task.entity;

import java.util.UUID;

public record User(UUID id, String name, int age, String language) {
    public static User create(String name, int age, String language){
        UUID id = UUID.randomUUID();
        return new User(id, name, age, language);
    }
}
