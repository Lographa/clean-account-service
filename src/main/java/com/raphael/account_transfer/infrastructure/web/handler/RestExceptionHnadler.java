package com.raphael.account_transfer.infrastructure.web.handler;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.raphael.account_transfer.domain.exception.AccountNotFoundException;

@RestControllerAdvice
public class RestExceptionHnadler {
    public record ApiError(String message, Instant timestamp) {
    }

    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiError handleNotFound(AccountNotFoundException ex) {
        return new ApiError(ex.getMessage(), Instant.now());
    }
}
