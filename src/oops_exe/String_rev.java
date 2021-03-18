package oops_exe;

public class String_rev {
	public static String reverceString(String str)
	{
		char []ch=str.toCharArray();
		String reverce="";
		for (int i=0;i<ch.length;i++)
		{
			reverce= ch[i]+reverce;
		}
		return reverce;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new String_rev().reverceString("java"));
		
		
		
		
		
		
		
	}
}
