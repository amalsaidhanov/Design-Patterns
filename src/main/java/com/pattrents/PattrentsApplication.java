package com.pattrents;

import _1_strategy.Duck;
import _1_strategy.MallardDuck;
import _1_strategy.RedheadDuck;
import _1_strategy.RubberDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PattrentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PattrentsApplication.class, args);

        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.fly();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();

    }

}
