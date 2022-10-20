package com.propwave.mepeWithJPA.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "social")
public class Social {
    @Id
    private String userId;

    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "userId")
//    private user userId;

    private String twitter;
    private String facebook;
    private String discord;
    private String link;
}
