package decision_making;

public class Method_Overloading {
	public static void method_Overloading1(int i)
	{
		System.out.println(i);
	}
	public static void method_overloading(int i,int j)
	{
		int sum;
		sum=i+j;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		method_overloading(10, 20);
		method_Overloading1(55);
	}

}
