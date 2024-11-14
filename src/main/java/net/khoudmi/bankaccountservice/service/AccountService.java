package net.khoudmi.bankaccountservice.service;

import net.khoudmi.bankaccountservice.dto.BankAccountRequestDTO;
import net.khoudmi.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
