//Q3: Implement a program that calculates the sum of digits of an integer using modulus (%) and division (/) operators.
public class DemoModulus_3{
	public static void main(String[] args){
		int x = 234567;
		int res = 0;
		while(x!=0){
			res = res + (x%10);
			x = x/10;
		}
		System.out.println("Sum: " + res);
	}
}