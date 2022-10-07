import java.util.Scanner;
class sample
{
    public static int rev(int n)
    {
        int d=0,r=0;
        while(n!=0)
        {
            d=n%10;
            r=r*10 +d;
            n=n/10;
        }
        return r;
    }
    public static boolean pal(int n)
    {
        if(rev(n)==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=0;
        while(true)
        {
            a=rev(n)+n;
            if(pal(a))
            {
                System.out.println(a);
                break;
            }
            else
            {
                n=a;
            }
        }
    }
}