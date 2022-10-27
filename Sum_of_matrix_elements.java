import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c[][]=new int[a][b];
        int d=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                c[i][j]=sc.nextInt();
                d+=c[i][j];
            }
        }
        System.out.print(d);
    }
}