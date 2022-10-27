import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int c=0,d=0;
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
            if(b[i]%2==0)
            {
                c+=1;
            }
            else
            {
                d+=1;
            }
        }
        System.out.print(c+" "+d);
        
    }
}