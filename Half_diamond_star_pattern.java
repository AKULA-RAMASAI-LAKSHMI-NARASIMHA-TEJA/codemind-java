import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(3<=n && n<=100){
        for(int i=1;i<=2*n-1;i++)
		{
			int k=i<=n?i:n-i%n;
			for(int j=1;j<=k;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
        }
        else{
            System.out.println("The pattern is not possible");
        }
    }
}