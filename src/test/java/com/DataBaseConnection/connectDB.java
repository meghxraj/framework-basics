package com.DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class connectDB {

	public static void main(String[] args) throws Exception {
		
		//connection url format - jdbc:mysql://<hostname>:<port>/<database name>
		
		String url ="jdbc:mysql://localhost:3306/framework_database";
		String username=null,pwd=null;
		//connecting to database and storing the connection object
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		//creating a statement and assigning the object to statemenet 
		Statement s = con.createStatement();
		//executing the query and assigning it to a result set
		ResultSet rs = s.executeQuery("select * from logininfo where id =4");
		//moving the index for the actual query result
		while(rs.next()) {
			 username = rs.getString("username");
			 pwd = rs.getString("password");
		}
		
		
		System.out.println(username +":"+pwd);
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("http://"+username+":"+pwd+"@httpbin.org/basic-auth/user/passwd");
		Thread.sleep(1000);
	}
}
