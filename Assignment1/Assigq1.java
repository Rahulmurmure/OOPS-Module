class Assigq1{
	byte q,q1 = 123;
	short b,b2 = 23566;
	int c,c1 =3543645;
	char d, ch = 'A', ch1 =75, ch2 = '\u0042';
	long e, e1 = 21393474884L;
	float f, f1 = 10.3434f;
	boolean g, github = true;
	double a, a1 = 20.32455324553;
	void display(){
		System.out.println("Default value of double is " + a + "\nAssigned Values is " + a1);
		System.out.println("Default value of short is " + b + "\nAssigned Values is "+ b2);
		System.out.println("Default value of int is " + c  + "\nAssigned Values is "+ c1);
		System.out.println("Default value of char is " + d + "\nAssigned Values is "+ ch);
		System.out.println("Default value of long is " + e + "\nAssigned Values is "+ e1);
		System.out.println("Default value of float is " + f + "\nAssigned Values is "+ f1);
		System.out.println("Default value of boolean is " + g + "\nAssigned Values is "+ github);
		System.out.println("Default value of byte is " + q + "\nAssigned Values is "+ q1);
	}
	public static void main (String[] args){
   
   Assigq1 obj = new Assigq1();
   obj.display();

	}
}