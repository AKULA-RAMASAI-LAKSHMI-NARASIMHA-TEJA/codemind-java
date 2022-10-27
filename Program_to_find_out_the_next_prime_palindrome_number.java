import java.util.Scanner;
class palindrome
{
    public static boolean prime(int n)
    {
        int i;
        if(n<2)
        {
            return false;
        }
        for(i=2;i<=(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean pal(int n)
    {
        int a,b=0,c;
        c=n;
        while(n!=0)
        {
            a=n%10;
            b=b*10+a;
            n=n/10;
        }
        if(b==c)
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
        int i;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        i=a+1;
        while(i!=0)
        {
            if(prime(i))
            {
                if(pal(i))
                {
                    System.out.println(i);
                    break;
                }
            }
            i+=1;
        }
    
    }
}