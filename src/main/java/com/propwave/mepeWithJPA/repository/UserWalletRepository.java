package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.userWallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserWalletRepository extends JpaRepository<userWallet, Integer> {
}
