package aPCorrections.src;


public class FiveB {
	public static void main(String args[]) {

	}

	/*
	 * Question 3
	 * 
	 */
	public class BoolTest {
		private int one;
		public BoolTest(int newOne) {
			one = newOne;
		}
		public int getOne() {
			return one;
		}
		public void isGreater(BoolTest other) {
			/*
			 * 1 return one > other.one; 2 return one > other.getOne(); 3 return getOne() >
			 * other.one;
			 * 
			 * The correct answer is all of the above, because the BoolTest constructor can
			 * access the private variable directly, or can use the getOne method to access
			 * the variable one;
			 *
			 * I got this question wrong because I mistakenly believed that constructors
			 * could not access private instance variables, and required a separate method
			 * to access them.
			 */
		}
	}

	/*
	 * Question 4
	 * 
	 * 
	 */
	public static class Gadget {
		private static int status = 0;

		public Gadget() {
			status = 10;
		}

		public static void setStatus(int s) {
			status = s;
		}
	}
	/*
	 * Gadget a = new Gadget(); Gadget.setStatus(3); Gadget b = new Gadget();
	 * 
	 * This code would create 2 gadget objects a and b, then set the static variable
	 * status to 3, then to 10.
	 * 
	 * I got this question wrong because I did not understand static variables and
	 * thought that creating two objects could can static variables of different
	 * values
	 */

	/*
	 * Question 5
	 * 
	 * 
	 */
	public static class Beverage {
		private int numOunces;
		private static int numSold = 0;

		public Beverage(int numOz) {
			numOunces = numOz;
		}

		public static void sell(int n) {

		}
	}
	/*
	 * numsold can be accessed and updated, numOunces cannot be accessed or updated
	 * becuase static methods can access static variables, not instance variables.
	 * 
	 * I got this wrong because I assumed that static methods would be able to
	 * access instance variables
	 */

	/*
	 * Question 8
	 * 
	 * 
	 */
	public class Student {
		private String firstName;
		private String lastName;
		private int age;

		public Student(String firstName, String lastName, int age) {
			firstName = firstName;
			lastName = lastName;
			age = age;
		}

		public String toString() {
			return firstName + " " + lastName;
		}
	}
	/*
	 * Student s = new Student("Priya", "Banerjee", -1); System.out.println(s);
	 */
	/*
	 * This code does not work properly because the local variables in the
	 * constructor have the same name as the instance variables, no only the local
	 * variables are changed, and the instance variables are not affected this
	 * problem can be resolved by using the 'this' reference
	 * 
	 * I got this wrong because I confused local and instance variables, I
	 * incorrectly thought the variable names would refer to the instance variables.
	 */

	/*
	 * Question 11
	 * 
	 */
	public class Person
	{
		private String name;
		private int feet;
		private int inches;
		public Person(String nm, int ft, int in)
		{
			name = nm;
			feet = ft;
			inches = in;
		}
		public int heightInInches()
		{
			return feet * 12 + inches;
		}
		public String getName()
		{
			return name;
		}
	public String compareHeights(Person other)
	{
	if (this.heightInInches() < other.heightInInches())
	{
	return name;
	}
	else if (this.heightInInches() > other.heightInInches())
	{
	return other.getName();
	}
	else return "Same";
	}
	}
	
	/*Person andy = new Person("Andrew", 5, 6);
	 * Person ben = new Person("Benjamin", 6, 5);
	 * System.out.println(andy.compareHeights(ben));
	 * 
	 * This code segment prints out andrew, because andrew's height is lower
	 * I got this wrong becuase I confused the < and > symbols.
	 * */
}
