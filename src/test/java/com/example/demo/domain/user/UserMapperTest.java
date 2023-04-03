package com.example.demo.domain.user;


import com.example.demo.common.dto.UserDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;


    @Test
    void save() {
        UserDto.Request user = new UserDto.Request();
        user.setEmail("brassdong@gmail.com");
        user.setPassword("ehdduq0617!");
        user.setNickname("테스터");
        user.setUsername("brassdong");

        userMapper.save(user.toEntity());

    }

    @Test
    void findById(){
        Optional<User> post = userMapper.findById(1L);
        try {
            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(post);
            System.out.println(postJson);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
