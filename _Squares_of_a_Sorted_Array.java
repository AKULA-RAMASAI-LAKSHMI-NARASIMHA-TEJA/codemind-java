import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=a[i]*a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}