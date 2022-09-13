import java.util.*;
public class Fibonacci
{
    static int n1 = 0;
    static int n2 = 1;
    static int n3;
    static void printFibonacci(int n)
    {
       for(int i=1;i<=n;i++)
       {
         n3 = n1+n2;
         System.out.print(" "+n3);
         n1=n2;
         n2=n3;
       } 
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of sequences");
        int n = sc.nextInt();
        System.out.print(n1+" "+n2);
        printFibonacci(n-2);
    }
}