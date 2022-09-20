import java.util.Scanner;
class fib{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,a=0,b=1,d;
        n=sc.nextInt();
        while(a<=n)
        {
            if(a==n){
                c=1;
                break;
            }
            d=a+b;
            a=b;
            b=d;
        }
        if(c==1){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}