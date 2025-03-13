//Q1: Write a program to swap two numbers without using a third variable 
//and without using arithmetic operators like + or -.
//Hint: Use bitwise XOR ^ operator.
public class SwapUsingXOR_1{
	public static void main(String[] args){
		int a = 12;
		int b = 18;
		System.out.println("Before Swapping: \na = " + a + "\tb = " + b);
		//Swapping values using XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping: \na = " + a + "\tb = " + b);
	}
}