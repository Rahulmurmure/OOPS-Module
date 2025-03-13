//Q19: Write a Java program that checks whether a character is uppercase, lowercase, or
// not a letter using only the ternary operator
public class DemoQ19{
	public static void main(String args[]){
		check('b');
		check('Z');
		check('24');
	}
	public static void check(char A){
		int a = (int) A;
		String result = (a>64 && a<91)? "Uppercase" : (a>96 && a<123)? "Lowercase" : "Not a character";
		System.out.println(result);
	}
}
