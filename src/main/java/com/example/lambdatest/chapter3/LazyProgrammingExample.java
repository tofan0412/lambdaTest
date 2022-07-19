package com.example.lambdatest.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LazyProgrammingExample {
    public static void main(String[] args) {
        Artist a = new Artist("a", "London");
        Artist b = new Artist("b", "Seoul");
        Artist c = new Artist("c", "New york");
        Artist d = new Artist("d", "Paris");

        List<Artist> allArtists = new ArrayList<>(Arrays.asList(a, b, c, d));

        // 아무것도 출력되지 않는다.
        allArtists.stream()
                .filter(artist -> {
                    System.out.println(artist.getName());
                    return artist.isFrom("London");
                });
        // 바로 출력된다.
        allArtists.stream()
                .filter(artist -> {
                    System.out.println(artist.getName());
                    return artist.isFrom("London");
                }).count();
    }
}
