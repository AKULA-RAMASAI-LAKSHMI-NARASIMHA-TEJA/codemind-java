import java.util.*;
class search
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
        int c=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i:b)
        {
            al.add(i);
        }
        System.out.println(al.indexOf(c));
        
    }
}