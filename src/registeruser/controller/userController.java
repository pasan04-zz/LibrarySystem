package registeruser.controller;
 
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.user.Model.user;
import registeruser.dbconnection.DBConnection;

 
public class userController {
 
 public String registerUser(user registerBean)
 {
         String id = registerBean.getId();
	 String name = registerBean.getName();
	 String email = registerBean.getEmail();
	 String address = registerBean.getaddress();
	 String contactNo= registerBean.getContactNo();
 
	 Connection con = null;
	 PreparedStatement preparedStatement = null;
 
 try
 {
	 con = DBConnection.createConnection();
	 String query = "insert into register(id,name,contactNo,address,email) values (?,?,?,?,?)"; 
	 preparedStatement = con.prepareStatement(query); 
	 preparedStatement.setString(1, id);
	 preparedStatement.setString(2, name);
         preparedStatement.setString(3, contactNo);
	 preparedStatement.setString(4, address);
 	 preparedStatement.setString(5, email);
 
	 int i= preparedStatement.executeUpdate();
 
 	if (i!=0)  
 		return "SUCCESS"; 
 	}
 	catch(SQLException e)
 	{
 		e.printStackTrace();
 	}
 
 	return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
 	}
}