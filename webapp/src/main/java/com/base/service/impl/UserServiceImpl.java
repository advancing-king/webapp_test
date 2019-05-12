package com.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.mapper.UserMapper;
import com.base.pojo.User;
import com.base.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;
  
  public User selectUserById(int id) {
    // TODO Auto-generated method stub
    return userMapper.selectUserById(id);
  }

}
