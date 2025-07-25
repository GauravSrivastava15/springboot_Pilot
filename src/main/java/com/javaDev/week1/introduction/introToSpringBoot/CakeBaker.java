package com.javaDev.week1.introduction.introToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    final private Frosting frosting;
    final private Syrup syrup;
    public CakeBaker(Frosting frosting, Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }

    void bakeCake(){
        System.out.println("Baking cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType());
    }
}
