package registeruser.controller;
 
import com.user.Model.books;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import registeruser.dbconnection.DBConnection;

 
public class RELbookController {
 
 public String registerUser(books bookBean)
 {
         int id = bookBean.getId();
	 String name = bookBean.getName();
	 String author = bookBean.getAuthor();
	 double price = bookBean.getprice();
 
	 Connection con = null;
	 PreparedStatement preparedStatement = null;
 
 try
 {
	 con = DBConnection.createConnection();
	 String query = "insert into religonBooks(rid,rname,rauthor,rprice) values (?,?,?,?)"; 
	 preparedStatement = con.prepareStatement(query); 
	 preparedStatement.setInt(1, id);
	 preparedStatement.setString(2, name);
         preparedStatement.setString(3, author);
	 preparedStatement.setDouble(4, price);
 
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