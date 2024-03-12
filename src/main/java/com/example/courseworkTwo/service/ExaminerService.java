package com.example.courseworkTwo.service;

import com.example.courseworkTwo.dto.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}