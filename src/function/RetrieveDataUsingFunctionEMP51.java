package function;
import java.util.*;
import java.sql.*;
public class RetrieveDataUsingFunctionEMP51 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","wahidur");
			Scanner sc=new Scanner(System.in);
			CallableStatement cs=con.prepareCall("{call ?:=RetrieveTotSal51(?)}");//(1 recieve data from returning)
			System.out.println("Enter the empId");
			String id=sc.nextLine();
			cs.registerOutParameter(1, Types.FLOAT);
			cs.setString(2, id);
			cs.execute();
			System.out.println("Funtion successfully executed..");
			
			System.out.println("empId : "+id);
			System.out.println("emp TotSal : "+cs.getFloat(1));//data is available call ?:---
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
