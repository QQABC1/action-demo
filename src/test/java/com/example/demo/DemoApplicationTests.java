package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testDatabaseOperation() {
        System.out.println("开始测试数据库...");

        // 1. 存数据
        UserEntity user = new UserEntity("GitHubActionUser");
        userRepository.save(user);

        // 2. 查数据
        List<UserEntity> users = userRepository.findAll();

        // 3. 断言验证
        Assertions.assertTrue(users.size() > 0, "数据库里应该有数据");
        Assertions.assertEquals("GitHubActionUser", users.get(0).getUsername());

        System.out.println("数据库测试通过！");
    }
}