package com.sunho.accounts.repository;

import com.sunho.accounts.entity.Accounts;
import com.sunho.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    
}
