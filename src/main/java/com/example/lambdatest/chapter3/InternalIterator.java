package com.example.lambdatest.chapter3;

import jdk.nashorn.internal.objects.annotations.Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InternalIterator {
    public static void main(String[] args) {
        Artist a = new Artist("a", "London");
        Artist b = new Artist("b", "Seoul");
        Artist c = new Artist("c", "New york");
        Artist d = new Artist("d", "Paris");

        List<Artist> allArtists = new ArrayList<>(Arrays.asList(a, b, c, d));

        long count = allArtists.stream()
                .filter(artist -> artist.isFrom("London")).count();

        System.out.println("count : " + count);
    }
}

class Artist {
    String name;
    String region;

    public Artist(String name, String region) {
        this.name = name;
        this.region = region;
    }

    boolean isFrom(String region) {
        if (this.region.equals(region)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
