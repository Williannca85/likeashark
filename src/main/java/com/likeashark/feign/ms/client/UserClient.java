package com.likeashark.feign.ms.client;

import com.likeashark.feign.ms.configuration.FeignClientConfig;
import com.likeashark.feign.ms.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}", configuration= FeignClientConfig.class)
public interface UserClient {

    @GetMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<UserDto> getUsers();

    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    UserDto saveUser(@RequestBody UserDto dto);


    @PutMapping(value = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    UserDto updateUser(@PathVariable("id") Integer id, @RequestBody UserDto user);

    @DeleteMapping(value = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    UserDto deleteUser(@PathVariable("id") Integer id);

}
