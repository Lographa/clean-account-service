package com.raphael.account_transfer.application.gateway;

import java.util.Optional;

import com.raphael.account_transfer.domain.model.Account;

public interface AccountGateway {
    Optional<Account> findById(Long id);
}
