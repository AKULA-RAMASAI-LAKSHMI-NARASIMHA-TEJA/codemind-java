import java.util.*;
class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(),c=0;
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
            int len=(int)Math.log10(a[i])+1;
            if(len%2==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}