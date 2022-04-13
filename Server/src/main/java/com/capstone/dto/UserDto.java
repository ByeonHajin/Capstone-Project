package com.capstone.dto;

public class UserDto {
    private Long uId;
    private String pw;
    private String name;
    private String account;
    private String location;
    private String phone;

    @Override
    public String toString() {
        return "UserDto{" +
                "uId=" + uId +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
