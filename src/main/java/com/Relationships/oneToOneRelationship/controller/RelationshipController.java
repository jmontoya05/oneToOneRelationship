package com.Relationships.oneToOneRelationship.controller;

import com.Relationships.oneToOneRelationship.model.Card;
import com.Relationships.oneToOneRelationship.model.Partner;
import com.Relationships.oneToOneRelationship.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class RelationshipController {
    private final RelationshipService relationshipService;
    @Autowired
    public RelationshipController(RelationshipService relationshipService) {
        this.relationshipService = relationshipService;
    }

    @PostMapping("/partner")
    public Partner createPartner(@RequestBody Partner partner){
        return this.relationshipService.createPartner(partner);
    }

    @PostMapping("/card")
    public Card createCard(@RequestBody Card card){
        return this.relationshipService.createCard(card);
    }
}
