package com.propwave.mepeWithJPA.domain;

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
public class WalletTypeTest{
    @Autowired
    private WalletTypeRepository walletTypeRepository;

    @Test
    @Transactional
    public void read(){
        List<WalletType> walletTypeList = walletTypeRepository.findAll();
        System.out.println(walletTypeList);
        Optional<WalletType> walletType = walletTypeRepository.findById("Evmos");

        walletType.ifPresent(selectedWT -> {
            System.out.println(selectedWT);
        });
    }
}
