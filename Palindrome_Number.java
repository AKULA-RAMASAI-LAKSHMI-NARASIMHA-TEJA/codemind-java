import java.util.Scanner;
class pal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t,n,d;
        t=sc.nextInt();
        while(t!=0){
            t--;
            n=sc.nextInt();
            int temp=n,a=0;
            while(n!=0){
                d=n%10;
                a=a*10 +d;
                n/=10;
            }
            if(a==temp){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}