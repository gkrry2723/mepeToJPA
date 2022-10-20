package com.propwave.mepeWithJPA.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="wallet")
public class Wallet {
    @Id
    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "walletType")
    private WalletType walletType;

    @OneToMany(mappedBy = "wallet")
    private List<UserWallet> UserWallets = new ArrayList<>();

}
