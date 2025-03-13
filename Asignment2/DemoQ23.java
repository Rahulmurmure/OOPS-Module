public class DemoQ23{
	public static void main(String[] args){
		int a = 23, b = 42;
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
/*	
C:\Java Lab>javac DemoQ23.java

C:\Java Lab>java DemoQ23
23 is odd
42 is even

C:\Java Lab>
*/