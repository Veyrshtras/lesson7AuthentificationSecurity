package com.example.lesson7authentificationsecurity.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Tag extends BaseEntity {

    @Column(unique = true)
    private String title;
}
