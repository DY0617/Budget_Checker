package com.example.demo.domain.accountBook;

import com.example.demo.common.dto.MessageDto;
import com.example.demo.common.dto.UserDto;
import com.example.demo.common.security.auth.LoginUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@RequiredArgsConstructor
@Controller
public class AccountBookController {

    private final AccountBookService accountBookService;

    // 사용자에게 메시지를 전달하고, 페이지를 리다이렉트 한다.
    private String showMessageAndRedirect(final MessageDto params, Model model) {
        model.addAttribute("params", params);
        return "common/messageRedirect";
    }

    @GetMapping("/account")
    public String openAccountMain(Model model,@LoginUser UserDto.Response user) {
        if(user != null){
            model.addAttribute("user",user);
        }
        return "account/main";
    }
}
