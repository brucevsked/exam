package com.vsked.common.infrastructure.repository;

import com.vsked.common.model.Account;
import com.vsked.common.model.AccountId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, AccountId> {
}
