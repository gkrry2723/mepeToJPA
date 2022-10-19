package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.FollowRepository;
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
public class FollowRepositoryTest {
    @Autowired
    FollowRepository followRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    public void test(){
        user user1 = userRepository.find("gkrry2723");
        user user2 = userRepository.find("zoozoo_club3");
        follow follow = new follow();
        follow.setUser(user1);
        follow.setFollowing(user2);
        follow savedFollow = followRepository.save(follow);

        List<follow> followList = followRepository.findAll();

        Assertions.assertThat(followList.get(followList.size()-1)).isEqualTo(savedFollow);

    }
}
