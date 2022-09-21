import java.util.Scanner;
class lcm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i>0;i--){
            if(a%i==0 && b%i==0){
                break;
            }
        }
        System.out.println((a*b)/i);
    }
}