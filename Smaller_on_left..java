import java.util.*;
class sample
{
    public static int fun(int a[],int i)
    {
        for(int j=i-1;j>-1;j--)
        {
            if(a[j]<a[i])
            return a[j];
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print(-1+" ");
        for(int i=1;i<n;i++)
        {
            System.out.print(fun(a,i)+" ");
        }
    }
}