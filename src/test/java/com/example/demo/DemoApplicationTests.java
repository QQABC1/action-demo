package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private DemoApplication demoApplication;

    @Test
    void contextLoads() {
        // 测试 Spring 容器能否正常启动
    }

    @Test
    void testSayHello() {
        // 测试我们的业务逻辑
        String result = demoApplication.sayHello();
        // 断言：如果不等于 "Hello Action"，测试就会失败
        Assertions.assertEquals("Hello Action", result);
    }
}