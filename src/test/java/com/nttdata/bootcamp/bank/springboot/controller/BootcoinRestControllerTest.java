package com.nttdata.bootcamp.bank.springboot.controller;

import com.nttdata.bootcamp.bank.springboot.document.Bootcoin;
import com.nttdata.bootcamp.bank.springboot.service.inte.BootcoinServiceInte;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Flux;

@SpringBootTest
public class BootcoinRestControllerTest {

    @MockBean
    private BootcoinServiceInte bootcoinServiceInte;

    @Test
    void readAllTest() {

        Flux<Bootcoin> fluxBootcoin = bootcoinServiceInte.readAll();

        Mockito.verify(bootcoinServiceInte).readAll();

     }

}
