import java.util.Scanner;
class valid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if( Math.sqrt(n)==(int)Math.sqrt(n))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}