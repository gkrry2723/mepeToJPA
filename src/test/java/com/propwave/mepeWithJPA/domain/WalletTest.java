package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.WalletRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WalletTest {
    @Autowired
    private WalletRepository walletRepository;

    @Test
    @Transactional
    public void testWallet(){
        Wallet wallet = new Wallet();
        WalletType walletType = new WalletType();

        walletType.setName("Metamask");
        wallet.setAddress("testWallet");
        wallet.setWalletType(walletType);

        Wallet savedWallet = walletRepository.save(wallet);
    }
}
