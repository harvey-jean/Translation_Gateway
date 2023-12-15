package com.jean.task.entity;

import lombok.Builder;

import java.util.UUID;

@Builder
public record User(UUID id, String name, int age, String language) {
    public static User create(String name, int age, String language){
        UUID id = UUID.randomUUID();
        return User.builder()
                .id(id)
                .name(name)
                .age(age)
                .language(language)
                .build();
    }
}
