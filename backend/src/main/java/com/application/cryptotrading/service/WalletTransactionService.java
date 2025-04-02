package com.application.cryptotrading.service;

import com.application.cryptotrading.domain.WalletTransactionType;
import com.application.cryptotrading.model.Wallet;
import com.application.cryptotrading.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
