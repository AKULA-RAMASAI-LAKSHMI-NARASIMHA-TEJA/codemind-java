import java.util.Scanner;
class dig{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,d,m=0;
        n=sc.nextInt();
        while(n!=0){
            d=n%10;
            if(m<d){
                m=d;
            }
            n=n/10;
        }
        System.out.println(m);
    }
}