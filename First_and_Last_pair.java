import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        ArrayList<Integer> a=new ArrayList<Integer>();
        while(al.size()!=0)
        {
            a.add(al.get(0));
            al.remove(0);
            if(al.size()!=0)
            {
                a.add(al.get(al.size()-1));
                al.remove(al.size()-1);
            }
        }
        if(a.size()%2!=0)
        a.add(0);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}