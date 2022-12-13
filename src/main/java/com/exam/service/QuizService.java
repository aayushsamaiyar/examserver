package com.exam.service;

import com.exam.model.exam.Quiz;

import java.util.Set;

public interface QuizService {
    public Quiz addQuiz(Quiz quiz);
    public Quiz UpdateQuiz(Quiz quiz);
    public Set<Quiz> getQuizzes();
    public Quiz getQuiz(Long QuizId);
    public void deleteQuiz(Long QuizId);
}
