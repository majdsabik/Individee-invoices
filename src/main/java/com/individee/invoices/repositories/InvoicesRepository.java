package com.individee.invoices.repositories;

import com.individee.invoices.models.Invoices;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoicesRepository extends MongoRepository<Invoices, String> {
    Invoices findBy_id(ObjectId _id);
}
