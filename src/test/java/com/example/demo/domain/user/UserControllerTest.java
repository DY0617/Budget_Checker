package com.example.demo.domain.user;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    UserService userService;

    @BeforeAll
    public void beforeAll(){
        System.out.println("====================== UserControllerTest Start ======================");
    }

    @AfterAll
    public void afterAll(){
        System.out.println("======================= UserControllerTest End =======================");
    }

}
