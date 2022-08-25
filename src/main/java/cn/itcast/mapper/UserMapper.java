package cn.itcast.mapper;

import cn.itcast.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    User selectById(int id);
}
