package oopspractice;

public class Employee2 {
    //Assigning values to class variables Using  constructor
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	Employee2(int id, String name, int sal, int dno)
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
		
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	public static void main(String args[])
	{
		Employee2 emp1 = new Employee2(101, "RAJ" , 20000, 10);
		emp1.display();
		
		Employee2 emp2 = new Employee2(102, "KIRAN" , 30000, 20);
		emp2.display();
		
	}
}
