package com.pks.handservice.controller;

import com.pks.handservice.config.HandConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hand")
public class HandController {

    @Autowired
    private HandConfig handConfig;

    @GetMapping("/getUrl")
    public Mono<String> getUrl(){

        return Mono.just(handConfig.getUrl());
    }
}
