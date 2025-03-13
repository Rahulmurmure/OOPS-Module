//Q17: Implement a Java program that finds the minimum of four numbers using nested ternary operators.
public class DemoQ17{
	public static void main(String[] args){
		minimumfour(50,23,14,42);
	}
	public static void minimumfour(int x, int y, int z, int m){
		
		int result = (x<y && x<z && x<m)? x:(z<y && z<x && z<m)? z:(y<z && y<x && y<m)? y : m;
		System.out.println(result);
	}
}