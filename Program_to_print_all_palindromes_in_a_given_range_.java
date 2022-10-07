import java.util.Scanner;
class sample
{
    public static boolean pal(int n)
    {
        int temp=n,d=0,r=0;
        while(n!=0)
        {
            d=n%10;
            r=r*10 +d;
            n=n/10;
        }
        if(r==temp)
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
        int a=sc.nextInt(),b=sc.nextInt();
        for(int i=a;i<b;i++)
        {
            if(pal(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}