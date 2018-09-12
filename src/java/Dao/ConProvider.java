package Dao;
import java.sql.*;
public class ConProvider {

	public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/companyMailer","root","patel123@");
	}catch(Exception e){System.out.println(e);}
	return con;
    }
}
