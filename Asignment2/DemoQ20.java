//Q20: Implement a Java program that returns the absolute value of a 
//given number using the ternary operator (without using Math.abs()).
public class DemoQ20{
	public static void main(String args[]){
			check(230);
			check(-2346);
	}
	public static void check(int A){
			int result = (A>0)? A : -A;
			System.out.println("absolute value: " + result);
	}
}