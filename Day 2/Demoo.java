class a
{
	public a()
	{
		System.out.println("Inside no-org in A class");
	}
	static
	{
		System.out.println("inside A class Static block");
	}
	static void fun()
	{
		System.out.println("Inside class A Non-static block");
	}
}
class b
{
	public b()
	{
		System.out.println("Inside no-org in B class");
	}
	static
	{
		System.out.println("inside B class Static block");
	}
	static void fun()
	{
		System.out.println("Inside class B Non-static block");
	}
}
class c
{
	public c()
	{
		System.out.println("Inside no-org in C class");
	}
	static
	{
		System.out.println("inside C class Static block");
	}
	static void fun()
	{
		System.out.println("Inside class C Non-static block");
	}
}
public class Demoo
{
	public static void main(String args[])
	{
		a A=new a();
		a.fun();
		System.out.println("*************");
		b B=new b();
		b.fun();
		System.out.println("*************");
		c C=new c();
		c.fun();
		System.out.println("*************");
}
}