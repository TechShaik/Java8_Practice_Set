package java8_practiceSet;

import java.util.Scanner;

public class Q4 {
	 @FunctionalInterface
     interface Transformer{
		 String transform(String input);
    	 
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input string : ");
		String i=sc.next();
		      	Transformer toUpper=(String input) -> 
			    {
				String s=input.toUpperCase();
				return s;
				};
			       System.out.println("converted to Upper case:"+toUpper.transform(i));

			       Transformer toLower=(String input) -> 
			        {
			     	String s=input.toLowerCase();
			     	return s;
				       };
				       System.out.println("converted to lower case:"+toLower.transform(i));
				
			     
				Transformer toTitle=(String input) -> 
				{
					String s=input.substring(0,1).toUpperCase();
					String s2=input.substring(1,input.length());
					String s3=s+s2;
					return s3;
				};
				       System.out.println("converted to Title case:"+toTitle.transform(i));

					
		}
		 

	

}
