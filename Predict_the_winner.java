import java.util.*;
class winner
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,x=0,y=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i<n/2)
            {
                x+=a[i];
            }
            else
            {
                y+=a[i];
            }
        }
        if(Math.abs(x-y)%4==0)
        {
            System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}