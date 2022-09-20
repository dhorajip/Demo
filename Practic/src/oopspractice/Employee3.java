package oopspractice;

public class Employee3 {
	//Assigning values to class variables Using method 

		int empid;
		String empname;
		int salary;
		int deptno;
		
		
		
		void setdata(int id, String name, int sal, int dno)
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
			Employee3 emp1 = new Employee3();
			emp1.setdata(101, "Raj", 20000, 10);
			emp1.display();
			
			Employee3 emp2 = new Employee3();
			emp2.setdata(102, "Kiran", 30000, 20);
			emp2.display();
			
		}
}
