package com.lewis.booking.controller;

import com.lewis.booking.domain.request.BookRequest;
import com.lewis.booking.domain.response.BookResponse;
import com.lewis.booking.service.contracts.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "book")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private

    @PostMapping
    public ResponseEntity<BookResponse> create(@RequestBody BookRequest bookRequest)
    {

        return ResponseEntity.ok(bookResponse);
    }
}
