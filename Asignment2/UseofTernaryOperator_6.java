//Q6: Write a program to find the largest of three numbers using only the ternary operator (? :).
public class UseofTernaryOperator_6{
	public static void main(String[] args){
		int a=21, b=18, c=23;
		int res = ((a>b && a>c)? a : (b>a && b>c)? b : c);
		System.out.println(res + " is the largest number.");
	}
}

