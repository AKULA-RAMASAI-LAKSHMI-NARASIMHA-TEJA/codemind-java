import java.util.Scanner;
class fib
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c=a+b;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}