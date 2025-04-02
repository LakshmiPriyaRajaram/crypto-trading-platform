package com.application.cryptotrading.repository;

import com.application.cryptotrading.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
