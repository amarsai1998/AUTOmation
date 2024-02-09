package learning1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatabaseTesting {

    // Declare the variables
    Connection con;
    Statement stmt;
    ResultSet rs;
    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        // Load the JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // Connect to the database
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "password");

        // Create a statement object
        stmt = con.createStatement();

        // Execute a SQL query
        rs = stmt.executeQuery("select * from employee");

        // Launch the browser
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();

        // Navigate to the web page
        driver.get("http://localhost:8080/employee");
    }

    @Test
    public void testDatabase() throws Exception {
        // Loop through the result set
        while (rs.next()) {
            // Get the data from the database
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");

            // Locate the web elements that display the data
            String webId = driver.findElement(By.xpath("//table/tbody/tr[" + id + "]/td[1]")).getText();
            String webName = driver.findElement(By.xpath("//table/tbody/tr[" + id + "]/td[2]")).getText();
            String webEmail = driver.findElement(By.xpath("//table/tbody/tr[" + id + "]/td[3]")).getText();

            // Compare the data from the database and the web elements
            Assert.assertEquals(webId, String.valueOf(id), "ID mismatch");
            Assert.assertEquals(webName, name, "Name mismatch");
            Assert.assertEquals(webEmail, email, "Email mismatch");
        }
    }

    @AfterTest
    public void tearDown() throws Exception {
        // Close the connection to the database
        rs.close();
        stmt.close();
        con.close();

        // Close the browser
        driver.quit();
        
        
    }
}

	


