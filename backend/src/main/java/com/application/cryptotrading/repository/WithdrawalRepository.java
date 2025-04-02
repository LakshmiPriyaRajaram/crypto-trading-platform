package com.application.cryptotrading.repository;

import com.application.cryptotrading.domain.WithdrawalStatus;
import com.application.cryptotrading.model.Withdrawal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal,Long> {
    List<Withdrawal> findByUserId(Long userId);
}
