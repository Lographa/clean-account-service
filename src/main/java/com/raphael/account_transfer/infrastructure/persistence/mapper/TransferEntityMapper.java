package com.raphael.account_transfer.infrastructure.persistence.mapper;

import org.springframework.stereotype.Component;

import com.raphael.account_transfer.domain.model.Transfer;
import com.raphael.account_transfer.infrastructure.entities.TransferEntity;

@Component
public class TransferEntityMapper {
    private final AccountEntityMapper accountMapper;

    public TransferEntityMapper(AccountEntityMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    public Transfer toDomain(TransferEntity entity) {
        return new Transfer(entity.getId(), accountMapper.toDomain(entity.getFromAccount()),
                accountMapper.toDomain(entity.getToAccount()), entity.getAmount(), entity.getStatus());
    }
}
