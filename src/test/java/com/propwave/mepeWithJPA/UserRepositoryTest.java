package com.propwave.mepeWithJPA;

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
    @Rollback(false)
    public void testMember(){
        user user = new user();
        user.setId("jpaTest");
        user.setNickname("jpaTest");
        String savedId = userRepository.save(user);
        com.propwave.mepeWithJPA.domain.user findMember = userRepository.find(savedId);

        Assertions.assertThat(findMember.getId()).isEqualTo(user.getId());

        Assertions.assertThat(findMember).isEqualTo(user);
    }
}
