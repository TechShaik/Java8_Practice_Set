package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q14 {

	public static void main(String[] args) {
		 List<String> l=Arrays.asList("Shaik","sravani","shahid","ram ","sammu ");
		  String s=l.stream().collect(Collectors.joining(","));
		  System.out.println(s);

	}

}
