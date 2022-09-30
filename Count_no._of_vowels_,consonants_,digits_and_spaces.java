import java.util.Scanner;
class count
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String vowels="aeiouAEIOU";
		String con="qwrtypsdfghjklzxcvbnmQWRTYPASDFGHJKLZXCVBNM";
		int v=0,c=0,w=0,d=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
			    d++;
			}
			else if(con.contains(ch+""))
				c++;
			else if(vowels.contains(ch+""))
				v++;
			else
			{
			    w++;
			}
			
		}
		System.out.println("Vowels: "+v);
		System.out.println("Consonants: "+c);
		System.out.println("Digits: "+d);
		System.out.println("White spaces: "+w);
	}

}
