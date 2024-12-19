package com.bogusdetector.bogusdetector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bogusdetector.bogusdetector.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}