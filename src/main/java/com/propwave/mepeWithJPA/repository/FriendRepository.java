package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<friend, Integer> {
}
