

//Q2: Write a program to check whether a given number is even or odd using only bitwise operators.
//Hint: Use n & 1 to check.
public class BitwiseOddorEven_2{
	public static void main(String[] args){
		int a = 7, b = 12;
		check(a);
		check(b);
	}
	
	public static void check(int a){
		if((a&1) == 0){
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}
}