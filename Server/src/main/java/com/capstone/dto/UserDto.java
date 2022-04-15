package com.capstone.dto;

import lombok.Getter;

@Getter
public class UserDto {
    private Long uId;
    private String pw;
    private String name;
    private String bank;
    private String account;
    private String location;
    private String phone;

    @Override
    public String toString() {
        return "UserDto{" +
                "uId=" + uId +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", bank='" + bank + '\'' +
                ", account='" + account + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
