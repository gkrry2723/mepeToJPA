package com.propwave.mepeWithJPA.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class wallet {
    @Id
    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "walletType")
    private walletType walletType;

    @OneToMany(mappedBy = "wallet")
    private List<userWallet> userWallets = new ArrayList<>();

}
