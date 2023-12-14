package com.jean.task.dto;

public record UserDto(String name, int age, String language) {

    public static UserDto create(String name, int age, String language){
        return new UserDto(name, age, language);
    }

}
