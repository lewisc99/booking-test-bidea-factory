package com.lewis.booking.service.contracts;

import com.lewis.booking.domain.request.BookRequest;

public interface BookService {

    int create(BookRequest bookRequest);
}
