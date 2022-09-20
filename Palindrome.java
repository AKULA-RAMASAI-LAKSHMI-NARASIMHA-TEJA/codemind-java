import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b=0,d;
        n=sc.nextInt();
        a=n;
        while(n!=0)
        {
            d=n%10;
            b=b*10 +d;
            n=n/10;
        }
        if(a==b)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}