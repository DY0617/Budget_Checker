package com.example.demo.domain.user;

import com.example.demo.common.dto.UserDto;
import com.example.demo.common.security.auth.CustomAuthFailureHandler;
import com.example.demo.common.security.auth.CustomUserDetailsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
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
    static void beforeAll() {
        System.out.println("\n====================== UserControllerTest Start ======================\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("\n======================= UserControllerTest End =======================\n");
    }

    @Autowired
    private WebApplicationContext context;

    @Test
    public void setUp() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    @DisplayName("회원가입 테스트")
    void joinProc() throws Exception {

        UserDto.Request dto = new UserDto.Request();

        dto.setUsername("controllerTest");
        dto.setPassword("test1234!");
        dto.setNickname("test");
        dto.setEmail("signuptest@test.com");


        mvc.perform(MockMvcRequestBuilders.post("/auth/joinProc")
                        .content(new ObjectMapper().writeValueAsString(dto))
                        .contentType(MediaType.APPLICATION_JSON).with(csrf()))
                .andExpect(status().isOk());
    }

}
