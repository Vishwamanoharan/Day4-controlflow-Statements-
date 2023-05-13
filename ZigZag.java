class ZigZag 
{
	public static void main(String[] args) 
	{
		int i=1;
		char ch='A';

		int m=1;
		while (ch<='Z')
		{
			if (m%2==0)
			{
				System.out.println(i+"*"+ch+++"="+i++);
				
			}
			else{
				System.out.println(ch+++"*"+i+"="+i++);
				
			}
			m++;
			
			
		}
		
	}
}
