package com.javaDev.week1.introduction.introToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(name = "flavour.env", havingValue = "strawberry")
public class StrawberryFrosting implements Frosting {
    public String getFrostingType(){
        return "Strawberry Frosting";
    }
}
