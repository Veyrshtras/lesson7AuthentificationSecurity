package com.example.lesson7authentificationsecurity.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class QuestionVote extends BaseEntity{

    @ManyToOne
    private Question question;
}
