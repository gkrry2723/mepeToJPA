package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<follow, Integer> {
}