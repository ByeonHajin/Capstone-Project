package com.capstone.service;

import com.capstone.dto.UserDto;
import org.springframework.stereotype.Service;


public interface UserService {
    void insertUser(UserDto userDto);

}
