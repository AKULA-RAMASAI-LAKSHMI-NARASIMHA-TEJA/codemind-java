import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),e=0,c=0,o=0,d=0;
        while(n!=0)
        {
            d=n%10;
            if(d%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
            c++;
            n/=10;
        }
        if(e==c)
        {
            System.out.println("Even");
        }
        else if(o==c)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}