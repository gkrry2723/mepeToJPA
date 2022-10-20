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
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer index;

    @ManyToOne
    @JoinColumn(name="commentTo")
    private User commentTo;

    @ManyToOne
    @JoinColumn(name="commentFrom")
    private User commentFrom;

    private String message;

    @ColumnDefault("false")
    private Boolean isPinned;

    @ColumnDefault("false")
    private Boolean isHide;

    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    private Timestamp createdAt;
}
