package com.lewis.booking.service;

import com.lewis.booking.domain.entities.Book;
import com.lewis.booking.domain.response.BookResponse;
import com.lewis.booking.repository.BookRepository;
import com.lewis.booking.service.contracts.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookResponse create(Book bookRequest) {
        bookRepository.save(bookRequest);
        return new BookResponse(200,"Book Accept");
    }
}
