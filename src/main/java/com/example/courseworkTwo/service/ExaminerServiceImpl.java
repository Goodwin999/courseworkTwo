package com.example.courseworkTwo.service;

import com.example.courseworkTwo.exception.TooManyQuestionsException;
import com.example.courseworkTwo.dto.Question;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private  final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {

        Set<Question> questions = new HashSet<>();

        if(questionService.getAll().size()<amount){
            throw new TooManyQuestionsException("The number of questions requested exceeds" +
                    " the number of available questions.");
        }

        while (questions.size()<amount){
            questions.add(questionService.getRandomQuestion());

        }
        return questions;
    }
}