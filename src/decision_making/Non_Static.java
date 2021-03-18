package decision_making;

public class Non_Static {
	int i;
	{
		System.out.println("this is not static block ");
		
	}
	Non_Static()
	{
		System.out.println("constructer");
	}
	public void nonStatic ()
	{
		System.out.println("this is non static method");
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		Non_Static non= new Non_Static();
		non.nonStatic();
		
	}
	
	

}
