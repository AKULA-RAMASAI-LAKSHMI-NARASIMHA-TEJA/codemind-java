import java.util.*;
class unique
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
        int c=0;
        for(int ele:al)
        {
            if(Collections.frequency(al,ele)==1 && ele%2!=0)
            {
                c+=ele;
            }
        }
         System.out.print(c);
    }
}