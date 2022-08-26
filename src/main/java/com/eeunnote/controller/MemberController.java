package com.eeunnote.controller;

import com.eeunnote.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    // 회원가입 화면 이동
    @GetMapping("/join")
    public String join() {
        return "join/step1";
    }

    // 회원가입 완료 화면
    @PostMapping("/step1")
    public String step1() {
        return "join/step2";
    }
}
