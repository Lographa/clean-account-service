package com.raphael.account_transfer.infrastructure.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.raphael.account_transfer.infrastructure.entities.TransferEntity;

public interface TransferRepository extends JpaRepository<TransferEntity, Long> {

    @Query("select t from TransferEntity t join fetch t.fromAccount join fetch t.toAccount")
    List<TransferEntity> findAllWithAccounts();
}
