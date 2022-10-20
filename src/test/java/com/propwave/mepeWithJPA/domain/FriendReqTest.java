package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.FriendReqRepository;
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
public class FriendReqTest {
    @Autowired
    FriendReqRepository friendReqRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    public void test(){
        User user1 = userRepository.find("gkrry2723");
        User user2 = userRepository.find("zoozoo_club3");
        FriendReq friendReq = new FriendReq();
        friendReq.setReqFrom(user1);
        friendReq.setReqTo(user2);
        friendReq.setReqNickname("test");

        friendReqRepository.save(friendReq);

        List<FriendReq> friendReqList = friendReqRepository.findAll();

        Assertions.assertThat(friendReqList.get(friendReqList.size()-1)).isEqualTo(friendReq);
    }
}
