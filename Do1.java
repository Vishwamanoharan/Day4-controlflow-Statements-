import java.util.Scanner;
class  Do1
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		char ch='A';
		int i=1;
		int j=10;
		do{
			if(i%2==0)
			{
				System.out.println(i+"+"+i+++"=" + j);
			}
			else{

				System.out.println(ch+"*"+ch++ + "=" + j );
			}
			j-=2;
			i++;
		}
		while(i<=10);

		}
	}
}
