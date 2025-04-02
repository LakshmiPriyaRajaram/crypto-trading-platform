package com.application.cryptotrading.service;


import com.application.cryptotrading.exception.WalletException;
import com.application.cryptotrading.model.Order;
import com.application.cryptotrading.model.User;
import com.application.cryptotrading.model.Wallet;

import java.math.BigDecimal;

public interface WalletService {


    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;



}
