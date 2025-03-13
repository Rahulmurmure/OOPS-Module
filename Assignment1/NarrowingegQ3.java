public class NarrowingegQ3{
// Explicit Type Casting
   double num1 = 20.53430, num2 = 24.3240, num3 = 36.2424;
   double average = ( num1 + num2 + num3) / 3.0;
	int num = (int) average;

	void display(){
	    System.out.println("Double  average Value is " + average);
		System.out.println("Coverted  average int Value is " + num);
		
		}
	public static void main(String[] args){ 
		NarrowingegQ3 obj1 = new NarrowingegQ3();
		obj1.display();
}
}
/*
C:\Java Lab>javac NarrowingegQ3.java

C:\Java Lab>java NarrowingegQ3
Double  average Value is 27.03356666666667
Coverted  average int Value is 27

*/