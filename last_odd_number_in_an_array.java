import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,num=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
            {
                num=a[i];
            }
        }
        System.out.print(num);
    }
}