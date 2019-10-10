import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	static Connection con=null;
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			
		con =	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
		//write query
		String sql = "Select* from Register";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			String FirstName = rs.getString("FirstName");
			String LastName = rs.getString("LastName");
			String Address = rs.getString("Adress");
			String EmailAddress = rs.getString("EmailAddress");
			String phone = rs.getString("Phone");
			String gender = rs.getString("Gender");
			String hobbies = rs.getString("Hobbies");
			
			System.out.println(FirstName);
			System.out.println(LastName);
			System.out.println(Address);
			System.out.println(EmailAddress);
			System.out.println(phone);
			System.out.println(gender);
			System.out.println(hobbies);
			
		}
			
		
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
			
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
