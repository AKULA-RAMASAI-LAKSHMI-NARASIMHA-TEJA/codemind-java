import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,c=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-2;i++)
        {
            if((a[i]%2!=0 && a[i+1]%2==0 && a[i+2]%2!=0))
            {
                c++;
            }
        }
        System.out.print(c);
    }
}