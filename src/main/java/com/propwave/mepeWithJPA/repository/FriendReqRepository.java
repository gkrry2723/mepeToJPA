package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.FriendReq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendReqRepository extends JpaRepository<FriendReq, Integer> {
}
