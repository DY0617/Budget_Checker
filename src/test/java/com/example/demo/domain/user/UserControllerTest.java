package com.example.demo.domain.user;

import com.example.demo.common.security.auth.CustomAuthFailureHandler;
import com.example.demo.common.security.auth.CustomUserDetailsService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserControllerTest.class)
public class UserControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    UserService userService;

    @MockBean
    CustomUserDetailsService customUserDetailsService;

    @MockBean
    AuthenticationFailureHandler authenticationFailureHandler;



    @BeforeAll
    static void beforeAll(){
        System.out.println("====================== UserControllerTest Start ======================");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("======================= UserControllerTest End =======================");
    }

    @Test
    @DisplayName("회원가입 테스트")
    void joinProc() throws Exception{

    }

}
