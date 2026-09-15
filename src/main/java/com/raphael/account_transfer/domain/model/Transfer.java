package com.raphael.account_transfer.domain.model;

import java.math.BigDecimal;

import com.raphael.account_transfer.domain.enums.TransferStatus;

public record Transfer(Long id, Account fromAccount, Account toAccount, BigDecimal amount, TransferStatus status) {

}
