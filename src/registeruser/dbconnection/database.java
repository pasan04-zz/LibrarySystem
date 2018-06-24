package registeruser.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;

public class database{

    String conString = "jdbc:mysql://localhost:3306/login";
    String username = "root";
    String password = "pasan123@";

    //INSERT INTO DB
    /*public Boolean add(String name) {
        //SQL STMT
        String sql = "INSERT INTO ennovels(Name) VALUES('" + name + "')";

        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }*/

    //RETRIEVE DATA
    public DefaultListModel retrieve() {
        DefaultListModel dm = new DefaultListModel();

        //SQL STMT
        String sql = "SELECT ename FROM enovels";

        try {
            Connection con = DriverManager.getConnection(conString, username, password);

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String name = rs.getString(1);

                //ADD TO DM
                dm.addElement(name);
            }

            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    /*//UPDATE DATA
    public Boolean update(String id, String value) {
        String sql = "UPDATE playerstb SET Name ='" + value + "' WHERE Name='" + id + "'";

        try {
            Connection con=DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }*/

   //DELETE DATA
    public Boolean delete(String id)
    {
        //SQL STMT
        String sql="DELETE FROM enovels WHERE ename ='"+id+"'";

        try
        {
            //CONNECTION
             Connection con=DriverManager.getConnection(conString, username, password);

             //sTAETEMT
             Statement s=con.prepareStatement(sql);

             //EXECUTE
             s.execute(sql);

             return true;

        }catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean add(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(String id, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}