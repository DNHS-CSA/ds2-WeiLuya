package aPCorrections.src;



public class Four {
	public static void main(String[] args) {

	}
	
	public static void Q8() {
		int n = 6;
		for (int i = 1; i < n; i = i + 2)  // Line 2
		{
			System.out.print(i + " ");
		}
		/* Which of the following best explains how changing i < n to i <= n in line 2 will change the result?*/
		/* because i is incrementing my 2 each time, i < n and i <= n will loop the same number of iterations
		 * 
		 * I got this question wrong because I did not think through it, and just assumed that changing  i <=2 would increase the number of iterations*/
	}
	
	public static void Q16() {
		int a = 100;
		while (a > 1)
		{
			System.out.println("$");
			a /= 2;
		}
		
		/*will print out $ 6 times because 100 can be divided by 2, 6 times until it is no longer >1
		 * 
		 * I got this wrong because I miss counted the number of loops*/
	}

}
