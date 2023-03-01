package com.lewis.booking.service.contracts;

import com.lewis.booking.config.InvalidDiscountException;
import com.lewis.booking.domain.entities.Book;
import com.lewis.booking.domain.response.BookResponse;

public interface BookService {
    BookResponse create(Book bookRequest);
}
