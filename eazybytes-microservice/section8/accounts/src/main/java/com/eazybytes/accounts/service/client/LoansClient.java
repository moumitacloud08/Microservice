package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.CardsDto;
import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * @HttpExchange :- Base Path
 */
@HttpExchange("/api")
public interface LoansClient {

    @GetExchange(value = "/fetch",accept = "application/json")   //@GetExchange used in Client side
    ResponseEntity<LoansDto> fetchLoanDetails(@RequestParam String mobileNumber);
}
