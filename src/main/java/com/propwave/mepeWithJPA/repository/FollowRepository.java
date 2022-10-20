package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Integer> {
}