import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
			
		Properties prop = new Properties();
		FileInputStream fin = new FileInputStream("database.properties");
		
		prop.load(fin);
		
		//String driver=prop.getProperty("jdbc.driver");;
		//Class.forName(driver);
			
		String url=prop.getProperty("jdbc.url");
		Connection dbconnection;
		dbconnection=DriverManager.getConnection(url);
		System.out.println("Connection sucessfull"+(dbconnection!=null));
			
		Statement insertstatement=null;
		try {
			insertstatement = dbconnection.createStatement();
			String sqlQuery = prop.getProperty("jdbc.query.insert");
			insertstatement.executeUpdate(sqlQuery);
		} finally {
			if(insertstatement!=null){
				insertstatement.close();
			}                                  
		}
		
		
		String insertQuery1=prop.getProperty("jdbc.query.insert1");
		try(PreparedStatement preparedStatement = dbconnection.prepareStatement(insertQuery1)){
			String msg = "this is java";
			preparedStatement.setString(1, msg);
			preparedStatement.executeUpdate();
		}
		
		
		try(Statement selectStatement = dbconnection.createStatement()){
			String selectQuery =prop.getProperty("jdbc.sql.select");
			ResultSet result;
			result= selectStatement.executeQuery(selectQuery);
			
			while(result.next()){
				String message = result.getString(1);
				System.out.println(message);
			}
		}
		
		
	}

}
