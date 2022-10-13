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
public class user {
    @Id
    private String id;

    @ColumnDefault("https://daotool.s3.ap-northeast-2.amazonaws.com/static/user/a4cc74a2-ee79-4098-b4d7-f0f9c3de6099bannerimg-default2.png")
    private String backImage;

    private String profileImg;

    private String introduction;
    private String url;

    @ColumnDefault("0")
    private Integer hits;

    @ColumnDefault("0")
    private Integer todayHits;

    @ColumnDefault("10")
    private Integer nftRefreshLeft;

    @CreationTimestamp
    private Timestamp createdAt;

    @GeneratedValue
    private Integer index;

    private String nickname;

    @ColumnDefault("0")
    private Integer todayFollows;

    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    private Timestamp refreshAt;

    @OneToOne(mappedBy = "user", fetch=FetchType.LAZY)
    private social social;
}
