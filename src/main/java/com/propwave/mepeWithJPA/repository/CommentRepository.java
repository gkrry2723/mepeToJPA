package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.Comment;
import com.propwave.mepeWithJPA.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByCommentTo(User user);
    List<Comment> findByCommentFrom(User user);
}
