package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.comment;
import com.propwave.mepeWithJPA.domain.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<comment, Integer> {
    List<comment> findByCommentTo(user user);
    List<comment> findByCommentFrom(user user);
}
