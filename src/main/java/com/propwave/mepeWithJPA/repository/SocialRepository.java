package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.Social;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
//public class SocialRepository {
//    @PersistenceContext
//    EntityManager em;
//
//    public user save(social social){
//        em.persist(social);
//        return social.getUserId();
//    }
//
//    public social find(String userId){
//        return em.find(social.class, userId);
//    }
//}

public interface SocialRepository extends JpaRepository<Social, String>{

}