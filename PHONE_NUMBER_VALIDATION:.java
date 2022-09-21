import java.util.Scanner;
class phone{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n,a=0,c=0,d;
        n=sc.nextLong();
        while(n!=0){
            d=n%10;
            a=a*10 +d;
            n/=10;
            c++;
        }
        if(c==10 && a%10!=0){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}