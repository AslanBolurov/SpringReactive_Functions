package org.example;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.Duration;

public class Combine {
    public static void main(String[] args) {


        Flux<String> charactersFlux =
                Flux.just("Garfield", "Donatello", "Barbossa");

        Flux<String> foodFlux =
                Flux.just("Lasagna", "Pizza", "Apple");

        //mergeWith()
//        Flux<String> mergedFlux = charactersFlux.mergeWith(foodFlux);
//        mergedFlux.subscribe(System.out::println);

        //zip()
//        Flux<Tuple2<String, String>> zippedFlux=
//                Flux.zip(charactersFlux,foodFlux);
//        zippedFlux.subscribe(System.out::println);

        //firstWithSignal()
//        Flux<String> firstFlux=Flux.firstWithSignal(charactersFlux,foodFlux);
//        firstFlux.subscribe(System.out::println);

    }
}
