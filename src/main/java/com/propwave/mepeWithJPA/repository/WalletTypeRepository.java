package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.WalletType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTypeRepository extends JpaRepository<WalletType, String> {
}