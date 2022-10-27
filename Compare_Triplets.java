import java.util.Scanner;
class compare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=3;
        int b[]=new int[a];
        int c[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            c[i]=sc.nextInt();
        }
        int d=0,e=0;
        for(int i=0;i<a;i++)
        {
            if(b[i]>c[i])
            {
                d+=1;
            }
            else if(b[i]<c[i])
            {
                e+=1;
            }
        }
        System.out.print(d+" "+e);
    }
}