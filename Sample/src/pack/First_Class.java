package pack;

public class First_Class 
{
	
	
	public static  void m1()
	{
		int i=10;
		
		System.out.println(i);
	}
	
	public static void m2()
	{
		First_Class f=new First_Class();
		
		f.m1();
		m1();
	}
	
	 
	public static void main(String[] args)
	{
		First_Class.m2();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
