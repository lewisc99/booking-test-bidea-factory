package com.lewis.booking.domain.request;

import javax.validation.constraints.NotNull;

public class BookRequest {

    @NotNull(message = "id cannot be null")
    private String id;

    @NotNull(message = "Name cannot be null")
    private String name;

    @NotNull(message = "lastName cannot be null")
    private String lastName;

    @NotNull(message = "Age cannot be null")
    private Number age;

    @NotNull(message = "phone Number cannot be null")
    private String phoneNumber;

    @NotNull(message = "start Date Number cannot be null")
    private String startDate;
    @NotNull(message = "End Date Number cannot be null")
    private String endDate;
    @NotNull(message = "House Id Number cannot be null")
    private String houseId;

    @NotNull(message = "Discount Id Number cannot be null")
    private String discountCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }
}
