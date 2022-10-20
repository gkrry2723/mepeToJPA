package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.FriendRepository;
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
public class FriendRepositoryTest {
    @Autowired
    private FriendRepository friendRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    public void test(){
        List<Friend> friendList = friendRepository.findAll();
        for(Friend friend: friendList){
            System.out.println(friend.getIndex() + " " + friend.getFriendName());
        }

        User user1 = userRepository.find("gkrry2723");
        User user2 = userRepository.find("goyangtwo");
        Friend friend = new Friend();
        friend.setUser(user1);
        friend.setFriend(user2);
        friend.setFriendName("test");
        Friend savedFriend = friendRepository.save(friend);

        List<Friend> friendList2 = friendRepository.findAll();

        Assertions.assertThat(savedFriend).isEqualTo(friendList2.get(friendList2.size()-1));
    }
}
