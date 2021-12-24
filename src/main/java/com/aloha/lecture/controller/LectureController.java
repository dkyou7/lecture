package com.aloha.lecture.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("lec")
public class LectureController {

    @GetMapping("list")
    public String lectureList(){
        return "lec/lectureList";
    }
}
