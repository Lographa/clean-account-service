package com.raphael.account_transfer.infrastructure.web.controller;

import org.springframework.web.bind.annotation.*;

import com.raphael.account_transfer.application.usecase.GetAccountUseCase;
import com.raphael.account_transfer.infrastructure.web.dto.AccountResponse;
import com.raphael.account_transfer.infrastructure.web.mapper.AccountDtoMapper;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final GetAccountUseCase getAccountUseCase;
    private final AccountDtoMapper mapper;

    public AccountController(GetAccountUseCase getAccountUseCase, AccountDtoMapper mapper) {
        this.getAccountUseCase = getAccountUseCase;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public AccountResponse getByid(@PathVariable Long id) {
        return mapper.toResponse(getAccountUseCase.execute(id));
    }
}
