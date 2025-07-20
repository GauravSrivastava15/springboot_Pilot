package com.javaDev.week1.introduction.introToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")  // used to create new bean object when a beam is injected
                      // by default if the new bean is injected the spring container uses the same bean object
public class Apple {
    void eatApple(){
        System.out.println("I am eating Apple");
    }

    @PostConstruct  // life cycle hook it says use this before bean is used
    void beforeAplleisUsed(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy // life cycle hook to be called before the bean is destroyed. Bean is destroyed by closing the applicaion
    void beforeAppleIsDestroyed(){
        System.out.println("Destroying the apple bean");
    }

}
