import java.util.Scanner;
class num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a,b=0,d,len,c=0;
        n=sc.nextInt();
        len=(int)(Math.log10(n)+1);
        a=n*n;
        while(len!=0){
            d=a%10;
            b=b*10 +d;
            a=a/10;
            len--;
        }
        while(b!=0){
            d=b%10;
            c=c*10 +d;
            b/=10;
        }
        if(c==n){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}