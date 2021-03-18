package decision_making;

public class StaticAndNonStatic {
	static
	{
		System.out.println("first static block get executed");
		System.out.println(StaticAndNonStatic.i);
	}
	static int i=0;
	static char ch='a';
	static float f =1.0f;
	static double d=100;
	static long  l=200;
	public static void static1()
	{
		System.out.println("this is a static method");
		System.out.println(i);
		System.out.println(ch);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
	}
	public static void main(String[] args) {
		
		static1();
	}

	

}
