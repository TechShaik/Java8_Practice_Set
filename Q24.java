package java8_practiceSet;

import java.util.Optional;

public class Q24 {

	public static void main(String[] args) {
		sendName("Shaiksha");
		 

	}
	
	public static void sendName(String name) {
		 String op=Optional.ofNullable(name).orElse("Guest");
            		    System.out.println("Hello " +op);
	}

}
