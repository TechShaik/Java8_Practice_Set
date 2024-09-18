package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q15 {

	public static void main(String[] args) {
		 List<Integer> l=Arrays.asList(4,8,5,6,7,9,2,1,44,7,5);
		 Stream<Integer> s=l.stream().map(n -> n*n);
		 s.forEach(n -> System.out.print(n+ " "));
	}

}
