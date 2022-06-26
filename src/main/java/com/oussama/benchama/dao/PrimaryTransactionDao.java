package com.oussama.benchama.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oussama.benchama.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
