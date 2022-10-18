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
        user user1 = userRepository.find("gkrry2723");
        user user2 = userRepository.find("zoozoo_club3");
        comment comment = new comment();
        comment.setCommentTo(user1);
        comment.setCommentFrom(user2);
        comment.setMessage("test");
        comment savedComment = commentRepository.save(comment);

        List<comment> commentList = commentRepository.findAll();

        Assertions.assertThat(commentList.get(commentList.size()-1)).isEqualTo(savedComment);
    }
}
