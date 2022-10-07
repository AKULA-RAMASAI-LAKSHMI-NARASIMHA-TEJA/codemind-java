import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        System.out.format("%.2f",((float)(f-32)*5)/9);
    }
}