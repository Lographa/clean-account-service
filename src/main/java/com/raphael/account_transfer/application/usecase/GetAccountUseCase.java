package com.raphael.account_transfer.application.usecase;

import com.raphael.account_transfer.application.gateway.AccountGateway;
import com.raphael.account_transfer.domain.exception.AccountNotFoundException;
import com.raphael.account_transfer.domain.model.Account;

public class GetAccountUseCase {
    private final AccountGateway accountGateway;

    public GetAccountUseCase(AccountGateway accountGateway) {
        this.accountGateway = accountGateway;
    }

    public Account execute(Long id) {
        return accountGateway.findById(id).orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }
}
