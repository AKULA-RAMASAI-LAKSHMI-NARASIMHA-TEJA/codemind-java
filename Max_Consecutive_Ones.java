import java.util.*;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0,m=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            //System.out.print(a[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                c++;
            }
            else
            {
                if(c>m)
                {
                    m=c;
                }
                c=0;
            }
        }
        if(c>m)
        {
            m=c;
        }
        System.out.print(m);
    }
}