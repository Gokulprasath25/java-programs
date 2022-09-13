import java.util.Scanner;
public class Armstrong
{
	static void checkArmstrong(int n)
	{
		int length=0;
		int r=0;
		int sum=0;
		for(int i=n;i>0;i/=10)
		{
		   length++;
		}
		for(int j=n;j>0;j/=10)
		{
		  r = j%10;
		  sum = (int) (sum+Math.pow(r, length));
		}
		if(n==sum)
		{
			System.out.println("This is Armstrong");
		}else {
			System.out.println("Not an Armstrong");
		}
	}
 public static void main(String []args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number to check ");
	 int n = sc.nextInt();
	 checkArmstrong(n);
	 sc.close();
 }
}