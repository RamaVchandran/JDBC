import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	public static Map <String,Employees> getData() {
		// TODO Auto-generated method stub

	
	 Connection con =null;
	Map<String,Employees> emp = new LinkedHashMap<>();
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				
				
			con =	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			//write query
			String sql = "Select* from Register";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				//creating the object
				Employees e = new  Employees();
				//iterate
				String FirstName = rs.getString("FirstName");
				String LastName = rs.getString("LastName");
				String Address = rs.getString("Adress");
				String EmailAddress = rs.getString("EmailAddress");
				String gender = rs.getString("Gender");
				String hobbies = rs.getString("Hobbies");
				String phone = rs.getString("phone");
			//setting value	
				e.setEmailid(EmailAddress);
				e.setAddress(Address);
				e.setFirstname(FirstName);
				e.setGender(gender);
				e.setHobbies(hobbies);
				e.setLastname(LastName);
			//add in map	
				emp.put(phone,e);
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
			return emp;

		}
	
	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver","E:\\Project workspace\\JDBC\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		

	}
	
	public static void loadurl(String url) {
		driver.get(url);

	}
	
	public static void type(WebElement element,String name) {
		element.sendKeys(name);

	}
	

}
