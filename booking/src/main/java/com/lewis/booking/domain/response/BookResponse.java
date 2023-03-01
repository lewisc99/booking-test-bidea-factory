package com.lewis.booking.domain.response;

public class BookResponse {
    private Number code;
    private  String message;

    public Number getCode() {
        return code;
    }

    public void setCode(Number code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
