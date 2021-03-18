package decision_making;

public class Patterns {
	public static void main(String[] args) {
		int n=4;
		int ch=65;
		
		for (int i=0;i<=n;i++)
		{
			
			for (int j=0;j<=i;j++)
			{
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
	}

}
