package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q11 {

	public static void main(String[] args) {
		 List<Integer> l=Arrays.asList(45,8,5,6,7,9,2,1,44,7,5);
		 Stream<Integer> s=l.stream().sorted((a,b)->(b-a));
		 s.forEach(n -> System.out.print(n+ " "));
	}

}
