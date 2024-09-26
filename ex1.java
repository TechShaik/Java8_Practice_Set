package java8_practiceSet;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter A value : ");
		 int a=sc.nextInt();
		 System.out.println("enter B value : ");
         int b=sc.nextInt();
         while(true) {
         System.out.println("Choose operation :");
         System.out.println();
         System.out.println(" 1 for Addition");
    	 System.out.println(" 2 for Subtraction");
    	 System.out.println(" 3 for Multiplication");
    	 System.out.println(" 4 for Divison");
    	 System.out.println(" 5 for Exit");
    	 System.out.println();
          try {
         if(sc.hasNextInt()) {
        	 int op=sc.nextInt();  
        	 if(op==1 || op==2 ||  op==3 || op==4) {
        		
        	 switch(op) {
        	 case 1:
        		 int c=a+b;
        		 System.out.println("Addition of A and B is :"+c);
        		 break;
        	 case 2:
        		 int d=a-b;
        		 System.out.println("Subtraction of A and B is :"+d);

        		 break;
        	 case 3:
        		 int e=a*b;
        		 System.out.println("Multiplication of A and B is :"+e);

        		 break;
        	 case 4:
        		 try {
        		 float f=a/b;
        		 System.out.println("Divison of A and B is :"+f);

        		 }
        		 catch(ArithmeticException ae){
        			 System.out.println( "Invalid input entered");
         		 }
 
        		 
         
         }
	}  else {
        		 break;
        	 }
         }
          }  
         catch(NumberFormatException nfe) {
   	 System.out.println(" Invalid input entered");
   	 		 }

}
	}}