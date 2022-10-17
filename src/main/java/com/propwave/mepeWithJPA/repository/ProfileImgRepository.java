package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.profileImg;
import com.propwave.mepeWithJPA.domain.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProfileImgRepository extends JpaRepository<profileImg, Integer> {
    List<profileImg> findByUser(user user);
}
