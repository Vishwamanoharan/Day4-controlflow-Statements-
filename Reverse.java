import java.util.Scanner;
class Reverse 
{
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args)
		
	{

		int i=100;
		String s1="Java",s2="Sql";
		while (i>=1)
		{
			if (i%2==0)
			{
						System.out.println(i+"  "+s1);

			}
			else {
						System.out.println(i+"  "+s2);

			}
			i--;
		}


	}
}
