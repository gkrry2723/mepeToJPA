package com.propwave.mepeWithJPA.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
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
@Table(name="userWallet")
public class UserWallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer index;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private User user;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="walletAddress")
    private Wallet wallet;

    @ColumnDefault("default")
    private String chain;

    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    private Timestamp createdAt;
}
