import java.util.Scanner;
class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                c=1;
                break;
            }
        }
        if(c==1){
            System.out.println("not a prime");
        }
        else{
            System.out.println("prime");
        }
    }
}