/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeruser.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pasan
 */
public class DBConnection {
 
 public static Connection createConnection()
 {
	 Connection con = null;
	 String url = "jdbc:mysql://localhost:3306/login"; 
	 String username = "root"; 
	 String password = "pasan123@"; 
 
 try 
 {
 try 
 {
	 Class.forName("com.mysql.jdbc.Driver"); 
 } 
 catch (ClassNotFoundException e)
 {
	 e.printStackTrace();
 }
 
 	con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
 	System.out.println("Printing connection object "+con);
 } 
 catch (Exception e) 
 {
	 e.printStackTrace();
 }
 
 	return con; 
 }
}