package com.lewis.discount.services;

import com.lewis.discount.domain.entities.Discount;
import com.lewis.discount.repositories.DiscountRepository;
import com.lewis.discount.services.contracts.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Transactional
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountRepository discountRepository;
    @Override
    public Discount get(String discountCode) {
       Optional<Discount> discount =  discountRepository.findByDiscountCode(discountCode);
       if(discount.isEmpty())
           throw new NullPointerException();
       return discount.get();
    }
}
