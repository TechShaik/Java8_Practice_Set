package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
 
public class Q9 {

	public static void main(String[] args) {
		 List<Double> l=Arrays.asList(45.65,458.78,45.25,22.45);
		 OptionalDouble s=l.stream().mapToDouble(Double::doubleValue).average();
         s.ifPresent(n->System.out.println(n));
         
         
	}

}
