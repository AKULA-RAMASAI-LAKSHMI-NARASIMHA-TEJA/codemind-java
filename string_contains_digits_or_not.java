import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            sc.nextLine();
            String s=sc.next();
            int c=0;
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(Character.isDigit(ch))
                c++;
            }
            if(c!=0)
            System.out.println("Yes");
            else
            System.out.println("No");
            
        }
    }
}