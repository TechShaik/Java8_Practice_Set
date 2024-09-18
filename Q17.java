package java8_practiceSet;

import java.util.Optional;

public class Q17 {
	 		
    static Optional<String>  toUpper(String name){
	   Optional <String>s=Optional.ofNullable(name);
          s.ifPresentOrElse((n)->System.out.println(n.toUpperCase())
        		                             ,()->System.out.println("No value"));
          return s;
			    	 
	     
   }
	   public static void main(String[] args) {
		   Optional<String> s=toUpper(null);
  
}
} 