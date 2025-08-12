package com.javabasics.lamdas;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public void showConsumer() {
        List<String> slist = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> makeUpperCasse = item -> System.out.println(item.toUpperCase());

        slist.forEach(print.andThen(makeUpperCasse));
    }
}
