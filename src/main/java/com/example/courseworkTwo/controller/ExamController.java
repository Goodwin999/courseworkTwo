package com.example.courseworkTwo.controller;

import com.example.courseworkTwo.service.ExaminerService;
import com.example.courseworkTwo.dto.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/get")
public class ExamController {

    private final ExaminerService examinerService;


    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }


    @GetMapping
    public Collection<Question> getQuestions(int amount) {
        return examinerService.getQuestions(amount);

    }
}