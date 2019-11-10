package com.hackathon.seller.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public WebClient webClient() {
        WebClient client = WebClient
                .builder()
                .baseUrl("http://localhost:8090")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8090"))
                .build();


        return client;
    }

}
