package com.hou.mapper;

import com.hou.pojo.Users;

import java.util.List;

/**
 * @Author: edison
 * @Date: 2020/1/31 09时22分
 * @Description:
 *
 * 映射器
 * 相当于UserDAO
 * 对应 mapper.xml   mybatis-spring 通过c3p0 把 id statement放入Map中，
 * 对应UserDAO，id=方法名，DAO内实现jdbc，返回结果
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUsersAll();
    /**
     * 好奇怪，用idea 当mapper和xml在同一个目录下时，居然不用配置mapper.xml扫描。sqlsessionfactory也会
     * 自动扫描到这个xml，并实现映射器
     */

}
