import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (int i=0;i<n;i++)
            al.add(sc.nextInt());
        int k=sc.nextInt();
        Collections.rotate(al,k);
        for (int ele:al)
            System.out.print(ele+" ");
    }
}