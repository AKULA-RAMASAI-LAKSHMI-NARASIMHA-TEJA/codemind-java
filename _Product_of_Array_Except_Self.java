import java.util.*;
class unique
{
    public static int prod(int a[],int k,int n)
    {
        int c=1;
        for(int i=0;i<n;i++)
        {
            if(i!=k)
            {
                c*=a[i];
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0,m=-1;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(prod(a,i,n)+" ");
        }
    }
}