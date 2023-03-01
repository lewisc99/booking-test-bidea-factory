package com.lewis.booking.controller;

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
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<Book> create(@RequestBody BookRequest bookRequest)
    {
        Book book =  convertToBook(bookRequest);
        return ResponseEntity.ok(book);
    }

    public  Book convertToBook(BookRequest bookRequest) {

            Book book = mapper.map(bookRequest, Book.class);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
            LocalDate localDateStart = LocalDate.parse(bookRequest.getStartDate(), formatter);
            LocalDate localDateEnd = LocalDate.parse(bookRequest.getEndDate(), formatter);
            book.setStartDate(localDateStart);
            book.setEndDate(localDateEnd);
            return book;
    }
}
