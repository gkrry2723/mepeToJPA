package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<wallet, String> {
}
