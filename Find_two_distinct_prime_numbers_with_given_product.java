import java.util.Scanner;
class prime
{
    public static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<(int)Math.sqrt(n);i++)
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
        int a=sc.nextInt();
        int d=0,b=0,c=0;
        for(int i=1;i<a;i++)
        {
            for(int j=2;j<a;j++)
            {
                if(prime(i) && prime(j))
                {
                    if(i*j==a)
                    {
                        d=1;
                        b=i;
                        c=j;
                        break;
                    }
                }
            }
        }
        if(d==1)
        {
            System.out.print(c+" "+b);
        }
        else
        {
            System.out.println(-1);
        }
    }
}