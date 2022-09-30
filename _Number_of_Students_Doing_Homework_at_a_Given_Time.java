import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int b[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            b[i]=sc.nextInt();
        }
        int k=sc.nextInt(),c=0;
        for(int i=0;i<n1;i++)
        {
            if(a[i]<=k && b[i]>=k)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}