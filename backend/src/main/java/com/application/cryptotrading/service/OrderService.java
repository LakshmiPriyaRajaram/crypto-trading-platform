package com.application.cryptotrading.service;

import com.application.cryptotrading.domain.OrderType;
import com.application.cryptotrading.model.Coin;
import com.application.cryptotrading.model.Order;
import com.application.cryptotrading.model.OrderItem;
import com.application.cryptotrading.model.User;
import com.application.cryptotrading.request.CreateOrderRequest;


import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}
