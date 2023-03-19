package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Main {
    public static void main(String[] args) {

        //Императивный способ
//        String name = "Craig";
//        String capitalName = name.toUpperCase();
//        String greeting = "Hello, " + capitalName + " !";
//        System.out.println(greeting);

        //Реактивный способ
//        Mono.just("Craig")
//                .map(name -> name.toUpperCase())
//                .map(name -> "Hello, " + name + " !")
//                .subscribe(System.out::println);

        String[] fruits = new String[]{
                "Apple", "Orange", "Grape", "Banana", "Strawberry"};

        Flux<String> fruitFlux1 = Flux.fromArray(fruits);

        fruitFlux1.subscribe(System.out::println);

    }
}