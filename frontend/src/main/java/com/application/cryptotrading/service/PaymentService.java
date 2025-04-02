package com.application.cryptotrading.service;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.application.cryptotrading.domain.PaymentMethod;
import com.application.cryptotrading.model.PaymentOrder;
import com.application.cryptotrading.model.User;
import com.application.cryptotrading.response.PaymentResponse;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProccedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              Long orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}
