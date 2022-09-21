import java.util.Scanner;
class rev{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a=0,d;
        n=sc.nextInt();
        while(n!=0){
            d=n%10;
            a=a*10 +d;
            n=n/10;
        }
        System.out.println(a);
    }
}