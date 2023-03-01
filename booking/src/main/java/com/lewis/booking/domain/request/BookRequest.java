package com.lewis.booking.domain.request;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class BookRequest {

    @Size(min = 9,max = 10, message = "ID must have minimum 9 and max 10 characters")
    @NotNull(message = "id cannot be null")
    private String id;

    @Size(min = 2,max = 50, message = "Name must have minimum 2 and max 50 characters")
    @NotNull(message = "Name cannot be null")
    private String name;

    @Size(min = 2,max = 50, message = "Last name must have minimum 2 and max 50 characters")
    @NotNull(message = "lastName cannot be null")
    private String lastName;
    @Range(min=18, max=100, message = "Age must between 18 and 100")
    @NotNull(message = "Age cannot be null")
    private Number age;

    @Size(min = 9,max = 20, message = "Phone Number must have minimum 9 and max 20 characters")
    @NotNull(message = "phone Number cannot be null")
    private String phoneNumber;
    @NotNull(message = "start Date Number cannot be null")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime startDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "End Date Number cannot be null")
    private LocalDateTime endDate;

    @Size(min = 6,max = 15, message = "HouseID must have minimum 6 length and max 15 characters")
    @NotNull(message = "House Id Number cannot be null")
    private String houseId;

    @Size(min = 8,max = 8, message = "HouseID must have minimum 8 length and max 8 characters")
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

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
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
