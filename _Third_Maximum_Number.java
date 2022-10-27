import java.util.*;
class third
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }

        HashSet<Integer> hs=new HashSet<Integer>();
        for(int ele:b)
        {
            hs.add(ele);
        }
        ArrayList<Integer> al=new ArrayList<Integer>(hs);
        if(al.size()>=3)
        {
            for(int i=0;i<2;i++)
            {
                int c=Collections.max(al);
                al.remove(Integer.valueOf(c));
            }
            System.out.print(Collections.max(al));
        }
        else
        {
            System.out.print(Collections.max(al));
        }
    }
}