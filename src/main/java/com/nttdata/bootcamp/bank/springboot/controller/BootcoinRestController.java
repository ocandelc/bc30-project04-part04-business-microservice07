package com.nttdata.bootcamp.bank.springboot.controller;

import com.nttdata.bootcamp.bank.springboot.document.Bootcoin;
import com.nttdata.bootcamp.bank.springboot.service.inte.BootcoinServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/business-microservice07-bootcoin/bootcoin")
public class BootcoinRestController {

    private static final Logger log = LoggerFactory.getLogger(BootcoinServiceInte.class);

    @Autowired
    private BootcoinServiceInte bootcoinServiceInte;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Mono<Bootcoin> create(@RequestBody final Bootcoin bootcoin) {
        log.debug("Begin RestController create Bootcoin");
        return bootcoinServiceInte.create(bootcoin);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Flux<Bootcoin> readAll() {
        log.debug("Begin RestController readAll Bootcoin");
        return bootcoinServiceInte.readAll();
    }

    @RequestMapping(value = "/readByCodeBootcoin/{codeBootcoin}", method = RequestMethod.GET)
    public Mono<Bootcoin> readByCodeBootcoin(@PathVariable String codeBootcoin) {
        log.debug("Begin RestController readByCodePurse Bootcoin");
        return bootcoinServiceInte.readByCodeBootcoin(codeBootcoin);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Mono<Bootcoin> updateById(@RequestBody final Bootcoin bootcoin, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById Bootcoin");
        return bootcoinServiceInte.updateById(bootcoin, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById Bootcoin");
        return bootcoinServiceInte.deleteById(id);
    }

}