import java.util.Scanner;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(m<ch)
            {
                m=ch;
            }
        }
        System.out.print((char)m);
    }
}