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
public class profileImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer index;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user")
    private user user;

    private String imgUrl;

    @ColumnDefault("false")
    private Boolean isHide;

    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    private Timestamp createdAt;
}
