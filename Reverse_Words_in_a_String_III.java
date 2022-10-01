import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2[]=s1.split(" ");
        String c;
        for(int i=0;i<s2.length;i++)
        {
            String d=s2[i];
            for(int j=d.length()-1;j>=0;j--)
            {
                System.out.print(d.charAt(j));
            }
            System.out.print(" ");
        }
    }
}