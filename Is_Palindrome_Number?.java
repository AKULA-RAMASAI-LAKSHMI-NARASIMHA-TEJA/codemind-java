


import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=a;
        d=0;
        while(a!=0)
        {
            c=a%10;
            d=d*10+c;
            a=a/10;
        }
        if(d==b)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
    }
}