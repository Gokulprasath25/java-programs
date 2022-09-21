import java.util.Scanner;
public class ReverseOrPalindrome
{
    static String rev;
	static String getReverse(String s)
	{
	  StringBuffer sb = new StringBuffer(s);
	  sb.reverse();
	  rev = sb.toString();
	  return rev;
	}
	static void checkPalindrome(String s)
	{ 
	  String S = s.toUpperCase();
	  getReverse(S);
	  if(S.equals(rev))
		{
		System.out.println("It is a Palindrome Word");
		}else {
		System.out.println("It is not a Palindrome Word");
		}
	}
public static void main(String [] args)
  { 
	Scanner sc = new Scanner(System.in);
	System.out.println("                    -->WELCOME<--");
	System.out.println("To Reverse A Word Enter - 'R'\nTo Check Whether The Word is Palindrome or Not Enter - 'P' ");
	String ch = sc.next();
	switch(ch)
	{
	case"R":
		System.out.println("Enter the word to Reverse");
		String s = sc.next();
        String Reversed = getReverse(s);
		System.out.println("The Reversed word is : "+Reversed );
		break;
	case"P":
		System.out.println("Enter the word to check Palindrome");
		String s1 = sc.next();
		checkPalindrome(s1);
		break;
	default:
		System.out.println("Invalid key");
		sc.close();
	}
  }
}