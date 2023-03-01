package com.lewis.discount.services;


import com.lewis.discount.domain.entities.Discount;
import com.lewis.discount.domain.entities.UserDiscount;
import com.lewis.discount.domain.request.UserDiscountRequest;
import com.lewis.discount.domain.response.UserDiscountResponse;
import com.lewis.discount.repositories.UserDiscountRepository;
import com.lewis.discount.services.contracts.DiscountService;
import com.lewis.discount.services.contracts.UserDiscountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserDiscountServiceImpl implements UserDiscountService {

    @Autowired
    private UserDiscountRepository userDiscountRepository;

    @Autowired
    private DiscountService discountService;

    @Autowired
    private ModelMapper mapper;

    @Override
    public UserDiscountResponse create(UserDiscountRequest userDiscountRequest) {
       Discount discount = discountService.get(userDiscountRequest.getDiscountCode());

       UserDiscount userDiscount =  mapper.map(userDiscountRequest,UserDiscount.class);
       userDiscount.setDiscountCode(discount);
       UserDiscount userDiscountResult = userDiscountRepository.save(userDiscount);
       UserDiscountResponse userDiscountResponse = mapper.map(userDiscountResult, UserDiscountResponse.class);
       return userDiscountResponse;
    }
}
