package decision_making;

public class Constructor {
	Constructor()
	{
		System.out.println("this is no argument constructor");
		
	}
	Constructor(int i)
	
	{
		System.out.println("this is one argument constructor:"+i);
	}
public static void main(String[] args) {
	Constructor con= new Constructor(6);
	
	
}
}
