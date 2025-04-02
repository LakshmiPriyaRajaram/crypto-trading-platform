package com.application.cryptotrading.repository;

import com.application.cryptotrading.domain.WalletTransactionType;
import com.application.cryptotrading.model.Wallet;
import com.application.cryptotrading.model.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
