package com.lewis.discount.controller;

import com.lewis.discount.repositories.DiscountRepository;
import com.lewis.discount.services.contracts.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("discount/v1")
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @GetMapping(value="new/{discountCode}")
    public ResponseEntity<Boolean> get(@PathVariable String discountCode)
    {
        boolean result = discountService.get(discountCode);
        return ResponseEntity.ok(result);
    }
}
