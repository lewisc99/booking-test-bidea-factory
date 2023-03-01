package com.lewis.discount.domain.response;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponse {

    private int statusCode;
    private String error;
    private List<String> message = new ArrayList<String>();

    public ErrorResponse() {
    }

    public ErrorResponse(int statusCode, String error, List<String> message) {
        this.statusCode = statusCode;
        this.error = error;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }
}
