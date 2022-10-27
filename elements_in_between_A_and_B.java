import java.util.*;
class minimum
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
        int d=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int ele:b)
        {
            if(ele>=c && ele<=d)
            {
                al.add(ele);
            }
        }
        if(al.isEmpty())
        {
            System.out.print(-1);
        }
        else
        {
            for(int ele:al)
            {
                System.out.print(ele+" ");
            }
        }
    }
}