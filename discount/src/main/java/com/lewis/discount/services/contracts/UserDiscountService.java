package com.lewis.discount.services.contracts;

import com.lewis.discount.domain.request.UserDiscountRequest;
import com.lewis.discount.domain.response.UserDiscountResponse;

public interface UserDiscountService {

    UserDiscountResponse create(UserDiscountRequest userDiscountRequest);
}
