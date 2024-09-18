package java8_practiceSet;

import java.util.Optional;

public class Q18 {

	public static void main(String[] args) {
		 Optional<Double> s=Optional.of(50.5);
		double d=s.orElse(100.0);
		System.out.println(d);
		
		 Optional<Double> s1=Optional.empty();
			double d1=s1.orElse(100.0);
			System.out.println(d1);
	}

}
