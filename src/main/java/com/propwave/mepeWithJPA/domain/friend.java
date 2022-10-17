package com.propwave.mepeWithJPA.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
public class friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer index;

    @ManyToOne
    @JoinColumn(name="user")
    private user user;

    @ManyToOne
    @JoinColumn(name="friend")
    private user friend;

    private String friendName;

    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    private Timestamp createdAt;
}
