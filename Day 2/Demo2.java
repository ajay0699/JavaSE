class emp
{
	private static int cnt=100;
	public  static int getCnt()
	{
		return cnt;
	}
}
public class Demo2
{
	public static void main(String args[])
	{
		System.out.println(emp.getCnt());
	}
}