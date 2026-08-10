package com.eazybytes.gatewayserver.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Pattern(regexp="(^$|[0-9]{10})", message = "Mobile Number must be 10 digit")
    private String mobileNumber;

    @NotEmpty(message = "AccountType can not be a null or empty")
    private String accountType;

    @NotEmpty(message = "Branch Address can not be a null or empty")
    private String branchAddress;

    private boolean activeSW;
}
