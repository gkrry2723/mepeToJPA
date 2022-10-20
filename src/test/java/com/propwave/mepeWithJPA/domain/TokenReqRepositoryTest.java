package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.TokenReqRepository;
import com.propwave.mepeWithJPA.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TokenReqRepositoryTest {
    @Autowired
    TokenReqRepository tokenReqRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    public void test(){
        User user1 = userRepository.find("gkrry2723");
        User user2 = userRepository.find("zoozoo_club3");
        TokenReq tokenReq = new TokenReq();
        tokenReq.setReqWalletAddress("aa");
        tokenReq.setReqTokenAmount((float) 0.33);
        tokenReq.setUdenom("test");
        tokenReq.setToUser(user1);
        tokenReq.setFromUser(user2);
        tokenReq.setChainID("test");
        tokenReq.setWalletType("test");
        tokenReq.setMemo("test");
        TokenReq savedTokenReq = tokenReqRepository.save(tokenReq);


        Assertions.assertThat(savedTokenReq).isEqualTo(tokenReq);

        List<TokenReq> tokenReqList = tokenReqRepository.findAll();

        Assertions.assertThat(savedTokenReq).isEqualTo(tokenReqList.get(tokenReqList.size() - 1));
    }
}
