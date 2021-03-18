package oops_exe;

import java.util.Scanner;

public class Swapping_Tow_Number {
	public static void main(String[] args) {
		System.out.println("please enter a value A:");
		Scanner sca=new Scanner(System.in);
		int a=sca.nextInt();
		System.out.println("please enter a value B:");
		int b =sca.nextInt();
		System.out.println("befor swapping the number:");
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after the swapping the numbers:"+a+"and"+b);
		
	}

}
