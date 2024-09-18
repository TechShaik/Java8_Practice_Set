 package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
  
public class Q25 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(50,5,55,90,45,15,5,10);
		int s=l.stream()
				.filter(n -> n%2!=0)
				.mapToInt(Integer::intValue).reduce(1,(a,b)->a*b);
		System.out.println("Product of odd numbers is: "+s);
  				}

}
