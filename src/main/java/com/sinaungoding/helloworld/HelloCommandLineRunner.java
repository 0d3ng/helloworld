/*
 * helloworld
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 7/11/19 1:22 PM
 * Blog    : sinaungoding.com
 * Email   : noprianto@sinaungoding.com,lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.sinaungoding.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    private final HelloService helloService;

    public HelloCommandLineRunner(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public void run(String... args) throws Exception {
        helloService.KatakanHai("Hai...!");
    }
}
