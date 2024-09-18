package java8_practiceSet;

import java.util.Arrays;
import java.util.List;

public class Q8 {

	public static void main(String[] args) { 
		List<String> l=Arrays.asList("Shaik","jyothi","jaya","stavani","Shahid","jana");
		long s=l.stream().filter(n -> n.startsWith("j")).count();
		System.out.println(s);
		}

}
