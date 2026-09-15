package com.raphael.account_transfer.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphael.account_transfer.infrastructure.entities.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

}
