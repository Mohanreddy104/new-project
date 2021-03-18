package oops_exe;

import java.util.Scanner;

public class Exem {
	public void age(int a)
	{
		if (a<=15&&a>=20)
		{
			System.out.println(" he is aligeble for vote");
		}
		else
		{
			System.out.println("he is not aligeble for vote");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("plese enter the age:");
		Scanner scan= new Scanner(System.in);
		int age=scan.nextInt();
		Exem ex=new Exem();
		ex.age(age);
		

		
	}

}
