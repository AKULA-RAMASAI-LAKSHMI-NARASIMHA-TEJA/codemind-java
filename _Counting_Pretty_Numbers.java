import java.util.Scanner;
class pretty
{
    public static void main(String args[])
    {
        int t,l,r;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            l=sc.nextInt();
            r=sc.nextInt();
            int c=0;
            for(int j=l;j<=r;j++){
                if(j%10==2 || j%10==3|| j%10==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}