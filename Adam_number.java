import java.util.Scanner;
class adam{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a,b=0,c,d,e=0;
        n=sc.nextInt();
        a=n*n;
        while(n!=0){
            d=n%10;
            b=b*10 +d;
            n=n/10;
        }
        c=b*b;
        while(c!=0){
            d=c%10;
            e=e*10 +d;
            c=c/10;
        }
        if(a==e){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}