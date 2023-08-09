package product51;
import java.util.*;
import java.sql.*;
public class RetrievePriceFromProduct51UsingFunction {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","wahidur");
			Scanner sc=new Scanner(System.in);
			
			CallableStatement cs=con.prepareCall("{Call ?:=retrievePrice51(?)}");
			System.out.println("Enter product code");
			
			String code=sc.nextLine();
			
			cs.registerOutParameter(1, Types.FLOAT);
			cs.setString(2, code);
			cs.execute();
			System.out.println("****product price***");
			System.out.println("product code : "+code);
			System.out.println("product price : "+cs.getFloat(1));
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
