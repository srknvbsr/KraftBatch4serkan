package day_53_EvceptionAndCollection_Summary;

import java.util.*;

public class C06_Examples {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 1, 7, 8, 7, 9);
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (Collections.frequency(numbers, number) == 1) {
                uniqueNumbers.add(number);
            }
        }
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}


