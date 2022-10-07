import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,s=0,avg,c=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        avg=s/n;
        for(i=0;i<n;i++)
        {
            if(a[i]==avg)
            {
                c=1;
                break;
            }
        }
        if(c==1)
        {
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}