package com.raphael.account_transfer.domain.model;

import java.math.BigDecimal;

public record Account(Long id, String owner, BigDecimal balance) {

}
