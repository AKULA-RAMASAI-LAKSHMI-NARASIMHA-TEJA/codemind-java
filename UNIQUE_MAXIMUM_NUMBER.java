import java.util.*;
class unique
{
    public static int count(int a[],int k)
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                c++;
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
            if(count(a,a[i])==1)
            {
                if(a[i]>m)
                {
                    m=a[i];
                }
                c=1;
            }
        }
        if(c==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(m);
        }
    }
}