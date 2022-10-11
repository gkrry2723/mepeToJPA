package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.user;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository {
    @PersistenceContext
    EntityManager em;

    public String save(user user){
        em.persist(user);
        return user.getId();
    }

    public user find(String id){
        return em.find(user.class, id);
    }
}
