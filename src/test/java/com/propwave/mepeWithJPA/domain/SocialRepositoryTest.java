package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.domain.social;
import com.propwave.mepeWithJPA.domain.user;
import com.propwave.mepeWithJPA.domain.walletType;
import com.propwave.mepeWithJPA.repository.SocialRepository;
import com.propwave.mepeWithJPA.repository.UserRepository;
import com.propwave.mepeWithJPA.repository.WalletTypeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SocialRepositoryTest {
    @Autowired
    private SocialRepository socialRepository;

    @Test
    @Transactional
    public void read() {
        List<social> socialList = socialRepository.findAll();
        System.out.println(socialList);
        Optional<social> social = socialRepository.findById("gkrry2723");

        social.ifPresent(selectedWT -> {
            System.out.println(social);
        });
    }
}
