package com.lewis.booking.controller;

import com.lewis.booking.config.ConvertTo;
import com.lewis.booking.domain.entities.Book;
import com.lewis.booking.domain.request.BookRequest;
import com.lewis.booking.domain.response.BookResponse;
import com.lewis.booking.service.contracts.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@RestController
@RequestMapping(value = "book")
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private ConvertTo convertTo;

    @PostMapping
    public ResponseEntity<BookResponse> create(@RequestBody BookRequest bookRequest)
    {
        Book book =  convertTo.Book(bookRequest);
        BookResponse result = bookService.create(book);
        return ResponseEntity.ok(result);
    }

}
