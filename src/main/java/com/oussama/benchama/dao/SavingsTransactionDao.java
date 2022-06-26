package com.oussama.benchama.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oussama.benchama.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

