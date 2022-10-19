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
public class friendReq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer index;

    @ManyToOne
    @JoinColumn(name="reqFrom")
    private user reqFrom;

    @ManyToOne
    @JoinColumn(name="reqTo")
    private user reqTo;

    private String reqNickname;

    @ColumnDefault("false")
    private Boolean isAccepted;

    @ColumnDefault("false")
    private Boolean isRejected;

    @CreationTimestamp
    private Timestamp createdAt;
}
