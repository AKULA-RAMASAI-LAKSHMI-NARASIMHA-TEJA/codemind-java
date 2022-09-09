import java.util.Scanner;
class area
{
	public static void main(String args[])
	{
		double a,b,c,s,ar;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		s=(a+b+c)/2;
		ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.format("%.2f",ar);	
		sc.close();
	}
}