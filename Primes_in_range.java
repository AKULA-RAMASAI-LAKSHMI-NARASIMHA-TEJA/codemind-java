import java.util.Scanner;
class loops
{
	public static boolean prime(int n)
	{
		if(n<2)
		{
			return false;
		}
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int a,b,i,c=0;
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a;i<=b;i++)
		{
			if(prime(i))
			{
				c+=1;
			}
		}
		System.out.print(c);
	}
}