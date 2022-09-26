import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Index
{
	static void signUpPage()throws Exception
	{
		System.out.println("<-----------------WELCOME TO SIGNUP PAGE---------------------------->");
		InputStreamReader ip = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ip);
		  System.out.println("Enter your FullName");
		  String Name = br.readLine();
		  System.out.println("Enter UserName");
		  String UN = br.readLine(); 
		  System.out.println("Enter Password");
		  String PW1 = br.readLine();
		  System.out.println("Confirm Passsword");
		  String PW2 = br.readLine();
		  String PW = "";
	  if(PW1.equals(PW2))
	  {
	    PW = PW1;
          
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gokul","root","Root@25");
		  PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Users WHERE UserName = (?)");
		  pstmt.setString(1,UN);
		  ResultSet rs = pstmt.executeQuery();
		  if(rs.next())
		  {
			System.err.println("username Already Exist!\nTry Different Username.");
		  }else {
			  PreparedStatement pstmt1 = con.prepareStatement("INSERT INTO Users (Name,UserName,Password) VALUES (?,?,?)");
			  pstmt1.setString(1, Name);
			  pstmt1.setString(2, UN);
			  pstmt1.setString(3, PW);
			  int i = pstmt1.executeUpdate();
			  System.out.println();
			  System.out.println("------------------------------------------------------------------");
			  if(i>0) {
			  System.out.println("Thanks!\nYour Account has been Created Successfully "+Name+".");
			  }
			  br.close();
			  con.close();
		  }
	  }else {
		  System.err.println("Password Mismatch!\nTry Again.");
	  } 
	}
	static void loginPage() throws Exception
	{
		 System.out.println("                 ***WELCOME TO LOGIN PAGE***");
		 System.out.println("<-------------------------------------------------------------->");
		 InputStreamReader ip = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(ip);
		 System.out.println("Enter UserName");
		 String UN = br.readLine();
		 System.out.println("------------------------");
		 System.out.println("Enter Password");
		 String PW = br.readLine();
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gokul","root","Root@25");
		 PreparedStatement stmt = con.prepareStatement("SELECT Name FROM users WHERE UserName = (?) AND Password = (?)");
		 stmt.setString(1,UN);
		 stmt.setString(2, PW);
		 ResultSet rs = stmt.executeQuery();
		 if (rs.next())
		 {
		   System.out.println("-------------------------------------------------------------");
		   System.out.println();
		   System.out.println("Hello "+rs.getString(1)+", \nYou've Successfully Logged in.");
		 }else {
			 System.err.println("Invalid Login Credentials!\nTry Again.");
		 }	
	}
	public static void main(String[] args) throws Exception 
	{
     InputStreamReader ip = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(ip);
     System.out.println("<---------------------------------WELCOME------------------------------------->!");
     System.out.println("If you are an Existing User Please Enter 'L' to Login");
     System.out.println("If you are a New User please Enter 'S' to Signup");
     String ch = br.readLine();
       switch(ch) 
       {
       case("L"):
    	   loginPage();
          break;
       case("S"):
    	   signUpPage();
    	   break;
       default:
    	   System.err.println("invalid input!");
       }
	}

}
