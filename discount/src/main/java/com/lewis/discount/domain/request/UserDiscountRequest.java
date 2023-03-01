package com.lewis.discount.domain.request;

import com.lewis.discount.domain.entities.Discount;

public class UserDiscountRequest {

    private String userId;
    private String houseId;
    private Discount discountCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public Discount getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(Discount discountCode) {
        this.discountCode = discountCode;
    }
}
