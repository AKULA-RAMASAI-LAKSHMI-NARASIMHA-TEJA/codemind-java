import java.util.Scanner;
class robber{
    public static void main(String args[]){
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
            int t;
            t=sc.nextInt();
            if(t%2!=0){
                c++;
            }
        }
        if(c<=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}