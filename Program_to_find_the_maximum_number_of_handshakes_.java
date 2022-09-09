import java.util.Scanner;
class xyz
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(n*(n-1)/2);	
		sc.close();
	}
}