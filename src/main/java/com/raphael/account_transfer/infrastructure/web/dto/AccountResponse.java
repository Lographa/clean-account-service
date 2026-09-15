package com.raphael.account_transfer.infrastructure.web.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.*;

public record AccountResponse(
                @NotNull Long id,
                @NotNull String owner,
                @NotNull @Positive BigDecimal balance) {

}
