package com.propwave.mepeWithJPA.repository;

import com.propwave.mepeWithJPA.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository {
    @PersistenceContext
    EntityManager em;

    public String save(User user){
        em.persist(user);
        return user.getId();
    }

    public User find(String id){
        return em.find(User.class, id);
    }
}
