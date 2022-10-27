import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt(),s=0;
            int a[]=new int[n-1];
            for(int j=0;j<n-1;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int j=0;j<n-1;j++)
            {
                s+=a[j];
            }
            int sum=n*(n+1)/2;
            System.out.println(sum-s);
        }
    }
}