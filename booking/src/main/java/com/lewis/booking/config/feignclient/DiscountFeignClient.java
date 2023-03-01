package com.lewis.booking.config.feignclient;

import com.lewis.booking.domain.request.UserDiscountRequest;
import com.lewis.booking.domain.response.UserDiscountResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name="discount")
public interface DiscountFeignClient {

    @PostMapping(value="discount/v1/new")
    ResponseEntity<UserDiscountResponse> findByEmail(@RequestBody UserDiscountRequest userDiscountRequest);
}
