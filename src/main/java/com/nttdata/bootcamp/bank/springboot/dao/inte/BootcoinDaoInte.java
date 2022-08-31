package com.nttdata.bootcamp.bank.springboot.dao.inte;

import com.nttdata.bootcamp.bank.springboot.document.Bootcoin;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface BootcoinDaoInte extends ReactiveMongoRepository<Bootcoin, String> {
    Mono<Bootcoin> readByCodeBootcoin(String codeBootcoin);
}
