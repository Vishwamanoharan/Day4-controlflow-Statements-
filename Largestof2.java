import java.util.Scanner;
class Largestof2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		System.out.println("Enter c value");
		int c=s.nextInt();


		if(a>b && a>c)
		{
			if(b>c)
			{
				System.out.println("b is 2nd largest");

			}
			else
			{
				System.out.println("c is 2nd largest");

			}
		}

		else if(b>c)
		{
			if(a>c)
			{
				System.out.println("a is 2nd largest");

			}
			else
			{
				System.out.println("c is 2nd largest");
			}
		}

		else {
			if(a>b)
			{
				System.out.println("a is 2nd largest");
			}
			else
			{
				System.out.println("b is 2nd largest");
			}
		}




	}
}
