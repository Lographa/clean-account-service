package com.raphael.account_transfer.infrastructure.persistence.gateway;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.raphael.account_transfer.application.gateway.AccountGateway;
import com.raphael.account_transfer.domain.model.Account;
import com.raphael.account_transfer.infrastructure.persistence.mapper.AccountEntityMapper;
import com.raphael.account_transfer.infrastructure.persistence.repository.AccountRepository;

@Component
public class AccountRepositoryGateway implements AccountGateway {
    private final AccountRepository repository;
    private final AccountEntityMapper mapper;

    public AccountRepositoryGateway(AccountRepository repository, AccountEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    // @Override
    // public Optional<Account> findById(Long id) {
    // // TODO Auto-generated method stub
    // return Optional.empty();
    // }

    @Override
    public Optional<Account> findById(Long id) {
        return repository.findById(id).map(mapper::toDomain);
    }

}
