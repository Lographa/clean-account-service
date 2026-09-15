package com.raphael.account_transfer.infrastructure.web.mapper;

import org.springframework.stereotype.Component;

import com.raphael.account_transfer.domain.model.Transfer;
import com.raphael.account_transfer.infrastructure.web.dto.TransferResponse;

@Component
public class TransferDtoMapper {
    private final AccountDtoMapper accountDtoMapper;

    public TransferDtoMapper(AccountDtoMapper accountDtoMapper) {
        this.accountDtoMapper = accountDtoMapper;
    }

    public TransferResponse toResponse(Transfer transfer) {
        return new TransferResponse(transfer.id(), accountDtoMapper.toResponse(transfer.fromAccount()),
                accountDtoMapper.toResponse(transfer.toAccount()), transfer.amount(), transfer.status().name());
    }
}
