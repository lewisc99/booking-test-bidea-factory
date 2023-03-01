package com.lewis.booking.service;

import com.lewis.booking.config.InvalidDiscountException;
import com.lewis.booking.config.feignclient.DiscountFeignClient;
import com.lewis.booking.domain.entities.Book;
import com.lewis.booking.domain.request.UserDiscountRequest;
import com.lewis.booking.domain.response.BookResponse;
import com.lewis.booking.domain.response.UserDiscountResponse;
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

    @Autowired
    private DiscountFeignClient discountFeignClient;

    @Override
    public BookResponse create(Book bookRequest)  {

        UserDiscountRequest userDiscountRequest = new UserDiscountRequest(bookRequest.getId(), bookRequest.getHouseId(),bookRequest.getDiscountCode());
        UserDiscountResponse userDiscountResponse = discountFeignClient.hasDiscount(userDiscountRequest).getBody();

        if(!userDiscountResponse.getStatus())
        {
            throw new InvalidDiscountException("Invalid Discount");
        }
        bookRepository.save(bookRequest);
        return new BookResponse(200,"Book Accept");

    }
}
