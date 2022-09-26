import java.util.Scanner;
class strong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d,s=0,p=1;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            s+=d;
            p*=d;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
        sc.close();
    }
}