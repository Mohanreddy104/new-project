package programing;

public class Whitout_Using_Models {
	public static int division(int a,int b)
	{
		int count=0;
		while(a>=b)
		{
			a=a-b;
			count++;
		}
		return a;
	}
	public static void main(String[] args) {
		int res= division(25,5);
		System.out.println(res);
	}

}
