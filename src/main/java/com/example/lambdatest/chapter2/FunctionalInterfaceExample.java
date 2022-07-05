package com.example.lambdatest.chapter2;

import java.util.function.*;

public class FunctionalInterfaceExample {
    public static Integer addNum(Integer x) {
        return x + 100;
    }

    public static void main(String[] args) {
        // 1. Supplier : 매개변수가 없으며 반환값만 있는 람다식의 타입.
        // 추상 메소드로 get()을 가지며 제네릭 T를 반환한다.
        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());

        // 2. Consumer : 매개변수가 하나 있으며, 반환값은 없는(void) 람다식의 타입.
        Consumer consumer = (count) -> System.out.println("my Count is.. " + count);
        consumer.accept(3);

        // 3. Function : 하나의 매개변수를 받으며, 처리한 후 R을 반환하는 람다식 타입이다.
        Function<String, Integer> function = (String str) -> str.length();
        Function<Integer, Integer> function2 = (count) -> FunctionalInterfaceExample.addNum(count); // 직접 작성한 예시 함수
        System.out.println(function2.apply(10));

        // 4. Predicate : T객체를 매개변수로 받으며, 처리한 후 boolean 값을 반환하는 람다식의 타입이다.
        Predicate predicate = (answer) -> true;
        System.out.println(predicate.test("Hi"));

        // 5. UnaryOperator : T객체를 매개변수로 받으며, 반환타입 역시 T객체이다.
        UnaryOperator<String> unaryOperator = (word) -> "voca";

    }


}
