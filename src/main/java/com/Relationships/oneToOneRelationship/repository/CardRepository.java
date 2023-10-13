package com.Relationships.oneToOneRelationship.repository;

import com.Relationships.oneToOneRelationship.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Integer> {
}
