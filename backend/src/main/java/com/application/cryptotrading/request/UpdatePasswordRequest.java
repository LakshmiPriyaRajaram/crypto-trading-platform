package com.application.cryptotrading.request;

import com.application.cryptotrading.domain.VerificationType;
import lombok.Data;

@Data
public class UpdatePasswordRequest {
    private String sendTo;
    private VerificationType verificationType;
}
