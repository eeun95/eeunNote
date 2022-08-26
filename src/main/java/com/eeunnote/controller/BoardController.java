package com.eeunnote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    // 게시글 목록
    @RequestMapping("/list")
    public String list() {
        return "/board/list";
    }

    // 게시글 작성
    @GetMapping("/write")
    public String write() {
        return "/board/write";
    }

    // 게시글 등록
    @PostMapping("/regist")
    public String regist() {
        return "/board/regist";
    }

    // 게시글 확인
    @GetMapping("view")
    public String view() {
        return "/board/view";
    }
}
