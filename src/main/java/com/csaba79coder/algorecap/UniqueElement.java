package com.csaba79coder.algorecap;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueElement {

    public int[] findUniqueElements(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            if (isUnique(num, nums)) {
                numbers.add(num);
            }
        }
        if (numbers.isEmpty()) {
            return null;
        } else {
            return createArray(numbers);
        }
    }

    private boolean isUnique(int number, int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (num == number) {
                counter++;
            }
        }
        return counter == 1;
    }

    private int[] createArray(List<Integer> numbers) {
        int[] result = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }

    public int[] findUniqueElements2(int[] nums) {
        Map<Integer, Long> frequency = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        int[] uniqueElements = frequency.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .toArray();
        return uniqueElements.length > 0 ? uniqueElements : null;
    }
}
