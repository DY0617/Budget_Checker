package com.example.demo.domain.accountBook;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@RequiredArgsConstructor
@Controller
public class AccountBookController {

    @GetMapping("/account")
    public String openAccountMain(Model model) {

        return "account/main";
    }
}
