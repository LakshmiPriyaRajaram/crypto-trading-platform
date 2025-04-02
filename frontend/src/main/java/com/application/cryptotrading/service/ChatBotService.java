package com.application.cryptotrading.service;

import com.application.cryptotrading.model.CoinDTO;
import com.application.cryptotrading.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
