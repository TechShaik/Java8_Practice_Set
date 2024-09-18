package java8_practiceSet;

import java.util.Optional;

public class Q16 {


	public static void main(String[] args) {
		String name= "shaiksha";
		 Optional<String> s=getString(name);
		 System.out.println("Optional value :"+s);
		 String names=null;
		 Optional<String> s2=getString(names);
		 System.out.println("Optional value : "+s2);
	  
		
	}

		static Optional<String> getString(String str){
			return Optional.ofNullable(str);
 			
		}
		 
	

}
