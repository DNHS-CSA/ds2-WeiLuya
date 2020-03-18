package aPCorrections.src;


public class Three {
	public static void main(String args[]) {

	}

	public static void Q5() {
		int a = 1;
		int b = 0;
		int c = -1;
		if ((b + 1) == a) {
			b++;
			c += b;
		}
		if (c == a) {
			a--;
			b = 4;
		}
		/*
		 * What are the values of a, b and c?
		 * a=1, b=1, c=0; the first if statement is true and increments b by 1. C is also incremented by b, resulting in 0.
		 * 
		 * I got the question wrong because I did not realize the second if statement does not run
		 */
	}

	public static void Q11() {
		int x = 123;
		int y = 293;
		/* code segment I */
		int result = 0;
		if (x > y) {
			result = x - y;
			System.out.print(result);
		} else if (x < y) {
			result = y - x;
			System.out.print(result);
		} else {
			System.out.print(result);
		}

		/* code segment II */
		if (x < y) {
			System.out.print(y - x);
		} else {
			System.out.print(x - y);
		}
		/* code segement I and II produce the same output for all values of x and y 
		 * 
		 * I got this question wrong because i did not realize that if x == y, then x - y = 0.*/
	}

	public static void Q16() {
		int j = 183;
		int k = 9;
		int m = 23;
		
		boolean a = (!((j == k) && (k > m)) == (j != k) || (k <= m));
		/*
		 *  De morgans law states !(a&&b) is equivalent to !a || !b, therefore, !((j == k) && (k > m)) equals !(j == k) || !(k > m)
		 *  
		 *  I need to study de morgan's laws
		 */
	}
}
