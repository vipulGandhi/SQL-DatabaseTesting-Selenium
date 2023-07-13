//In real time
	// Create a new user from the application UI with Selenium
	// Retrieve the values of the newly created user from the database
	// Assert whether the UI data is matching with tha database data

// 

package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDB
{
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{
		
		String databaseUrl = "jdbc:dbtype://ip_address:port_number/database_name";
		
		String username = "Admin";
		String password = "Admin";
		
		//Query to Execute		
		String query = "select *  from employee;";
			
		//Load mysql jdbc driver		
   	    Class.forName("com.mysql.jdbc.Driver");	
			
		//Connect to the database_name
   	    // Connection is an interface
   	    // getConnection() returns an object of type Connection
		Connection connection = DriverManager.getConnection(databaseUrl, username, password);
		
		// load the JDBC Driver 
		Class.forName("com.mysql.jdbc.Driver");
			
		//Verify the connection and execute SQL Statements
		if(!connection.isClosed())
		{	
			System.out.println("Successfully connected to the Database");
				
			//Create Statement Object
			// Statement interface cannot accept parameters and useful when we are using static SQL statements at runtime
			// If we want to run SQL query only once then this interface is preferred over PreparedStatement
			Statement statement = connection.createStatement();
			
			// Execute the SQL Query. Store results in resultSet
			ResultSet resultSet = statement.executeQuery(query);
				
			while(resultSet.next())
			{		
				System.out.println(resultSet.getString("Name")+"--"+resultSet.getString("Location")+"--"+resultSet.getInt("Experience"));
			}
				
			System.out.println("-------------------------------------------");
			
			// It is used when we want to use SQL statements many times
			// The PreparedStatement interface accepts input parameters at runtime
			PreparedStatement prepareStatement = connection.prepareStatement("select * from Employee where Name=? and Experience=?");
			prepareStatement.setString(1,"Gopal");
			prepareStatement.setInt(2,8);
			ResultSet pResultSet = prepareStatement.executeQuery();
				
			while(pResultSet.next())
			{	
				System.out.println(pResultSet.getString("Name")+"--"+pResultSet.getString("Location")+"--"+pResultSet.getInt("Experience"));	
			}	
		}
		
		if(!connection.isClosed())
		{	
			//Close the connection
			connection.close();	
		}				
	}
}
