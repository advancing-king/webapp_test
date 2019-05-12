package com.base.mapper;

import com.base.pojo.User;

public interface UserMapper {

  //如果不需要XML配置文件，也可以使用注解,但是java注解对于稍微复杂的语句就会显得力不从心，推荐使用XML书写sql
//  @Select("select * from user where id = #{id}")
  User selectUserById(int id);
}
