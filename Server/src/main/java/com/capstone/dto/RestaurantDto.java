package com.capstone.dto;

import lombok.Getter;

@Getter
public class RestaurantDto {
    private Integer rId;
    private String rName;
    private String category;
    private Integer minPrice;
    private String orderFee;

    @Override
    public String toString() {
        return "RestaurantDto{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", category='" + category + '\'' +
                ", minPrice=" + minPrice +
                ", orderFee='" + orderFee + '\'' +
                '}';
    }
}
