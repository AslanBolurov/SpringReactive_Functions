package org.example;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Creation {
    public static void main(String[] args) {

        //just()
        Flux<String> fruitFlux=
                Flux.just(
                "Apple","Orange","Grape","Banana","Strawberry");


        //fromArray()
        String[] fruits = new String[]{
                "Apple", "Orange", "Grape", "Banana", "Strawberry"};

        Flux<String> fruitFlux1 = Flux.fromArray(fruits);

        fruitFlux.subscribe(System.out::println);

        //fromItarable()
        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Orange");
        fruits2.add("Grape");
        fruits2.add("Banana");
        fruits2.add("Strawberry");

        Flux<String> fruitFlux2 = Flux.fromIterable(fruits2);

        fruitFlux2.subscribe(System.out::println);


        //fromStream
        Stream<String> fruits3 = Stream.of(
                "Apple","Orange","Grape","Banana","Strawberry");
        Flux<String> fruitFlux3 = Flux.fromStream(fruits3);
        fruitFlux3.subscribe(System.out::println);

        //range(n,m)
        Flux<Integer> integerFlux=Flux.range(1,5);
        integerFlux.subscribe(System.out::println);

        //interval()
        Flux<Long> intervalFlux=
                Flux.interval(Duration.ofSeconds(2))
                        .take(5);
        intervalFlux.subscribe(System.out::println);





    }
}
