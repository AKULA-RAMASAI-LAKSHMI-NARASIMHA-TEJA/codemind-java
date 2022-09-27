import java.util.Scanner;
class fact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt(),p=1;
            for(int j=1;j<=n;j++)
            {
                p*=j;
            }
            System.out.println(p);
        }
    }
}