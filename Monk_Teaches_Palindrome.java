import java.util.Scanner;
class sample
{
    public static boolean ispali(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            sc.nextLine();
            String s=sc.next();
            String s1=s.toLowerCase();
            int c=s1.length();
            if(ispali(s1) && c%2==0)
            {
                System.out.println("YES EVEN");
            }
            else if(ispali(s1) && c%2!=0)
            {
                System.out.println("YES ODD");
            }
            else
            {
                System.out.println("NO");
            }
            
        }
    }
}