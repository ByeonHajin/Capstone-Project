package com.capstone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class PostDto {
    private int pId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("order_time")
    private LocalDateTime orderTime;
    @JsonProperty("post_time")
    private LocalDateTime postTime;
    @JsonProperty("shooting_user")
    private String shootingUser;
    @JsonProperty("p_location")
    private String pLocation;
    @JsonProperty("u_id")
    private int uId;
    @JsonProperty("r_id")
    private int rId;


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
