package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 
public class Q7 {

	public static void main(String[] args) {
		  List<String> l=Arrays.asList("Shaik","vali","Shaikshavali","Tailor");
          Optional<String> s=l.stream().max((a,b)->(Integer.compare(a.length(), b.length())));
          s.ifPresent(n -> System.out.println(n));
	}

}
