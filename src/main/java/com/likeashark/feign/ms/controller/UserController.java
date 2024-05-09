package com.likeashark.feign.ms.controller;

import com.likeashark.feign.ms.dto.UserDto;
import com.likeashark.feign.ms.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getALL(){
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody UserDto user){
        userService.saveUser(user);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUser(@PathVariable("id") Integer id,@RequestBody UserDto user){
        userService.updateUser(id,user);
    }


    @DeleteMapping
    public void deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
    }



}
