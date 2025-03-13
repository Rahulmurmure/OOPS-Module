
//Q13: Implement a Java program to find the absolute value of an integer using bitwise operators.
public class DemoQ13{
	public static void main(String[] args){
		abs(234);
		abs(0);
	}
	
	public static void abs(int num){ 
		int mask = num >> 31; 
		int abs = (num + mask) ^ mask;
		System.out.println(abs);
	} 
}	

