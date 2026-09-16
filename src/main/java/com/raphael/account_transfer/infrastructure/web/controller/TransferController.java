package com.raphael.account_transfer.infrastructure.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.raphael.account_transfer.application.usecase.GetTransfersUseCase;
import com.raphael.account_transfer.infrastructure.web.dto.TransferResponse;
import com.raphael.account_transfer.infrastructure.web.mapper.TransferDtoMapper;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/transfers")
public class TransferController {
    private final GetTransfersUseCase getTransferUseCase;
    private final TransferDtoMapper mapper;

    public TransferController(GetTransfersUseCase getTransferUseCase, TransferDtoMapper mapper) {
        this.getTransferUseCase = getTransferUseCase;
        this.mapper = mapper;
    }

    @GetMapping
    public List<TransferResponse> getAll() {
        return getTransferUseCase.execute().stream().map(mapper::toResponse).toList();
    }

}
