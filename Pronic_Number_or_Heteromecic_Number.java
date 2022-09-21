import java.util.Scanner;
class pronic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=1;i<=(int)Math.sqrt(n);i++){
            if(i*(i+1)==n){
                c=1;
                break;
            }
        }
        if(c==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}