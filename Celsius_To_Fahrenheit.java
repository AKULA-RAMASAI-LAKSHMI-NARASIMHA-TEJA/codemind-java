import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        System.out.format("%.2f",((float)c*9/5)+32);
    }
}