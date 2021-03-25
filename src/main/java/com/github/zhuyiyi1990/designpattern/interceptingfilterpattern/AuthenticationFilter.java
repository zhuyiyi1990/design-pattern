package com.github.zhuyiyi1990.designpattern.interceptingfilterpattern;

public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }

}
