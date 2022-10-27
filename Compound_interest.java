import java.util.*;
class compound
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Double p=sc.nextDouble();
        Double r=sc.nextDouble();
        Double t=sc.nextDouble();
        Double ci=p*(Math.pow((1+r/100),t));
        System.out.printf("%.2f",ci);
    }
}