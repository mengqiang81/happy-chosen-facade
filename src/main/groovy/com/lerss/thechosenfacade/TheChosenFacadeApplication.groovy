package com.lerss.thechosenfacade

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@CompileStatic
@ComponentScan(["com.lerss.thechosenfacade","org.nofdev"])
@SpringBootApplication
class TheChosenFacadeApplication {

    static void main(String[] args) {
        SpringApplication.run TheChosenFacadeApplication, args
    }
}
