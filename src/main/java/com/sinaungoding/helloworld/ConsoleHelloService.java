/*
 * helloworld
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 7/11/19 1:24 PM
 * Blog    : sinaungoding.com
 * Email   : noprianto@sinaungoding.com,lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.sinaungoding.helloworld;

public class ConsoleHelloService implements HelloService {
    public ConsoleHelloService() {
    }

    @Override
    public void KatakanHai(String s) {
        System.out.println(s);
    }
}
