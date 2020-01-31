package com.hou.service;

import com.hou.mapper.UsersMapper;
import com.hou.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: edison
 * @Date: 2020/1/31 12时09分
 * @Description:
 */
@Service
@Transactional
public class UserServiceImpl implements  UserService {

    @Autowired
    private UsersMapper usersMapper;

    public void addUser(Users users) {
        if(users.getUsername()!=null){
            usersMapper.insertUser(users);

        }


    }
}
