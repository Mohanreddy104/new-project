package programing;

public class PrimeNumber {
	public static boolean isprime(int num)
	{
		for (int i=2 ;i<=num/2;i++)
		{
			if (num%2==0)
			{
				return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) {
		for (int i=0;i<=20;i++)
		{
			int num=0;
			boolean bol = isprime(i);
			if (bol)
			{
				
				System.out.println("it is prime number"+i);
				num++;
			}
			
//			else
//			{
//				System.out.println("it is not prime number");
//			}

			
		}
	}

}
