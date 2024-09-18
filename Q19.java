package java8_practiceSet;

import java.util.Optional;
 
public class Q19 {
      static int show(int x) {
    	  Optional<Integer> i=Optional.ofNullable(x);
 	    return i.map((n)-> n*10).orElse(0);
      }
	public static void main(String[] args) {
		 int z= show(50);
		 System.out.println(z);
		 
		 System.out.println();
		 
		 Optional<Integer> y=Optional.ofNullable(null);
		 int res=y.orElse(0);
		 System.out.println(res);
	}
	
 
	}

