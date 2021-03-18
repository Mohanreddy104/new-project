package programing;

import java.util.Scanner;

public class StringReverce {
	public static void main(String[] args) {
		System.out.println("please enter Steing ");
		Scanner scan= new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println("before converting string :"+str);
		char []ch= str.toCharArray();
		String result="";
		for(int i=0;i<ch.length;i++)
		{
			result=ch[i]+result;
		}
		System.out.println(result);
	}

}
