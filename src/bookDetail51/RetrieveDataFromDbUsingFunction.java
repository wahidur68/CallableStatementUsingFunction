package bookDetail51;
import java.util.*;
import java.sql.*;
public class RetrieveDataFromDbUsingFunction {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","wahidur");
			Scanner sc=new Scanner(System.in);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
