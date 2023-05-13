import java.util.Scanner;
class Loop1 
{
	public static void main(String[] args) 
	{
		int a=1;
		while (a<=5)
		{
			System.out.println("Hello World!");
			a++;
		}
		
	}
}

class Loop2
{
	public static void main(String[] args)
	{
		Loop1.main(args);
		Scanner s=new Scanner(System.in);
		System.out.println("enter a B value: \n");
		int b=s.nextInt();
		while (b<=4)
		{
			System.out.println("hello");
			b++;
		}
		
	}
}

class Loop3
{
	public static void main(String [] args)
	{
		Loop1.main(args);
		Loop2.main(args);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter b value");
		int b = s.nextInt();
		while (b<=8)
		{
			System.out.println("vichu");
			b++;
		}
		int c=s.nextInt();
		while (c<=3)
		{
			System.out.println("s");
			c++;
		}



}
}

class Loop4
{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args)
	{
		int task=1;
		while (task<=2)
		{
			System.out.println("Reapting for the"+task+"times");
			System.out.println("Enter a value");
			int a = s.nextInt();
			System.out.println("Enter b value");
			int b = s.nextInt();
			
			 int res=(a>b)?a:b;
			 System.out.println("largest of two number "+res);
			task++;

		}
	}
}

class Loop5

{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the value");
		int num=s.nextInt();

		int count=0;
		while (num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("print "+count);
	}
}