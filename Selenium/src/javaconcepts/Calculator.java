
package javaconcepts;
import transportation.Car;
//import java.util.Scanner;
public class Calculator {
	int a,b,c;
	int add()
	{

		c=a+b;
	 System.out.println(c);
		return c;
	}
	void sub()
	{

		c=a-b;
		System.out.println(c);
	}
	void mult()
	{

		c=a*b;
		System.out.println(c);
	}
	void div()
	{

		c=a/b;
		System.out.println(c);
	}

void display(Car obj)
{
  Car c=new Car();
 c.moveforward();
}

	public static void main(String[] args) {
		
		System.out.println("Enter no");
		
		Calculator ob =new Calculator();
		ob.a=5;
		ob.b=3;
		   ob.add();
		   ob.sub();
		   ob.mult();
		   ob.div();
		 ob.display(null);
		 
		 
		// TODO Auto-generated method stub

	}

}
