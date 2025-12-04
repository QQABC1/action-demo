package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // 这里继承了 JpaRepository，自动拥有了 save, findAll 等方法
}