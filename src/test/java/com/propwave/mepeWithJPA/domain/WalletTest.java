package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.WalletRepository;
import com.propwave.mepeWithJPA.repository.WalletTypeRepository;
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
public class WalletTest {
    @Autowired
    private WalletRepository walletRepository;

    @Test
    @Transactional
    public void testWallet(){
        wallet wallet = new wallet();
        walletType walletType = new walletType();

        walletType.setName("Metamask");
        wallet.setAddress("testWallet");
        wallet.setWalletType(walletType);

        wallet savedWallet = walletRepository.save(wallet);
    }
}
