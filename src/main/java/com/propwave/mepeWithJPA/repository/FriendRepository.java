package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Integer> {
}
