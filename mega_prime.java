import java.util.Scanner;
class mega
{
    public static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
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
        int n,d,c=0;
        n=sc.nextInt();
        if(prime(n))
        {
            while(n!=0)
            {
                d=n%10;
                n=n/10;
                if(!prime(d))
                {
                    c=1;
                    break;
                }
            }
            if(c==1)
            {
                System.out.println("Not Mega Prime");
            }
            else
            {
                System.out.println("Mega Prime");
            }
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
}