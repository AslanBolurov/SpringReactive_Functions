package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Filter {
    public static void main(String[] args) {

        Flux<String> charactersFlux =
                Flux.just("Garfield", "Donatello", "Barbossa", "Neo", "Terminator");
//                        .skip(4);
//                        .take(3);
//                        .filter(el -> !el.contains("a"));
//                        .distinct();
//                        .map(el ->el+"new");
//                        .flatMap(el ->
//                                Mono.just(el)
//                                        .map(elem->elem+"_CH")
////                                        .subscribeOn(Schedulers.parallel())
//                        );

        //buffer()
//        Flux<List<String>> buffredFlux =
//                charactersFlux
//                        .buffer(3)
//                        .flatMap(el ->
//                                Flux.fromIterable(el)
//                                        .map(elem -> Collections.singletonList(elem.toUpperCase())));
//        buffredFlux.subscribe(System.out::println);

        Mono<List<String>> listMono=charactersFlux.collectList();

        Mono<Map<String,String>> mapMono=
                charactersFlux.collectMap(el -> String.valueOf(el.charAt(0)));
        mapMono.subscribe(System.out::println);


    }
}
