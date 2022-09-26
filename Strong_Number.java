import java.util.Scanner;
class strong
{
    public static int fact(int n)
    {
        int p=1;
        for(int i=1;i<=n;i++)
        {
            p*=i;
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d,s=0,temp=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            s+=fact(d);
        }
        if(s==temp)
        {
            System.out.println("The number "+temp+" is a strong number");
        }
        else
        {
            System.out.println("The number "+temp+" is not a strong number");
        }
        sc.close();
    }
}