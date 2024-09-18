package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q22 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(50,5,55,90,45,15,5,10);
		Stream<Integer>s=l.stream().filter(n -> n%5==0).sorted((a,b)->(b-a)).limit(1);
          s.forEach(n -> System.out.println(n));		}

}
