package java8_practiceSet;

public class Q2 {
    @FunctionalInterface
	interface StringLength{
    	int length(String s);
		
	}
	public static void main(String[] args) {
		 StringLength s=(String s1)->{
			return s1.length();			 
		 };
         System.out.println("Length of the given string is :"+s.length("Shaikshavali"));
	}

}
