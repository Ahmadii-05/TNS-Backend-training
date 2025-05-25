package com.tnsif.lambdademo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOps {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // forEach()
        System.out.println("forEach():");
        names.stream().forEach(System.out::println);

        // toArray()
        Object[] arr = names.stream().toArray();
        System.out.println("\ntoArray(): " + Arrays.toString(arr));

        // reduce()
        List<Integer> nums = List.of(1, 2, 3, 4);
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("\nreduce(): Sum = " + sum);

        // collect()
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("\ncollect(): Uppercase Names = " + upper);

        // min() and max()
        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        System.out.println("\nmin(): " + min.orElse(null));
        System.out.println("max(): " + max.orElse(null));

        // count()
        long count = names.stream().count();
        System.out.println("\ncount(): " + count);

        // anyMatch(), allMatch(), noneMatch()
        boolean anyStartsWithA = names.stream().anyMatch(name -> name.startsWith("A"));
        boolean allShortNames = names.stream().allMatch(name -> name.length() < 10);
        boolean noneEmpty = names.stream().noneMatch(name -> name.isEmpty());

        System.out.println("\nanyMatch(): Any name starts with 'A'? " + anyStartsWithA);
        System.out.println("allMatch(): All names are short? " + allShortNames);
        System.out.println("noneMatch(): No name is empty? " + noneEmpty);

        // findFirst() and findAny()
        Optional<String> first = names.stream().findFirst();
        Optional<String> any = names.stream().findAny();

        System.out.println("\nfindFirst(): " + first.orElse("None"));
        System.out.println("findAny(): " + any.orElse("None"));
    }
}
