package com.example.lambdatest.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        // 1. 다음의 코드는 관용구가 많고, 병렬처리하기 힘들며, 개발자의 의도를 정확하게 파악하지 못한다는 단점이 존재한다.
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Integer count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                count++;
            }
        }

        // 1. iterator를 활용하기 -> 이를 외부 반복(External Iteration)이라 부른다.
        count = 0;
        Iterator<Integer> iterator = arr.iterator();
        // hasNext : 다음 값이 있는지 여부를 boolean값으로 반환한다.
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value % 2 == 0) {
                count++;
            }
        }

    }


}
