package java8_practiceSet;

import java.util.Scanner;
import java.util.function.Predicate;

public class Q3 {

	public static void main(String[] args) {
		String s="Shaikshavali";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sub string to check : ");
		String i=sc.next();
		Predicate<String> p= (str) ->  str.contains(i);
        System.out.println(p.test(s));
        }

}
