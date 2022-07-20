package com.example.lambdatest.chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StreamMethodTest {
    @Test
    void collectTest() {
        List<String> collected = Stream.of("a", "b", "c") // Stream<T> 객체를 생성합니다.
                .collect(Collectors.toList());

        assertEquals(Arrays.asList("a", "b", "c"), collected);
    }

    /**
     * 부록) 명령형 프로그래밍과 함수형 프로그래밍의 차이
     */
    @Test
    void 함수형프로그래밍테스트() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>();

        // 명령형 프로그래밍
        for (int i = 0; i < arr.size(); i++) {
            result.add(arr.get(i) * 2);
        }

        // 선언형 프로그래밍
        arr.stream().forEach(i -> result.add(i * 2));

    }

    @Test
    void mapTest() {
        // 기존 코드
        List<String> collected = new ArrayList<>();
        for (String string : Arrays.asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }

        assertEquals(Arrays.asList("A", "B", "HELLO"), collected);

        // Stream.map 활용
        List<String> collected2 = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());

        assertEquals(Arrays.asList("A", "B", "HELLO"), collected2);
    }

    @Test
    void filterTest() {
        
    }
}
