import java.util.*;
class count
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
        int x=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int ele:b)
        {
            al.add(ele);
        }
        ArrayList<Integer> al1=new ArrayList<Integer>();
        for(int i:al)
        {
            if(al1.contains(i))
            {
                continue;
            }
            else
            {
                al1.add(i);
            }
        }
        ArrayList<Integer> al2=new ArrayList<Integer>();
        int c=0,d=0;
        float e;
         for(int i:al1)
         {
             if(x==Collections.frequency(al,i))
             {
                 al2.add(i);
             }
         }
         if(al2.isEmpty())
         {
             System.out.print(-1);
         }
         else
         {
             for(int ele:al2)
             {
                 System.out.print(ele+" ");
             }
         }
         
        
    }
}