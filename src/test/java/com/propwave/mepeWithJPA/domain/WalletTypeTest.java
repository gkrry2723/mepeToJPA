package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.domain.user;
import com.propwave.mepeWithJPA.domain.walletType;
import com.propwave.mepeWithJPA.repository.WalletTypeRepository;
import org.assertj.core.api.Assertions;
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
        List<walletType> walletTypeList = walletTypeRepository.findAll();
        System.out.println(walletTypeList);
        Optional<walletType> walletType = walletTypeRepository.findById("Evmos");

        walletType.ifPresent(selectedWT -> {
            System.out.println(selectedWT);
        });
    }

//    @Test
//    @Transactional
//    public void testWalletType(){
//        walletType walletType = new walletType();
//
//        walletType findWT = walletTypeRepository.find("Metamask");
//
//        Assertions.assertThat(findWT.getName()).isEqualTo("Metamask");
//    }
}
