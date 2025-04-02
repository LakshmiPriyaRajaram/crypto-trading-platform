package com.application.cryptotrading.service;

import com.application.cryptotrading.model.PaymentDetails;
import com.application.cryptotrading.model.User;
import jakarta.persistence.OneToOne;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails( String accountNumber,
                                             String accountHolderName,
                                             String ifsc,
                                             String bankName,
                                             User user
    );

    public PaymentDetails getUsersPaymentDetails(User user);


}
