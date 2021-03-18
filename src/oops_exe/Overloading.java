package oops_exe;

public class Overloading {
	public void overload1(int i)
	
	{
	System.out.println(i);	
	}
	public void dence()
	{
		System.out.println("mohan will dance");
	}
	public void overload2(int i,int j)
	{
		int res=i+j;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Overloading over= new Overloading();
		over.dence();
		over.overload1(10);
		over.overload2(20, 10);
	}
	

}
