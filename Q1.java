package java8_practiceSet;

 
public class Q1 {
	
       @FunctionalInterface
 	  interface IntOperation{
 		  int apply(int x,int y);
       }
 		  public static void main(String[] args) {
			
 			 IntOperation add=(int x,int y) -> x+y;
 			  System.out.println("Addition : "+add.apply(5, 5));
 			  
 			 IntOperation sub=(int x,int y) -> x-y;
 				 System.out.println("Subtraction : "+sub.apply(5, 5));
 			   			  
  			IntOperation mul=(int x,int y) ->x*y;
  			System.out.println("Multiply : "+mul.apply(5, 5));
			 
  			  
 			 IntOperation div=(int x,int y) -> x/y; 				 
 			  System.out.println("divison : "+div.apply(5, 5));
		
 	  


}}