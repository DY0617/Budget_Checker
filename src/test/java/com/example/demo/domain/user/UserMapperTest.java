package com.example.demo.domain.user;


import com.example.demo.common.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
