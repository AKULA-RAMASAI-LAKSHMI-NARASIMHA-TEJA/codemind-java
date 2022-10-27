import java.util.*;
class pairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer> ();
        for(int i=0;i<a;i++)
        {
            al.add(sc.nextInt());
        }
        if(a%2!=0)
        {
            al.add(0);
        }
        for(int ele:al)
        {
            System.out.print(ele+" ");
        }
    }
}