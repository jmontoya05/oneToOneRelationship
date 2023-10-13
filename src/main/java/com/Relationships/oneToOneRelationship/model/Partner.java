package com.Relationships.oneToOneRelationship.model;

import javax.persistence.*;

@Entity
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPartner;
    private String firstName;
    private String lastName;
    @OneToOne(mappedBy = "partner", cascade = CascadeType.ALL)
    private Card card;

    public Partner() {
    }

    public Partner(Integer idPartner, String firstName, String lastName) {
        this.idPartner = idPartner;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getIdPartner() {
        return idPartner;
    }

    public void setIdPartner(Integer idPartner) {
        this.idPartner = idPartner;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
