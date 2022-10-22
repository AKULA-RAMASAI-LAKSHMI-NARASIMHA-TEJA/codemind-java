import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int l=(int)Math.log10(n)+1;
        int a=n%(int)Math.pow(10,k);
        int b=n/(int)Math.pow(10,l-k);
        System.out.println(Math.abs(a-b));
    }
}