package com.capstone.dto;

import lombok.Getter;

@Getter
public class PostDto {
    private Integer pId;
    private String title;
    private String orderTime;
    private String postTime;
    private String shootingUser;
    private String pLocation;
    private Integer uId;
    private Integer rId;

    @Override
    public String toString() {
        return "PostDto{" +
                "pId=" + pId +
                ", title='" + title + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", postTime='" + postTime + '\'' +
                ", shootingUser='" + shootingUser + '\'' +
                ", pLocation='" + pLocation + '\'' +
                ", uId=" + uId +
                ", rId=" + rId +
                '}';
    }
}
