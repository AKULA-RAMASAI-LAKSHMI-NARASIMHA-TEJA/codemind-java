import java.util.*;
class octal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=Integer.toString(a);
        int octal = Integer.parseInt(s,8);
        String binaryValue = Integer.toBinaryString(octal);
        System.out.print(binaryValue);
    }
}