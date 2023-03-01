package com.lewis.discount.services.contracts;

import com.lewis.discount.domain.entities.Discount;

public interface DiscountService {
    Discount get(String discountCode);
}
