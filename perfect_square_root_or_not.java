import java.util.Scanner;
class square{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a;
        n=sc.nextInt();
        a=(int)Math.sqrt(n);
        if(n==a*a){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}