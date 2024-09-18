package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 
public class Q13 {

	public static void main(String[] args) {
		 List<Integer> l=Arrays.asList(45,8,5,6,7,9,2,1,44,7,5);
		 Optional<Integer> s=l.stream().max(Integer::compareTo);
		 System.out.println("Maximum number is : "+s.get());

	}

}
