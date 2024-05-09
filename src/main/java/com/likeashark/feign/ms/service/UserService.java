package com.likeashark.feign.ms.service;

import com.likeashark.feign.ms.client.UserClient;
import com.likeashark.feign.ms.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserClient client;

    public List<UserDto> getUsers() {
       List<UserDto> response = client.getUsers();
       return response;
    }

    public void saveUser(UserDto user){
      client.saveUser(user);
    }

    public void updateUser(Integer id, UserDto user){}



    public void deleteUser(Integer id){}
}
