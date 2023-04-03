package com.example.demo.domain.user;


import com.example.demo.common.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void userJoin() {
        UserDto.Request user = new UserDto.Request();
        user.setEmail("12123dasdf@gmail.com");
        user.setPassword("ehdduq0617!");
        user.setNickname("테스터123");
        user.setUsername("brassdong1");
        userService.userJoin(user);
        System.out.println("유저 생성");
    }




    @Test
    void userUpdate() {


        UserDto.Request user = new UserDto.Request();
        user.setId(1L);
        user.setEmail("brassdong@gmail.com");
        user.setPassword("ehdduq0617!");
        user.setNickname("첫계정");
        user.setUsername("brassdong");
        userService.updateMember(user);
    }


}
