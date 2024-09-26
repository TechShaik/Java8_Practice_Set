package java8_practiceSet;

public class BankingApplication {
	
	int acc_num;
	static int balance;
	BankingApplication(int acc_num,	  int balance){
    	   this.acc_num=acc_num;
    	   BankingApplication.balance=balance;
    	   }
       public static void deposit(int f) {
    	   balance=balance+f;
    	   System.out.println("Deposited successfully!!!");
    	   System.out.println("Updated balance is :"+balance);
    	   
       }
       
       public static void withDraw(Integer f) {
    	   balance=balance-f;
    	   System.out.println("Withdraw done successfully!!!");
    	   System.out.println("Updated balance is :"+balance);
    	   
       }
       public static void checkBalance( ) {
    	     System.out.println("Your current balance is :"+balance);
    	      
    	   
       }
       
       public String toString() {
    	   return "Acc_num is : "+acc_num+" and Balance is :"+balance;
       }
	public static void main(String[] args) {
		BankingApplication person1=new BankingApplication(12324565,50000);
		System.out.println(person1);
		checkBalance();
		deposit(5000);
		withDraw(200);
		checkBalance();

		
          	}

}
