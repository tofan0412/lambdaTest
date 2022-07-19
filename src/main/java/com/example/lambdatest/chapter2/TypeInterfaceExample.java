package com.example.lambdatest.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class TypeInterfaceExample {
    public static void main(String[] args) {
        // Integer가 5보다 큰 수인지 아닌지를 알려주는 람다식이다.
        // 특정 타입인 Integer를 선언함으로서, 선언된 Predicate 람다식은 오직 Integer만을 매개변수로 받는다.
        Predicate<Integer> predicate = (x) -> x > 5;

        // BinaryOperator : 2개의 매개변수를 받아 매개변수의 타입인 객체를 반환한다.
        // 아래의 예에서 x, y, x + y는 모두 Integer 타입이다.
        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;

        // 컴파일러 에러가 발생하는 코드를 살펴보자.
        // Operator '+' cannot be applied to 'java.lang.Object', 'java.lang.Object' 라는 에러가 발생한다.
        // 변수에 사용할 타입으로 어떠한 타입도 지정하지 않았다.
        // 이경우 자바는 가장 기본이 되는 타입인 Object로 추정한다.
//        BinaryOperator add = (x, y) -> x + y;


        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        for (Integer integer : arr) {

        }
    }
}
