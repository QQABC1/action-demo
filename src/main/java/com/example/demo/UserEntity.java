package com.example.demo;

import javax.persistence.Entity; // 注意 JDK 17+ SpringBoot 3+ 都是 jakarta
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    //必须要有的无参构造
    public UserEntity() {}

    public UserEntity(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}