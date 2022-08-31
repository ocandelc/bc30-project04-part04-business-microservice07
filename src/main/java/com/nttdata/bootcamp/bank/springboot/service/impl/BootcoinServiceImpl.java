package com.nttdata.bootcamp.bank.springboot.service.impl;

import com.nttdata.bootcamp.bank.springboot.dao.inte.BootcoinDaoInte;
import com.nttdata.bootcamp.bank.springboot.document.Bootcoin;
import com.nttdata.bootcamp.bank.springboot.service.inte.BootcoinServiceInte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BootcoinServiceImpl implements BootcoinServiceInte {

    private static final Logger log = LoggerFactory.getLogger(BootcoinServiceInte.class);

    @Autowired
    private BootcoinDaoInte bootcoinDaoInte;

    @Override
    public Mono<Bootcoin> create(final Bootcoin bootcoin) {

        return bootcoinDaoInte.save(bootcoin)
                .doFirst(() -> log.info("Begin create Bootcoin"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish create Bootcoin"));
    }

    @Override
    public Flux<Bootcoin> readAll() {

        return bootcoinDaoInte.findAll()
                .doFirst(() -> log.info("Begin readAll Bootcoin"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readAll Bootcoin"));
    }

    @Override
    public Mono<Bootcoin> readByCodeBootcoin(String codeBootcoin) {

        return bootcoinDaoInte.readByCodeBootcoin(codeBootcoin)
                .doFirst(() -> log.info("Begin readByCodePurse Bootcoin"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readByCodePurse Bootcoin"));
    }

    @Override
    public Mono<Bootcoin> updateById(final Bootcoin bootcoin, final String id) {

        return bootcoinDaoInte.save(bootcoin)
                .doFirst(() -> log.info("Begin updateById Bootcoin"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish updateById Bootcoin"));
    }

    @Override
    public Mono<Void> deleteById(final String id) {

        return bootcoinDaoInte.deleteById(id)
                .doFirst(() -> log.info("Begin deleteById Bootcoin"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish deleteById Bootcoin"));
    }

}