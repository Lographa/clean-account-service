package com.raphael.account_transfer.infrastructure.persistence.gateway;

import java.util.List;

import com.raphael.account_transfer.application.gateway.TransferGateway;
import com.raphael.account_transfer.domain.model.Transfer;
import com.raphael.account_transfer.infrastructure.persistence.mapper.TransferEntityMapper;
import com.raphael.account_transfer.infrastructure.persistence.repository.TransferRepository;

public class TransferRepositoryGateway implements TransferGateway {
    private final TransferRepository repository;
    private final TransferEntityMapper mapper;

    public TransferRepositoryGateway(TransferRepository repository, TransferEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<Transfer> findAll() {
        return repository.findAllWithAccounts().stream().map(mapper::toDomain).toList();
    }
}
