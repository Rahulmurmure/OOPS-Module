public class WideningQ4{
// Implicit Type Casting
   int num1 = 200, num2 = 240, num3 = 360;
   double average = ( num1 + num2 + num3) / 3.0; 

	void display(){
	    System.out.println("Double  average Value is " + average);
		//System.out.println("Coverted int Value is " + num);
		
		}
	public static void main(String[] args){ 
		WideningExample obj1 = new WideningExample();
		obj1.display();
}
}


//C:\Java Lab>javac WideningQ4.java

//C:\Java Lab>java WideningQ4
//Double  average Value is 266.6666666666667

