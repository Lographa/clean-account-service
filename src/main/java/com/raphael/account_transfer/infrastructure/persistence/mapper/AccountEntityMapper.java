package com.raphael.account_transfer.infrastructure.persistence.mapper;

import org.springframework.stereotype.Component;

import com.raphael.account_transfer.domain.model.Account;
import com.raphael.account_transfer.infrastructure.entities.AccountEntity;

@Component
public class AccountEntityMapper {

    public Account toDomain(AccountEntity entity) {
        return new Account(entity.getId(), entity.getOwner(), entity.getBalance());
    }
}
