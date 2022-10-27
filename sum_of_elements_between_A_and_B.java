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
        int e=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int ele:b)
        {
            if(ele>=c && ele<=d)
            {
                al.add(ele);
                e+=ele;
            }
            
        }
      System.out.print(e);
    }
}