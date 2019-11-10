package com.hackathon.seller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    SellerRepository sellerRepository;

    @GetMapping(value = "/exist/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Boolean> sellerExist(@PathVariable int id){
        return sellerRepository.existsById(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Seller> allSeller(){
        return sellerRepository.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Seller> findById(@PathVariable int id){
        return sellerRepository.findById(id);
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Seller> create(@RequestBody Seller seller) {

        return sellerRepository.insert(seller);
    }
}
