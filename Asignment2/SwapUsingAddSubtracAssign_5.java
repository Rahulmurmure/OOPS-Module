//Q5: Write a Java program to swap two numbers using the += and -= operators only.
public class SwapUsingAddSubtracAssign_5{
	public static void main(String[] args){
		int a = 14, b = 82;
		System.out.println("Before Swapping: \na = " + a + "\nb = " + b); 
		a += b;
		b -= a;
		b = -b;
		a -= b;
		System.out.println("After Swapping: \na = " + a + "\nb = " + b); 
	}
}