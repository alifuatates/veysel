package com.hackathon.seller;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "seller")
public class Seller {

    private int id;
    private String name;



}
