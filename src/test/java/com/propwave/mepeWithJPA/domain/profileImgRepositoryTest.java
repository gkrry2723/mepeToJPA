package com.propwave.mepeWithJPA.domain;

import com.propwave.mepeWithJPA.repository.ProfileImgRepository;
import com.propwave.mepeWithJPA.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        List<ProfileImg> profileImgList = profileImgRepository.findAll();
        System.out.println(profileImgList);

        User user = userRepository.find("gkrry2723");
        List<ProfileImg> profileImgfind1 = profileImgRepository.findByUser(user);
        System.out.println(profileImgfind1);

        ProfileImg profileImg = new ProfileImg();
        profileImg.setUser(user);
        profileImg.setImgUrl("testUrl");
        ProfileImg savedProfileImg = profileImgRepository.save(profileImg);
        List<ProfileImg> profileImgfind2 = profileImgRepository.findByUser(user);

        Assertions.assertThat(profileImgfind2.get(profileImgfind2.size()-1)).isEqualTo(savedProfileImg);
    }
}
