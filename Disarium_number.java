import java.util.Scanner;
class num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,d,a=0;
        n=sc.nextInt();
        int len=(int)(Math.log10(n)+1),temp=n;
        while(len>0){
            d=n%10;
            a+=Math.pow(d,len);
            n=n/10;
            len-=1;
        }
        if(temp==a){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}