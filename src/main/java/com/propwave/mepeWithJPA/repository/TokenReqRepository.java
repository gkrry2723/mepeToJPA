package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.TokenReq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenReqRepository extends JpaRepository<TokenReq, Integer> {
}
