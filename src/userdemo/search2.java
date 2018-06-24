/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdemo;

import com.user.Model.books;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import registeruser.dbconnection.DBConnection;

/**
 *
 * @author Pasan
 */
public class search2 extends javax.swing.JFrame {

    /**
     * Creates new form search2
     */
    public search2() {
        initComponents();
        findrelbooks();
        findothbooks();
        findsinbooks();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    //Religon books
        public ArrayList<books> listrelbooks(String valToSearch){
        
        
        ArrayList<books> booklist = new ArrayList<books>();
        Statement st;
        ResultSet rs;
        
        try{ 
          Connection connection = DBConnection.createConnection();
           st =connection.createStatement();
           //String searchquery = "SELECT * from edubooks where CONCAT('edid','edname','edauthor','edprice') LIKE '%"+valToSearch+"%'";
           String searchquery = "SELECT * from religonbooks where CONCAT(rid,rname,rauthor,rprice) LIKE '%"+valToSearch+"%'";
           rs = st.executeQuery(searchquery);
           books b1;
           
           while(rs.next()){
               b1 = new books(
                       rs.getInt("rid"),
                       rs.getString("rname"),
                       rs.getString("rauthor"),
                       rs.getDouble("rprice")
            
               );
               booklist.add(b1);           
           }
        }catch(Exception ex){       
            System.out.println(ex.getMessage());
        }
        return booklist;   
    }
    public void findrelbooks(){
        
        ArrayList<books> book = listrelbooks(relbook.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"BOOKID","NAME","AUTHOR","PRICE"});
        Object[] row = new Object[4];
        
        for(int i =0;i<book.size();i++){
            
            row[0] = book.get(i).getId();
            row[1] = book.get(i).getName();
            row[2] = book.get(i).getAuthor();
            row[3] = book.get(i).getprice();
            
            model.addRow(row);
            
        }
        jTable_relbooks.setModel(model);  
      
    }
    //other books
        public ArrayList<books> listothbooks(String valToSearch){
        
        
        ArrayList<books> booklist = new ArrayList<books>();
        Statement st;
        ResultSet rs;
        
        try{ 
          Connection connection = DBConnection.createConnection();
           st =connection.createStatement();
           //String searchquery = "SELECT * from edubooks where CONCAT('edid','edname','edauthor','edprice') LIKE '%"+valToSearch+"%'";
           String searchquery = "SELECT * from otherbooks where CONCAT(oid,oname,oauthor,oprice) LIKE '%"+valToSearch+"%'";
           rs = st.executeQuery(searchquery);
           books b1;
           
           while(rs.next()){
               b1 = new books(
                       rs.getInt("oid"),
                       rs.getString("oname"),
                       rs.getString("oauthor"),
                       rs.getDouble("oprice")
            
               );
               booklist.add(b1);           
           }
        }catch(Exception ex){       
            System.out.println(ex.getMessage());
        }
        return booklist;   
    }
        

    //    
    public void findothbooks(){
        
        ArrayList<books> book = listothbooks(othbooks.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"BOOKID","NAME","AUTHOR","PRICE"});
        Object[] row = new Object[4];
        
        for(int i =0;i<book.size();i++){
            
            row[0] = book.get(i).getId();
            row[1] = book.get(i).getName();
            row[2] = book.get(i).getAuthor();
            row[3] = book.get(i).getprice();
            
            model.addRow(row);
            
        }
        jTable_othbooks.setModel(model);  
      
    }
    //sinhala books
    public ArrayList<books> listsinbooks(String valToSearch){
        
        
        ArrayList<books> booklist = new ArrayList<books>();
        Statement st;
        ResultSet rs;
        
        try{ 
          Connection connection = DBConnection.createConnection();
           st =connection.createStatement();
           //String searchquery = "SELECT * from edubooks where CONCAT('edid','edname','edauthor','edprice') LIKE '%"+valToSearch+"%'";
           String searchquery = "SELECT * from sinbooks where CONCAT(sid,sname,sauthor,sprice) LIKE '%"+valToSearch+"%'";
           rs = st.executeQuery(searchquery);
           books b1;
           
           while(rs.next()){
               b1 = new books(
                       rs.getInt("sid"),
                       rs.getString("sname"),
                       rs.getString("sauthor"),
                       rs.getDouble("sprice")
            
               );
               booklist.add(b1);           
           }
        }catch(Exception ex){       
            System.out.println(ex.getMessage());
        }
        return booklist;   
    }
        

    //    
    public void findsinbooks(){
        
        ArrayList<books> book = listsinbooks(sinbooks.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"BOOKID","NAME","AUTHOR","PRICE"});
        Object[] row = new Object[4];
        
        for(int i =0;i<book.size();i++){
            
            row[0] = book.get(i).getId();
            row[1] = book.get(i).getName();
            row[2] = book.get(i).getAuthor();
            row[3] = book.get(i).getprice();
            
            model.addRow(row);
            
        }
        jTable_sinbooks.setModel(model);  
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        relbook = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_relbooks = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        sinbooks = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_othbooks = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        othbooks = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_sinbooks = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEARCH BOOKS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOME LIBRARY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(854, 854, 854))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(702, 702, 702))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(49, 49, 49))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("RELIGON BOOKS");

        jTable_relbooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKID", "NAME", "AUTHOR", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_relbooks);
        if (jTable_relbooks.getColumnModel().getColumnCount() > 0) {
            jTable_relbooks.getColumnModel().getColumn(0).setResizable(false);
            jTable_relbooks.getColumnModel().getColumn(1).setResizable(false);
            jTable_relbooks.getColumnModel().getColumn(2).setResizable(false);
            jTable_relbooks.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("OTHER BOOKS");

        jTable_othbooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKID", "NAME", "AUHTOR", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_othbooks);
        if (jTable_othbooks.getColumnModel().getColumnCount() > 0) {
            jTable_othbooks.getColumnModel().getColumn(0).setResizable(false);
            jTable_othbooks.getColumnModel().getColumn(1).setResizable(false);
            jTable_othbooks.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("SINHALA NOVELS");

        jTable_sinbooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKID", "NAME", "AUTHOR", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_sinbooks);
        if (jTable_sinbooks.getColumnModel().getColumnCount() > 0) {
            jTable_sinbooks.getColumnModel().getColumn(0).setResizable(false);
            jTable_sinbooks.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(relbook, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(othbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(sinbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(494, 494, 494)
                .addComponent(jLabel7)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(relbook, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(othbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        findrelbooks(); 
        relbook.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        findothbooks();
        othbooks.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        findsinbooks();
        sinbooks.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_othbooks;
    private javax.swing.JTable jTable_relbooks;
    private javax.swing.JTable jTable_sinbooks;
    private javax.swing.JTextField othbooks;
    private javax.swing.JTextField relbook;
    private javax.swing.JTextField sinbooks;
    // End of variables declaration//GEN-END:variables
}
