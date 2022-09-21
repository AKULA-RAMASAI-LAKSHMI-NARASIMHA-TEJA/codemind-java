import java.util.Scanner;
class sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t,a,b;
        t=sc.nextInt();
        while(t!=0){
            t--;
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}