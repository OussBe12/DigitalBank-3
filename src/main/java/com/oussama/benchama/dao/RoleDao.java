package com.oussama.benchama.dao;

import org.springframework.data.repository.CrudRepository;

import com.oussama.benchama.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
