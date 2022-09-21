import java.util.Scanner;

class circular{
    public static boolean prime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,temp,d,a=0;
        n=sc.nextInt();
        temp=n;
        while(temp!=0){
            d=temp%10;
            a=a*10 +d;
            temp/=10;
        }
        if(prime(n) && prime(a)){
            System.out.println("circular prime");
        }
        else if(prime(n)){
            System.out.println("prime but not a circular prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}