import java.util.Scanner;
class strong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d,s=n*n,p=0;
        while(s!=0)
        {
            d=s%10;
            s=s/10;
            p+=d;
        }
        if(n==p)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        sc.close();
    }
}