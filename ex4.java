package java8_practiceSet;

public class ex4 {
	
     public static void show(int a,int b) throws ArithmeticException{
     	int c=a/b;
    	System.out.println(c);
    }
     
     public static void get(int[]ar,int a) {
    	  
    	 System.out.println(ar[a]);
     	 
     }
	public static void main(String[] args) {
		try {
		 show(5,0);
		}catch(ArithmeticException ar) {
			System.out.println("Can't divide by zero");
		}
		
		 try {
			 int[]arr= {45,6,53,248,632,455}; 
	    	       get(arr,9);
	     }
	    	 catch(ArrayIndexOutOfBoundsException a) {
	    		 System.out.println("Index out of bounds");
	    	 }
	     }
	}


