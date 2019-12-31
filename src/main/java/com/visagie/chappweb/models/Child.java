package com.visagie.chappweb.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;

    public Child(String name) {
        this.name = name;
    }
}
