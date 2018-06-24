/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeruser.controller;

import com.user.Model.borrowbooks;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import registeruser.dbconnection.DBConnection;

/**
 *
 * @author Pasan
 */

 
public class BorrowBooksController{ 
 
 public String registerUser(borrowbooks bookBean)
 {
         int id = bookBean.getId();
	 String name = bookBean.getName();
	 String person = bookBean.getPerson();
 
	 Connection con = null;
	 PreparedStatement preparedStatement = null;
 
 try
 {
	 con = DBConnection.createConnection();
	 String query = "insert into borrowbooks(id,name,person) values (?,?,?)"; 
	 preparedStatement = con.prepareStatement(query); 
	 preparedStatement.setInt(1, id);
	 preparedStatement.setString(2, name);
         preparedStatement.setString(3, person);
 
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
