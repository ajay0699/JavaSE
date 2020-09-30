class shape
 {
	private int width;
	private int height;
	public void setWidth(int width)
	{
		this.width=width;
	}
	public int getWidth()
	{
		return width;
	}
	public void setHeight(int height)
	{
		this.height=height;
	}
	public int getHeight()
	{	
		return height;
	}
}
public class Demo
{
	public static void main(String args[])
	{
		shape s=new shape();
		s.setWidth(100);
		s.setHeight(200);
		System.out.println(s.getWidth());
		System.out.println(s.getHeight());
	}
}