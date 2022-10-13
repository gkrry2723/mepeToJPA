package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.user;
import com.propwave.mepeWithJPA.domain.walletType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public interface WalletTypeRepository extends JpaRepository<walletType, String> {

}

//@Repository
//public class WalletTypeRepository {
//    @PersistenceContext
//    EntityManager em;
//
//    public walletType find(String name){
//        return em.find(walletType.class, name);
//    }
//}