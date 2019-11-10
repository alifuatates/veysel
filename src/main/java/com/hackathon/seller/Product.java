package com.hackathon.seller;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Data
public class Product {

    @Id
    private int id;

    private int sellerId;

    private String title;
    private int price;
    private int stock;


}
