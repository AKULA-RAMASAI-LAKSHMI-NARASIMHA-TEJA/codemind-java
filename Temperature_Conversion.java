import java.util.Scanner;
class temp
{
	public static void main(String args[])
	{
		float c,f;
		Scanner sc=new Scanner(System.in);
		c=sc.nextFloat();
		f=32+(c*(float)9/5);
		System.out.format("%.2f",f);	
		sc.close();
	}
}