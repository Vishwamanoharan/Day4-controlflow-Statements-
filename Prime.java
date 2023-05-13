import java.util.Scanner;
class Prime 
{
	static Scanner s=new Scanner(System.in);
	static boolean b=false;
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(num==0||num==1)
		{
			System.out.println("The number is nor composite or nor prime");
		}
		else
		{
			for (int i =2;i<=num ;i++ )
			{
				if (num%i==0)
				{
					b=true;
					break;
				}
			}
			if (b)
			{
				System.out.println("Number is prime");
			}
			else{
				System.out.println("Number is not prime");
			}
		}
	}
}
