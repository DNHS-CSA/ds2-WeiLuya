package aPCorrections.src;


public class FiveA {

	public static void main(String[] args) {
	}

	public class Employee {
		private String name;
		private double salary;
		// constructor and methods not shown
	}
	/*
	 * The Employee class will contain a String attribute for an employee’s name and
	 * a double attribute for the employee’s salary. Which of the following is the
	 * most appropriate implementation of the class?
	 */

	/*
	 * Employee class is public so that objects can be created outside the class
	 * instance variables are private to they are kept internal to the class
	 * 
	 * I got this wrong because I made the Instance variables public, not private
	 */

	public class Employee2
	{
		private String name;
		private int wk_hours;
		private double pay_rate;
		public Employee2(String nm, int hrs, double rt)
		{
			name = nm;
			wk_hours = hrs;
			pay_rate = rt;
		}
		public Employee2(String nm, double rt)
		{
			name = nm;
			wk_hours = 20;
			pay_rate = rt;
		}
	}
	/* I. Employee e1 = new Employee("Lili", 20, 18.5);
	 * II. Employee e2 = new Employee("Steve", 18.5);
	 * III. Employee e3 = new Employee("Carol", 20);
	 * 
	 * Only I and II are correct, because they instantiate the class with the correct parameters. 
	 * III does not work because it sets the pay rate to 20, not 18.5
	 * 
	 * */
}
