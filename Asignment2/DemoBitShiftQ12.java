public class DemoBitShiftQ12{
	public static void main(String[] args){
		check(9);
		check(12);
		check(-2);
	}
	
	public static void check(int a){
		//Use bitwise left shift (  <<  ) 
		int result = a << 3;
		System.out.println(result);
	} 
}
/*	
C:\Java Lab\New folder>javac DemoBitShiftQ12.java

C:\Java Lab\New folder>java DemoBitShiftQ12
72
96
-16
*/