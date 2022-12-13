package com.exam.controller;

import com.exam.model.exam.Quiz;
import com.exam.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("*")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/")
    public ResponseEntity<?> add(@RequestBody Quiz quiz){
        return ResponseEntity.ok(this.quizService.addQuiz(quiz));
    }

    @PutMapping("/")
    public ResponseEntity<?> UpdateQuiz(@RequestBody Quiz quiz){
        return ResponseEntity.ok(this.quizService.UpdateQuiz(quiz));
    }

    @GetMapping("/")
    public ResponseEntity<?> quizzed(){
        return ResponseEntity.ok(this.quizService.getQuizzes());
    }

    @GetMapping("/{quizId}")
    public Quiz quiz(@PathVariable("quizId") Long quizId){
        return this.quizService.getQuiz(quizId);
    }

    @DeleteMapping("/{qid}")
    public void delete(@PathVariable("qid") Long qid){
        this.quizService.deleteQuiz(qid);
    }

}
