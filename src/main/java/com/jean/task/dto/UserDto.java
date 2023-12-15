package com.jean.task.dto;

import com.jean.task.entity.User;
import lombok.Builder;

@Builder
public record UserDto(String name, int age, String language) {

    public static UserDto createFrom(User user){

        return UserDto.builder()
                .name(user.name())
                .age(user.age())
                .language(user.language())
                .build();
    }

}
