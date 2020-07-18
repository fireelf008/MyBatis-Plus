package com.wsf.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wsf.mp.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from bjz_user_info")
    List<User> findAll();

    @Delete("delete from bjz_user_info where id = #{id}")
    int realDelete(Long id);
}
