class MyClass
{
	private int a;	
	private int b;
	MyClass()
	{
		System.out.println("Inside no-arg constructor");
	}
	MyClass(int a)
	{
		this.a=a;
		System.out.println("Inside 1 param constructor");
	}
	MyClass(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Inside 2 param constructor");
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		MyClass m1=new MyClass(20);
		MyClass m2=new MyClass(10,20);
	}
}