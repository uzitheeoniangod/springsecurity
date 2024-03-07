package com.example.springsecuritytest.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("role")

public class Role {
    private Long id;
    private String name;
}
