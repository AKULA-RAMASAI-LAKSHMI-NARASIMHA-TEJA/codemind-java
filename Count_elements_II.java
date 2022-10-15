import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> b=new HashSet<>();
        HashSet<Integer> c=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            a.add(t);
            c.add(t);
        }
        for(int i=0;i<m;i++)
        {
            int t=sc.nextInt();
            b.add(t);
            c.add(t);
        }
        int d=0;
        for(int i:c)
        {
            if(a.contains(i) && b.contains(i))
            {
                d+=1;
            }
        }
        System.out.println(c.size()-d);
    }
}