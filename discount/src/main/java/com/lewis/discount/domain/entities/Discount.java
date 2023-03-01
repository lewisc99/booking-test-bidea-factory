package com.lewis.discount.domain.entities;


import javax.persistence.*;

@Entity
@Table(name="tb_discount")
public class Discount {

    @Id
    private  Integer id;
    private String discountCode;

    @OneToMany(mappedBy = "discountCode")
    private UserDiscount userDiscount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }
}
