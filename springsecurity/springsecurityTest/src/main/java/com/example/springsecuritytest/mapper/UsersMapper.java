package com.example.springsecuritytest.mapper;

import com.example.springsecuritytest.pojo.Menu;
import com.example.springsecuritytest.pojo.Role;
import com.example.springsecuritytest.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public class UsersMapper {

    List<Users> selectByUserName(String username);

    List<Role> selectRoleByUserId(Integer userId);

    List<Menu> selectMenuByUserId(Integer userId);




}
