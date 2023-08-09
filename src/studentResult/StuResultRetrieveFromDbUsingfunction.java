package studentResult;
import java.util.*;
import java.sql.*;
public class StuResultRetrieveFromDbUsingfunction {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","wahidur");
			Scanner sc=new Scanner(System.in);
			CallableStatement cs=con.prepareCall("{Call ?:=retrieveResult51(?)}");
			System.out.println("Enter RollNO");
			String roll=sc.nextLine();
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setString(2, roll);
			cs.execute();
			System.out.println("********Result************");
			System.out.println("RollNo : "+roll);
			System.out.println("Marks : "+cs.getInt(1));
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
