package oops_exe;

public class String_and_Equals {
	public static void main(String[] args) {
		String s1=new String ("hello");
		String s2= new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
