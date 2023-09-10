package com.buywithme.orderservice.service;

import com.buywithme.orderservice.dto.OrderRequestDto;

public interface OrderService {
    void placeOrder(OrderRequestDto orderRequest);
}
