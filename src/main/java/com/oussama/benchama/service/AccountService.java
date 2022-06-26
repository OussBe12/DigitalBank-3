package com.oussama.benchama.service;

import java.security.Principal;

import com.oussama.benchama.domain.PrimaryAccount;
import com.oussama.benchama.domain.PrimaryTransaction;
import com.oussama.benchama.domain.SavingsAccount;
import com.oussama.benchama.domain.SavingsTransaction;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
