package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.domain.user;
import com.propwave.mepeWithJPA.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    public void testMember(){
        user user = new user();
        user.setId("jpaTest");
        user.setNickname("jpaTest");
        String savedId = userRepository.save(user);
        user findMember = userRepository.find(savedId);
        user findMember2 = userRepository.find("gkrry2723");

        Assertions.assertThat(findMember.getId()).isEqualTo(user.getId());

        Assertions.assertThat(findMember).isEqualTo(user);

        System.out.println(findMember2.getSocial());
    }
}
