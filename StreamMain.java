package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        
        List<Integer> ls = Arrays.asList(10, 20, 3, 5, 4, 7, 8, 9, 6, 5, 5, 55, 5, 5, 56);
        Stream<Integer> i = ls.stream();
        i.forEach(n -> System.out.print(n+" ")); 
        System.out.println();
        
        Stream<Integer> i2 = ls.stream().distinct();
        i2.forEach(n -> System.out.print(n+" "));  
        System.out.println();
        
        List<Integer> i3 = ls.stream().distinct().collect(Collectors.toList());
        i3.forEach(n -> System.out.print(n+" "));  
        System.out.println();
        
        Stream<Integer> i4 = ls.stream().distinct().limit(4);
        i4.forEach(n -> System.out.print(n+" "));  
        System.out.println();
        
        Stream<Integer> i5 = ls.stream().distinct().limit(4).skip(1);
        i5.forEach(n -> System.out.print(n+" "));  
        System.out.println();
        
        Stream<Integer> i6 = ls.stream().distinct().filter(n -> n%2 != 0).limit(4).skip(1);
        i6.forEach(n -> System.out.print(n+" "));  
        System.out.println();
        
        Stream<Integer> i7 = ls.stream().distinct().sorted((a,b)->(a-b));
        i7.forEach(n -> System.out.print(n+" "));  
        System.out.println();
        
        Stream<Integer> i8 = ls.stream().distinct().sorted((a,b)->(b-a));
        i8.forEach(n -> System.out.print(n+" "));  
        System.out.println();
        
        long i9 = ls.stream().distinct().sorted((a,b)->(a-b)).count();
          
        System.out.println(i9);
    }
}
