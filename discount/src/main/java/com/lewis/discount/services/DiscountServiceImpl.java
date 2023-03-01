package com.lewis.discount.services;

import com.lewis.discount.domain.entities.Discount;
import com.lewis.discount.repositories.DiscountRepository;
import com.lewis.discount.services.contracts.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public boolean get(String discountCode) {
       Optional<Discount> discount =  discountRepository.findByDiscountCode(discountCode);
       return !discountCode.isEmpty();
    }
}
