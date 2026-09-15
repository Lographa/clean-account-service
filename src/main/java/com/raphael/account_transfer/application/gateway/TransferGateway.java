package com.raphael.account_transfer.application.gateway;

import java.util.List;

import com.raphael.account_transfer.domain.model.Transfer;

public interface TransferGateway {
    List<Transfer> findAll();
}
