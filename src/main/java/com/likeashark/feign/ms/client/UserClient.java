package com.likeashark.feign.ms.client;

import com.likeashark.feign.ms.configuration.FeignClientConfig;
import com.likeashark.feign.ms.dto.UserDto;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}", configuration= FeignClientConfig.class)
public interface UserClient {

    @GetMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<UserDto> getUsers();

    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    UserDto saveUser(@RequestBody UserDto dto);

}
