package com.oussama.benchama.dao;

import com.oussama.benchama.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;


public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
