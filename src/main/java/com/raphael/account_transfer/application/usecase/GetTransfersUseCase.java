package com.raphael.account_transfer.application.usecase;

import java.util.List;

import com.raphael.account_transfer.application.gateway.TransferGateway;
import com.raphael.account_transfer.domain.model.Transfer;

public class GetTransfersUseCase {
    private final TransferGateway transferGateway;

    public GetTransfersUseCase(TransferGateway transferGateway) {
        this.transferGateway = transferGateway;
    }

    public List<Transfer> execute() {
        return transferGateway.findAll();
    }
}
