package com.capstone.mapper;

import com.capstone.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public void insertUser(UserDto userDto);
}
