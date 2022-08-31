package com.nttdata.bootcamp.bank.springboot.service.inte;

import com.nttdata.bootcamp.bank.springboot.document.Bootcoin;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BootcoinServiceInte {

    Mono<Bootcoin> create(final Bootcoin bootcoin);

    Flux<Bootcoin> readAll();

    Mono<Bootcoin> readByCodeBootcoin(String codeBootcoin);

    Mono<Bootcoin> updateById(final Bootcoin bootcoin, final String id);

    Mono<Void> deleteById(final String id);
}