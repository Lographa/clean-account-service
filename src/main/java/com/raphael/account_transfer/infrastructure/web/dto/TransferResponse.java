package com.raphael.account_transfer.infrastructure.web.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.*;

public record TransferResponse(
                @NotNull Long id,
                @NotNull AccountResponse fromAccount,
                @NotNull AccountResponse toAccount,
                @NotNull @Positive BigDecimal amount,
                @NotNull String status) {

}
