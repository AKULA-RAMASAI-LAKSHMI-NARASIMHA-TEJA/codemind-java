import java.util.Scanner;
class valid
{
    public static boolean div(int n)
    {
        int temp=n,d;
        while(n!=0)
        {
            d=n%10;
            if(d==0)
            {
                return false;
            }
            if(temp%d!=0)
            {
                return false;
            }
            n/=10;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(div(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}