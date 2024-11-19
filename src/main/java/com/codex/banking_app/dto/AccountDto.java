package com.codex.banking_app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountDto {

    private Long id;
    private String accountHolderName;
    private Double balance;

}
