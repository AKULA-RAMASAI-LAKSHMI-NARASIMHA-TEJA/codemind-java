import java.util.*;
class sample{
    public static boolean pal(int n)
    {
        int a=n,b=0;
        while(n!=0)
        {
            int d=n%10;
            b= b*10 +d;
            n/=10;
        }
        if(a==b)
        return true;
        else
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n-1,b=n+1;
        for(int i=a;i>0;i--)
        {
            if(pal(i))
            {
                a=i;
                break;
            }
        }
        for(int i=b;i>0;i++)
        {
            if(pal(i))
            {
                b=i;
                break;
            }
        }
        if(n-a==b-n){
            System.out.println(a+" "+b);
        }
        else if(n-a<b-n){
            System.out.println(a);
        }
        else
        System.out.println(b);
    }
}