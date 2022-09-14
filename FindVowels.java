import java.util.Scanner;
public class FindVowels 
{
 public static void main(String [] args)
 {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Name");
	 String S = sc.next();
	 check(S);
	 sc.close();
 }
 static void check(String S)
 {
	 char []ch = S.toCharArray();
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		
		for(int n=0;n<ch.length;n++)
		{
		  if(ch[n]=='a'||ch[n]=='A') 
		  {
			a++;  
		  }else if(ch[n]=='e'||ch[n]=='E')
		  {
			e++;
		  }else if(ch[n]=='i'||ch[n]=='I')
		  {
			i++;
		  }else if(ch[n]=='o'||ch[n]=='O') 
		  {
			o++;  
		  }else if(ch[n]=='u'||ch[n]=='U')
		  {
			u++;
		  }
		}int total = a+e+i+o+u;
		System.out.println("Total No of Vowels present : "+total);
		if(a>0)
		{
		  if(a>1)
		   {
	       System.out.println(a+" -A's");
		   }else {
		   System.out.println(a+" -A");
		   }
		}
		if(e>0)
		 {
		   if(e>1) {
	       System.out.println(e+" -E's");
		   }else {
		   System.out.println(e+" -E"); 
		   }
		 }
		if(i>0)
		 {
		   if(i>1) {
	       System.out.println(i+" -I's");
		   }else {
		   System.out.println(i+" -I");
		   }
		 } 
		if(o>0)
		{
		  if(o>1) {
		  System.out.println(o+" -O's");
		  }else {
		  System.out.println(o+" -O");
		  }
		} 
		if(u>0)
		{
		  if(u>1) {
		  System.out.println(u+" -U's");
		  }else {
	      System.out.println(u+" -U");
		  }
		}
 }
}