package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.ProfileImg;
import com.propwave.mepeWithJPA.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProfileImgRepository extends JpaRepository<ProfileImg, Integer> {
    List<ProfileImg> findByUser(User user);
}
