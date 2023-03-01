package com.lewis.booking.config;


import com.lewis.booking.domain.entities.Book;
import com.lewis.booking.domain.request.BookRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class ConvertTo {

    @Autowired
    private ModelMapper mapper;

    public Book  Book(BookRequest bookRequest) {

        Book book = mapper.map(bookRequest, Book.class);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        LocalDate localDateStart = LocalDate.parse(bookRequest.getStartDate(), formatter);
        LocalDate localDateEnd = LocalDate.parse(bookRequest.getEndDate(), formatter);
        book.setStartDate(localDateStart);
        book.setEndDate(localDateEnd);
        return book;
    }
}
