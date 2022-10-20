package com.propwave.mepeWithJPA.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@Table(name="tokenReq")
public class TokenReq {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer index;

    @ManyToOne
    @JoinColumn(name="toUser")
    private User toUser;

    @ManyToOne
    @JoinColumn(name="fromUser")
    private User fromUser;

    @NotNull
    private String reqWalletAddress;

    private Float reqTokenAmount;

    private String udenom;

    private String chainID;

    private String walletType;

    private String memo;

    @ColumnDefault("false")
    private Boolean isDeclined;

    @ColumnDefault("false")
    private Boolean isCanceled;

    @CreationTimestamp
    private Timestamp createdAt;
}
