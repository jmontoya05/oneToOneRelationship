package com.Relationships.oneToOneRelationship.service;

import com.Relationships.oneToOneRelationship.model.Card;
import com.Relationships.oneToOneRelationship.model.Partner;
import com.Relationships.oneToOneRelationship.repository.CardRepository;
import com.Relationships.oneToOneRelationship.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationshipService {
    private final PartnerRepository partnerRepository;
    private final CardRepository cardRepository;

    @Autowired
    public RelationshipService(PartnerRepository partnerRepository, CardRepository cardRepository) {
        this.partnerRepository = partnerRepository;
        this.cardRepository = cardRepository;
    }

    public Partner createPartner(Partner partner) {
        return this.partnerRepository.save(partner);
    }

    public Card createCard(Card card) {
        return this.cardRepository.save(card);
    }

}
