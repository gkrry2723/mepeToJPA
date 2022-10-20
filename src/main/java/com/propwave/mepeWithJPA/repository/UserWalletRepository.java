package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.UserWallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserWalletRepository extends JpaRepository<UserWallet, Integer> {
}
