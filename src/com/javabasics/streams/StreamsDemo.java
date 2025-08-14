package com.javabasics.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public void showStream (){
        Stream<Float> random = Stream.generate(()-> (float) (Math.random()*10));
        random.limit(5).forEach(item-> System.out.println(item));

        int[] inum = {2,44,67};
        Arrays.stream(inum).forEach(num-> System.out.println(num));

        Stream.iterate(2,n->n+1).peek((n)-> System.out.println("peek : "+ n)).limit(10).forEach(num-> System.out.println(num));


        var moviesList = List.of(new Movie("DDLJ",5),
                new Movie("FFive",3),
                new Movie("3Ideots",2));

//        moviesList
//                .stream()
//                .map(movie -> movie.getTitle)
//                .forEach(name -> System.out.println(name));

//        moviesList
//                .stream()
//                .filter(movie -> movie.getTotalLikes()>2)
//                .forEach(name -> System.out.println(name.getTitle()));

//        moviesList
//                .stream()
//                .sorted(Comparator.comparing(Movie ::getTitle).reversed())
//                .forEach(name -> System.out.println(name.getTitle()));

//        var totalMoviews = moviesList.stream()
//                .count();
//        System.out.println("total movies: "+totalMoviews);

//        Reducing stream

/*        Optional<Integer> totalLikes = moviesList.stream()
                .map(item -> item.getTotalLikes())
//                .reduce((a,b)->a+b);
                .reduce(Integer::sum);
        System.out.println("Toal likes: " + totalLikes.get());
 */
        var sampleList = moviesList.stream().collect(Collectors.toList());
        var sampleset = moviesList.stream().collect(Collectors.toSet());
        var samplemap = moviesList.stream().collect(Collectors.toMap(m->m.getTitle(),m->m.getTotalLikes()));
        var sampleSumarization = moviesList.stream().collect(Collectors.summarizingInt(m->m.getTotalLikes()));
        System.out.println(sampleList);
        System.out.println(sampleset);
        System.out.println(samplemap);
        System.out.println(sampleSumarization);
    }
}
