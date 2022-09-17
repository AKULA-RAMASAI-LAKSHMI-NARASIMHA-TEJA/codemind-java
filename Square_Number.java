import java.util.Scanner;
class xyz
{
    public static void main(String args[])
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i*i + j*j==n)
                {
                    c+=1;
                }
            }
        }
        if(c>=1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}