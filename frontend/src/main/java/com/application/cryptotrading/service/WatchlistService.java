package com.application.cryptotrading.service;

import com.application.cryptotrading.model.Coin;
import com.application.cryptotrading.model.User;
import com.application.cryptotrading.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
