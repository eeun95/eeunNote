package com.eeunnote.controller;

import com.eeunnote.domain.Member;
import com.eeunnote.service.MemberService;
import com.eeunnote.validator.MemberValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/member")
public class MemberController {

    private MemberService memberService;

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    // 회원가입 화면 이동
    @GetMapping("/join")
    public String join() {
        return "join/step1";
    }

    // 회원가입 완료 화면
    @PostMapping("/join")
    public String step1(@Valid Member member, Errors errors) {
        new MemberValidator().validate(member, errors);
        if (errors.hasErrors()) {
            return "error/error";
        }
        try {
            memberService.join(member);
            return "register/step3";
        } catch(Exception e) {

        }
        return "join/step2";
    }
}
