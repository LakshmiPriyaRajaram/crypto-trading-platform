package com.application.cryptotrading.request;

import com.application.cryptotrading.domain.OrderType;

import com.application.cryptotrading.model.Coin;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
