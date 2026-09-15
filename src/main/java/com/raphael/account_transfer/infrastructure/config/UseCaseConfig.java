package com.raphael.account_transfer.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.raphael.account_transfer.application.gateway.AccountGateway;
import com.raphael.account_transfer.application.gateway.TransferGateway;
import com.raphael.account_transfer.application.usecase.GetAccountUseCase;
import com.raphael.account_transfer.application.usecase.GetTransfersUseCase;

@Configuration
public class UseCaseConfig {

    @Bean
    public GetAccountUseCase getAccountUseCase(AccountGateway accountGateway) {
        return new GetAccountUseCase(accountGateway);
    }

    @Bean
    public GetTransfersUseCase getTransferUseCase(TransferGateway transferGateway) {
        return new GetTransfersUseCase(transferGateway);
    }
}
