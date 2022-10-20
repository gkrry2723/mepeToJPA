package com.propwave.mepeWithJPA.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name="walletType")
public class WalletType {
    @Id
    private String name;

    private String icon;

    private Integer index;

    @OneToMany(mappedBy = "walletType")
    private List<Wallet> Wallets = new ArrayList<>();
}
