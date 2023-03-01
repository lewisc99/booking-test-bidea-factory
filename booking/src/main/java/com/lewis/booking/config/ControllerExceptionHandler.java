package com.lewis.booking.config;


import com.lewis.booking.domain.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> ValidationBodyException(MethodArgumentNotValidException exception, HttpServletRequest request)
    {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(status.value());
        errorResponse.setError(status.getReasonPhrase());

        exception.getBindingResult().getAllErrors().forEach((error) -> {
          errorResponse.getMessage().add(error.getDefaultMessage());
        });

        return ResponseEntity.status(status).body(errorResponse);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ErrorResponse> MessageNotReadable(HttpMessageNotReadableException exception, HttpServletRequest request)
    {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(status.value());
        errorResponse.setError(status.getReasonPhrase());

        errorResponse.getMessage().add(exception.getCause().getMessage());

        return ResponseEntity.status(status).body(errorResponse);
    }

}
