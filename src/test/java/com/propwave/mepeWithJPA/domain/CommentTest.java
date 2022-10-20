package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.CommentRepository;
import com.propwave.mepeWithJPA.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentTest {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    public void commentTest(){
        User user1 = userRepository.find("gkrry2723");
        User user2 = userRepository.find("zoozoo_club3");
        Comment comment = new Comment();
        comment.setCommentTo(user1);
        comment.setCommentFrom(user2);
        comment.setMessage("test");
        Comment savedComment = commentRepository.save(comment);

        List<Comment> commentList = commentRepository.findAll();

        Assertions.assertThat(commentList.get(commentList.size()-1)).isEqualTo(savedComment);
    }
}
