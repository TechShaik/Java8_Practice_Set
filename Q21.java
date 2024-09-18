package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
 
public class Q21 {
	String name;
	  int salary;
	
	Q21(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	
	
	public String toString() {
		return name+"'s salary is : "+salary+"\n";
	}
	
	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		 List<Q21> empList=Arrays.asList(new Q21("shaik",21000),new Q21("shahid",55000),new Q21("sravani",66000));
              OptionalDouble s=empList.stream().mapToDouble(Q21::getSalary).average();
  if(s.isPresent()) {
	  System.out.println("Average salary is : "+s.getAsDouble());
  }else
  {
	  System.out.println("no salaries avaliable");
  }
	}

}
