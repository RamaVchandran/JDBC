import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testinsert extends Base {

	public static void main(String[] args) {
		Map<String, Employees> data = getData();
		Employees e = data.get("9003209516");
		WebDriver driver = getdriver();
		loadurl("http://demo.automationtesting.in/Register.html");
		WebElement firstName= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		type(firstName,e.getFirstname());
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		type(lastName,e.getLastname());
		

	}

}
