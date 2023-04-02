package com.budgetchecker.User;


import com.budgetchecker.domain.user.User;
import com.budgetchecker.domain.user.UserMapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @BeforeAll
    static void beforeAll(){
        System.out.println("################# UserMapper Test Start #################");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("################## UserMapper Test End ##################");
    }

    @Test
    void save() {
        User params = new User();
        params.setId(1L);
        params.setUsername("brassdong");
        params.setPassword("Ehdduq0617!");
        params.setEmail("brassdong@gmail.com");
        params.setNickname("동엽");
        //userMapper.save(params);

    }
}
