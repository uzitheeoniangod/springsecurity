package com.example.springsecuritytest.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("users")
public class Users {
    private Integer id;
    private String username;
    private String password;

}
