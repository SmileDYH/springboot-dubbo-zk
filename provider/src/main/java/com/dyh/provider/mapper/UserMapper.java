package com.dyh.provider.mapper;

import com.dyh.common.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * description: dyh
 * author: Administrator
 * date: 2021/3/15 0015 15:49
 */
@Mapper
public interface UserMapper {
    @Results(id = "userMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "sex", property = "sex")})
    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT * FROM user t WHERE t.id = #{id}")
    @ResultMap("userMap")
    User getOne(int id);

}
