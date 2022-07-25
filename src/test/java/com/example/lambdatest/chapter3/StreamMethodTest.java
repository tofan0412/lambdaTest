package com.example.lambdatest.chapter3;

import com.example.lambdatest.Track;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        // 기존 코드
        List<String> beginningWithNumbers = new ArrayList<>();
        for (String value : Arrays.asList("a", "1abc", "abc1")) {

            if (Character.isDigit(value.charAt(0))) {
                beginningWithNumbers.add(value);
            }
        }

        assertEquals(Arrays.asList("1abc"), beginningWithNumbers);

        // Stream.filter 적용
        List<String> beginningWithNumbers2 = Stream.of("a", "1abc", "abc1")
                .filter(value -> Character.isDigit(value.charAt(0)))
                .collect(Collectors.toList());

        assertEquals(Arrays.asList("1abc"), beginningWithNumbers2);

    }

    /**
     * flatMap 테스트
     * 각각의 인자를 Stream 객체로 변환한 뒤, 새로운 Stream 객체를 생성한다.
     */
    @Test
    void flatMapTest() {
        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());

        assertEquals(Arrays.asList(1, 2, 3, 4), together);
    }

    /**
     * Stream API의 min을 이용한 최대, 최소 구하기
     */
    @Test
    void maxMinTest() {
        List<Track> tracks = Arrays.asList(new Track("track 1", 1),
                new Track("track 2", 2),
                new Track("track 3", 3));

        Track shortestTrack = tracks.stream()
                .min(Comparator.comparing(track -> track.getTrackNo()))
                .get();

        assertEquals(tracks.get(0).getTrackNo(), shortestTrack.getTrackNo());
    }




}
