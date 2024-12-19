package com.bogusdetector.bogusdetector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bogusdetector.bogusdetector.model.Account;
import com.bogusdetector.bogusdetector.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Long saveAccount(Account account) {
        return accountRepository.save(account).getId();
    }

    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElse(null);
    }
}