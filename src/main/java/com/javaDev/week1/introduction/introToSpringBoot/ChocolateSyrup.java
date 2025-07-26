package com.javaDev.week1.introduction.introToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "flavour.env", havingValue = "chocolate")
// we can use @ConditionalOnProperty to render conditional beans using env variables
public class ChocolateSyrup implements Syrup{
    @Override
    public String getSyrupType(){
        return "Chocolate Syrup";
    }
}
