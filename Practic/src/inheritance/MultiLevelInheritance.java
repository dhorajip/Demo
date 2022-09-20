package inheritance;
//multilevel inheritance
class C
{

	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}

class D extends C
{
int x;
int y;

public void show()
{
	 System.out.println(x+y);
}
}


class E extends D
{

	int p;
	int q;
	public void addition()
	{
		System.out.println(p+q);
	}
}
public class MultiLevelInheritance
{

	public static void main(String[] args)
	{
		/*A aobj = new A();
		aobj.a=100;
		aobj.b = 200;
		aobj.display();*/
		
		B bobj = new B();
		bobj.x=10;
		bobj.y = 20;
		bobj.show();
		
		bobj.a =150;
		bobj.b=250;
		bobj.display();
		
		E eobj =new E();
		eobj.a =100;
		eobj.b =200;
		eobj.p = 300;
		eobj.q =400;
		eobj.x =500;
		eobj.y =600;
		
		eobj.display();
		eobj.show();
		eobj.addition();
		
		

	}

}

