package com.Relationships.oneToOneRelationship.model;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCard;
    private String numberCard;
    @OneToOne
    @JoinColumn(name = "idPartner")
    private Partner partner;

    public Card() {
    }

    public Card(Integer idCard, String numberCard, Partner partner) {
        this.idCard = idCard;
        this.numberCard = numberCard;
        this.partner = partner;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }
}
