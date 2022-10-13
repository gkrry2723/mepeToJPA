package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.social;
import com.propwave.mepeWithJPA.domain.user;
import com.propwave.mepeWithJPA.domain.walletType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

public interface SocialRepository extends JpaRepository<social, String>{

}