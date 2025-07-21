package com.javaDev.week1.introduction.introToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class DevDB implements DB {
    public String getData(){
        return "Dev Data";
    }
}
