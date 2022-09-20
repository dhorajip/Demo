package oopspractice;

public class Employee1 {
    // Assigning values to class variables Using object 

	int empid;
	String empname;
	int salary;
	int deptno;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	public static void main(String args[])
	{
		Employee1 emp1 = new Employee1();//first employee
		emp1.empid =101;
		emp1.empname = "Raj";
		emp1.salary =20000;
		emp1.deptno =10;
		emp1.display();
		
		Employee1 emp2 = new Employee1(); //second employee
		emp2.empid =102;
		emp2.empname = "Kiran";
		emp2.salary =30000;
		emp2.deptno =20;
		emp2.display();
	}
}
