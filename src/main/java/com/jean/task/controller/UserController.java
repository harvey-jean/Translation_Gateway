package com.jean.task.controller;

import com.jean.task.dto.UserDto;
import com.jean.task.entity.User;
import com.jean.task.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
         UUID userId =  userService.createUser(user);
         return ResponseEntity.ok().body(userId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findUser(@PathVariable UUID id){
        UserDto user = userService.findUserById(id);

        if (user == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(user);
    }


}
