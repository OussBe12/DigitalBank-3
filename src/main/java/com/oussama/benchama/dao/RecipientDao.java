package com.oussama.benchama.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oussama.benchama.domain.Recipient;

public interface RecipientDao extends CrudRepository<Recipient, Long> {
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
