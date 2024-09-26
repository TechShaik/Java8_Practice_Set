package java8_practiceSet;

public class ex2 {

	public static void main(String[] args) {
		 String s="78,55,47,89,32,25,4,75,abc";
		 String[] arr=s.split(",");	
		 System.out.print("Parsed numbers are : ");
        for(String i : arr) {
        	try {
         int in=Integer.parseInt(i.trim());    
         System.out.print(in+" ");
         System.out.println();
        	}
        	catch(NumberFormatException nfe) {
        		System.out.println("Invalid input is : "+i.trim());
        	}
        }
        }

}
