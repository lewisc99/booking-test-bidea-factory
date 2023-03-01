package com.lewis.discount.config;
import com.lewis.discount.domain.response.UserDiscountResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<UserDiscountResponse> NotFoundDiscountException(NullPointerException exception, HttpServletRequest request)
    {

        UserDiscountResponse userDiscountResponse = new UserDiscountResponse();
        userDiscountResponse.setStatus(false);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(userDiscountResponse);
    }

}
