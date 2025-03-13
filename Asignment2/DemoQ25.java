public class DemoQ25{
	static public void main(String me[]){
		int x = 2564, rev = 0;
		int temp = x;
		while(x!=0){
			rev = rev * 10 + x % 10;
			x = x/10;
		}
		System.out.println("Reverse of " + temp + " is " + rev);
	}
}
/*
C:\Java Lab>javac DemoQ25.java

C:\Java Lab>java DemoQ25
Reverse of 2564 is 4652

C:\Java Lab>
*/