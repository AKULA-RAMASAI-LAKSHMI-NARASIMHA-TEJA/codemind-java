import java.util.Scanner;
class xyz
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.format("%d",a%b);	
		sc.close();
	}
}