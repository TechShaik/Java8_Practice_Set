package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q12 {

	public static void main(String[] args) {
	 List<String> l=Arrays.asList("Shaik","sravani","shahid"," "," ");
	 Stream<String>s=l.stream().filter(n -> !n.isEmpty());
       s.forEach(n -> System.out.println(n));	}

}
