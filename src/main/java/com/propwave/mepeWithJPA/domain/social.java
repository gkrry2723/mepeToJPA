package com.propwave.mepeWithJPA.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class social {
    @Id
    private String userId;

    @OneToOne
    @PrimaryKeyJoinColumn
    private user user;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "userId")
//    private user userId;

    private String twitter;
    private String facebook;
    private String discord;
    private String link;
}
