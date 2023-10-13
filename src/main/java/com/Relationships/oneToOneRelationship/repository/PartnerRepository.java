package com.Relationships.oneToOneRelationship.repository;

import com.Relationships.oneToOneRelationship.model.Partner;
import org.springframework.data.repository.CrudRepository;

public interface PartnerRepository extends CrudRepository<Partner, Integer> {
}
