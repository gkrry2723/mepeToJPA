package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.ProfileImgRepository;
import com.propwave.mepeWithJPA.repository.SocialRepository;
import com.propwave.mepeWithJPA.repository.UserRepository;
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
public class profileImgRepositoryTest {
    @Autowired
    private ProfileImgRepository profileImgRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    public void test(){
        List<profileImg> profileImgList = profileImgRepository.findAll();
        System.out.println(profileImgList);

        user user = userRepository.find("gkrry2723");
        List<profileImg> profileImgfind1 = profileImgRepository.findByUser(user);
        System.out.println(profileImgfind1);

        profileImg profileImg = new profileImg();
        profileImg.setUser(user);
        profileImg.setImgUrl("testUrl");
        profileImg savedProfileImg = profileImgRepository.save(profileImg);
        List<profileImg> profileImgfind2 = profileImgRepository.findByUser(user);

        Assertions.assertThat(profileImgfind2.get(profileImgfind2.size()-1)).isEqualTo(savedProfileImg);
    }
}
