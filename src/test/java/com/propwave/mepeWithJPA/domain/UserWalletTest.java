package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.UserRepository;
import com.propwave.mepeWithJPA.repository.UserWalletRepository;
import com.propwave.mepeWithJPA.repository.WalletRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserWalletTest {
    @Autowired
    private UserWalletRepository userWalletRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private WalletRepository walletRepository;

    @Test
    @Transactional
    public void testUserWallet(){
        userWallet userWallet = new userWallet();

        Optional<wallet> wallet = walletRepository.findById("0xf9F3Ea76C7Be559B4D4C9B3Ee2c3E05484A84420");
        user user = userRepository.find("gkrry2723");
        userWallet.setWallet(wallet.get());
        userWallet.setUser(user);

        userWallet savedUserWallet = userWalletRepository.save(userWallet);
    }
}