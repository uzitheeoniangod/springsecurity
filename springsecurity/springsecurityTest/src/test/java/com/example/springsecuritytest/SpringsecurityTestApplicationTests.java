package com.example.springsecuritytest;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan(basePackages = {"com.example.springsecuritytest.mapper"})
class SpringsecurityTestApplicationTests {

    @Test
    void contextLoads() {
    }

}
