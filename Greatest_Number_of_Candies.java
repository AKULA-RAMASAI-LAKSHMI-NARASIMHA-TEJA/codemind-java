import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int k=sc.nextInt();
        int m=Collections.max(a);
        for(int i=0;i<n;i++){
            if(a.get(i)+k>=m)
            System.out.print("True ");
            else
            System.out.print("False ");
        }
    }
}