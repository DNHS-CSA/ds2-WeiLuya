
public class One {
	public static void main(String args[]) {

	}
	public static void U1Q2() {
		int x = 0;
		x++;
		x += 1;
		x = x + 1;
		x -= -1;
		System.out.println(x); 
		/*the result of print is 4, becuase after initialization, x is incremented 4 times
		 * 
		 * I got this one wrong because I mistook x -= -1 as decrementing x*/
	}
	
	public static void U1Q7() {
		double d = 0.25;
		int i = 3;
		double diff = d - i;
		System.out.print((int)diff - 0.5);
		
		/*diff is -2.75, when cast to int, it becomes -2. Subtracting .5 from -2 returns -2.5
		 * 
		 *I got his wrong because I thought that -2 - .5 would truncate the decimal and return -2 */
	}

	public static void U1Q8() {
		double a = 7;
		int b = (int) (a/2);
		double c = (double)b / 2;
		System.out.println(b);
		System.out.println(" ");
		System.out.println(c);
		
		/*3 1.5  
		 * 7/2 is 3 when cast to integer so b = 3. 3.0 / 2 is 1.5 so c = 1.5
		 * 
		 * I got this question wrong because I thought that a double/int would return an integer, not a double*/
	}
	
	public static void U1Q10() {
		int num1 = 5;
		int num2 = 10;
		double ans = num1 / num2;
		System.out.println(ans);
		/* the error is, the code should cast num1, num2, or (num1/num2) to double
		 * 
		 * I got this wrong because I did not know num1 and 2 had to be cast to double*/
	}	

	public static void U1Q12() {
		double fact1 = 1 / 2;
		double fact2 = 3 * 4;
		double product = fact1 * fact2;
		System.out.println(product);
		/*1 / 2 should be cast as double, not integer
		 * 
		 * same as q10, need to cast integers to double first.*/
	}
}
	
	
