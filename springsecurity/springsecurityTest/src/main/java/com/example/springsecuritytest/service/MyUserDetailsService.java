package com.example.springsecuritytest.service;

import com.example.springsecuritytest.mapper.UsersMapper;
import com.example.springsecuritytest.pojo.Menu;
import com.example.springsecuritytest.pojo.Role;
import com.example.springsecuritytest.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService{
    @Autowired
    private UsersMapper usersMapper;

    @Override
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersMapper.selectByUserName(username);
        if (users == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        //查询 权限 和 角色  然后 封装到 User 中
        List<GrantedAuthority> auths = new ArrayList<>();
        //查询用户角色列表
        List<Role> roles = usersMapper.selectRoleByUserId(users.getId());
        //查询用户权限列表
        List<Menu> menus = usersMapper.selectMenuByUserId(users.getId());

        //处理角色  拼接   ROLE_xxx
        for (Role role : roles) {
            auths.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
        }
        //处理权限
        for (Menu menu : menus) {
            auths.add(new SimpleGrantedAuthority(menu.getPermission()));
        }

        // 注意  new User(String username, String password, Collection<? extends GrantedAuthority> authorities)
        // 这第二个参数 是加密之后的 密码
        return new User(users.getUsername(), users.getPassword(), auths);
    }


}


}
