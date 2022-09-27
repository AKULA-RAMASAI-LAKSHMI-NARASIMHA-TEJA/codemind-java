import java.util.Scanner;
class valid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0,p=1,d;
        while(n!=0)
        {
            d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        System.out.print(p-s);
    }
}