package com.exam.model.exam;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quesId;
    @Column(length = 5000)
    private String Content;
    private String image;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;

    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;

    public Question() {
    }
}
