package com.lewis.discount.controller;

import com.lewis.discount.domain.request.UserDiscountRequest;
import com.lewis.discount.domain.response.UserDiscountResponse;
import com.lewis.discount.repositories.DiscountRepository;
import com.lewis.discount.services.contracts.DiscountService;
import com.lewis.discount.services.contracts.UserDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("discount/v1")
public class DiscountController {

    @Autowired
    private UserDiscountService discountService;

    @PostMapping(value="new")
    public ResponseEntity<UserDiscountResponse> get(@RequestBody UserDiscountRequest userDiscountRequest)
    {
        UserDiscountResponse userDiscountResponse = discountService.create(userDiscountRequest);
        return ResponseEntity.ok(userDiscountResponse);
    }
}
