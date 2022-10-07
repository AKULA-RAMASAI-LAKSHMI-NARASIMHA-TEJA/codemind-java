import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),j=0,k=0,l=0;
        int a[]=new int[n];
        int e[]=new int[n];
        int o[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                e[j++]=a[i];
            }
            else
            {
                o[k++]=a[i];
            }
        }
        for(int i=0;i<j;i++)
        {
            b[l++]=e[i];
        }
        for(int i=0;i<k;i++)
        {
            b[l++]=o[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}