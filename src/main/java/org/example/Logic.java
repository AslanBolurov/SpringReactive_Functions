package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Logic {
    public static void main(String[] args) {


        Flux<String> charactersFlux =
                Flux.just("Garfield", "Donatello", "Barbossa", "Neo", "Terminator");

//        all()
//        any()
        Mono<Boolean> hasA=charactersFlux.all(el -> el.contains("a"));
//        hasA.subscribe(System.out::println);

        Mono<Boolean> anyHasA=charactersFlux.any(el -> el.contains("a"));
        anyHasA.subscribe(System.out::println);
    }
}
