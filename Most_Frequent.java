import java.util.*;
class most
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
        ArrayList<Integer> al=new ArrayList<Integer>();
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int ele:b)
        {
            al.add(ele);
            hs.add(ele);
        }
        ArrayList<Integer> al1=new ArrayList<Integer>();
        for(int ele:hs)
        {
            al1.add(Collections.frequency(al,ele));
        }
        ArrayList<Integer> al2=new ArrayList<Integer>(hs);
        int c=Collections.max(al1);
        int d=al1.indexOf(c);
        System.out.print(al2.get(d));
        
    }
}