import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt(),t,a,b;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            if( a<l || b<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                if(a==b)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}