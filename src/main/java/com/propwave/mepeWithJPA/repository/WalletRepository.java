package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, String> {
}
