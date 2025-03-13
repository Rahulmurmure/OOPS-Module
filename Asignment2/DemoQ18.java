//Q18: Given a student’s percentage, print “Pass” if the percentage is 40 or above; 
//otherwise, print “Fail”, using only the ternary operator.
public class DemoQ18{
	public static void main(String args[]){
	    	check(46);
	  	    check(23);
	}
	public static void check(int a){
		String result = (a>=40)? "Pass" : "Fail";
		System.out.println(result);
	}
}
