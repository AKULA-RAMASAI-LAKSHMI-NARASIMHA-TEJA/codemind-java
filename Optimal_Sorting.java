import java.util.*;
class sample
{
    public static int sort(int a[],int n)
    {
        int c;
        int [] b=new int [n];
        for(int i=0;i<n;i++)
            b[i]=a[i];
        for(int j=0;j<n-1;j++)
        {
            for(int i=0;i<n-1;i++)
            {
                if(a[i]>a[i+1])
        	    {
            	    c=a[i+1];
            	    a[i+1]=a[i];
            	    a[i]=c;
        	    }
            }
        }
        c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=b[i])
                c=1;
        }
        if(c==1)
            c=a[n-1]-a[0];
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int [] arr=new int [n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println(sort(arr,n));
        }
    }
}