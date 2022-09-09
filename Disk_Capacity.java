import java.util.Scanner;
class xyz
{
	public static void main(String args[])
	{
		long a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLong();
		b=sc.nextLong();
		c=sc.nextLong();
		System.out.println(a*b*c*2*512);	
		sc.close();
	}
}