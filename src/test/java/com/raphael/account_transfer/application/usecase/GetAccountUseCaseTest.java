package com.raphael.account_transfer.application.usecase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.raphael.account_transfer.application.gateway.AccountGateway;
import com.raphael.account_transfer.domain.exception.AccountNotFoundException;
import com.raphael.account_transfer.domain.model.Account;

@ExtendWith(MockitoExtension.class)
class GetAccountUseCaseMockitoTest {

    @Mock
    private AccountGateway accountGateway;

    @InjectMocks
    private GetAccountUseCase useCase;

    @Test
    void deveConsultarOGatewayUmaVezComOIdRecebido() {
        Account conta = new Account(1L, "Raphael", new BigDecimal("1000.00"));
        when(accountGateway.findById(1L)).thenReturn(Optional.of(conta));

        useCase.execute(1L);

        verify(accountGateway, times(1)).findById(1L);
    }

    @Test
    void deveLancarExcecaoQuandoGatewayRetornaVazio() {
        when(accountGateway.findById(anyLong())).thenReturn(Optional.empty());

        assertThrows(AccountNotFoundException.class, () -> useCase.execute(99L));
    }
}