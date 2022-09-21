import java.util.Scanner;
class amicable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,d=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<a;i++){
            if(a%i==0){
                c+=i;
            }
        }
        for(i=1;i<b;i++){
            if(b%i==0){
                d+=i;
            }
        }
        if(a==d && b==c){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
    }
}