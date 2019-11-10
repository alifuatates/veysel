package com.hackathon.seller;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends ReactiveMongoRepository<Seller, Integer> {

}
