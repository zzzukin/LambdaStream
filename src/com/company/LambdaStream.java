package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "1234", "12345", "123456", "1234567", "12345678");

        myPredicate predic = x->x.length() > 5;
        list.stream().filter(x->x.contains("456")).collect(Collectors.toList()).forEach(x-> System.out.println(x));

        String[] str = {"123", "12345", "asdasd", "asdqwe", "gfhgsd"};
        Stream stream = Arrays.stream(str);

        System.out.println(stream.max(Comparator.comparing(String::length)).get());

        List <String> lst = Arrays.asList("1111", "222", "33333", "4444");
        System.out.println("next min " + lst.stream().min((x1, x2)->x1.length()-x2.length()).get());

        Stream stream1 = Arrays.asList("w", "eweweee", "rrrrr", "we").stream();
        System.out.println(stream1.sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()));
    }
}

interface myPredicate{
    public boolean myCompare(String str);

}




