package decision_making;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.println("please enter the char:");
		Scanner scan= new Scanner(System.in);
		char ch=scan.next().charAt(0);
	
	switch(ch)
	{


	case'e': System.out.println("vowel");
	break;
	case'i': System.out.println("vowel");
	break;
	case'o': System.out.println("vowel");
	break;
	case'u': System.out.println("vowel");
	break;
	default : System.out.println("consonets");
	}
	}

}
