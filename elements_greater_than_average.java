import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0,i,avg,c=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        avg=s/n;
        for(i=0;i<n;i++)
        {
            if(a[i]>=avg)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}