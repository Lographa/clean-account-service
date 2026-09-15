package com.raphael.account_transfer.infrastructure.web.mapper;

import org.springframework.stereotype.Component;

import com.raphael.account_transfer.domain.model.Account;
import com.raphael.account_transfer.infrastructure.web.dto.AccountResponse;

@Component
public class AccountDtoMapper {
    public AccountResponse toResponse(Account account) {
        return new AccountResponse(account.id(), account.owner(), account.balance());
    }

}
