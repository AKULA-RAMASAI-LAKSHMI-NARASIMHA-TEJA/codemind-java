import java.util.*;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(),s2=sc.nextLine();
        String s=s1+s2;
        char a[]=s.toCharArray();
        Arrays.sort(a);
        System.out.print(String.valueOf(a));
    }
}