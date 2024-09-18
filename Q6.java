package java8_practiceSet;

import java.util.Arrays;
import java.util.List;

public class Q6 {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 22, 36, 54, 78, 99, 66, 47, 5, 3, 14, 5, 6);

         int sum = l1.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();   

         System.out.println("Sum of even numbers: " + sum);
    }
}
