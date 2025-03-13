//Q7: Implement a Java program that checks whether a given year is a leap year or not using
//logical (&&, ||) operators.
import java.util.Scanner;
public class DemoCheckLeapYear_7{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int b = sc.nextInt();
		if(b%400==0 || (b%4==0 && b%100!=0))
			System.out.println(b + " is a leap year.");
		else
			System.out.println(b + " is not a leap year."); 
	}
}	