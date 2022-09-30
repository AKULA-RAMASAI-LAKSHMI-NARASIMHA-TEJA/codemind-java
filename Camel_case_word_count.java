import java.util.Scanner;
class camel{
    public static void main(String[] args)
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                c+=1;
            }
        }
        if(Character.isLowerCase(s.charAt(0)))
            {
                c+=1;
            }
        System.out.println(c);
    }
}