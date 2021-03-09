/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
import javax.swing.*;
/**
 *
 * @author dev
 */
public class productos extends javax.swing.JFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form productos
     */
    public productos() {
        initComponents();
        setLocationRelativeTo(null);
         modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
        modelo.addColumn("Id");
        modelo.addColumn("Codigo");
        modelo.addColumn("Productos");
        modelo.addColumn("$ Venta");
   
    
        limpiar();
        //llenar();
        
    }
    private void limpiarjtable(){
    modelo.setRowCount(0);
   }
    private void limpiar(){
        jTextField1.setText(null);
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
         jTextField6.setText("");
         jLabel7.setText("Nuevo");
    }
    private void cargarDriver() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex) {

    }
  }
    public void llenar1(){
       
       
        String Buscar= jTextField6.getText();
         cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null; 
        Statement stmt = null; 
        ResultSet rs = null; 
        String query ="select id,codigo,producto,venta2 from productos where producto like '%"+Buscar+"%'"; 
         // JOptionPane.showMessageDialog(null, query);
          try {
              //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password); 
           //getting PreparedStatment to execute query 
           stmt = dbCon.prepareStatement(query); 
          //Resultset returned by query 
           rs = stmt.executeQuery(query);  
           while(rs.next()){ 
              
              Object []object = new Object[4];
        object[0] = rs.getString(1);
        object[1] = rs.getString(2); 
        object[2] = rs.getString(3); 
        object[3] = rs.getString(4); 
  System.out.println("Si" );
        
        modelo.addRow(object);
          } 
         
        } catch(SQLException ex){
          System.out.println("Nop" ); 
        }

    }
    
    
        public void llenar2(){
       
       
        String Buscar= jTextField5.getText();
         cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null; 
        Statement stmt = null; 
        ResultSet rs = null; 
        String query ="select id,codigo,producto,venta2,barra from productos where codigo like '%"+Buscar+"%'  or barra like '%"+Buscar+"%'  "; 
         // JOptionPane.showMessageDialog(null, query);
          try {
              //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password); 
           //getting PreparedStatment to execute query 
           stmt = dbCon.prepareStatement(query); 
          //Resultset returned by query 
           rs = stmt.executeQuery(query);  
           while(rs.next()){ 
              
              Object []object = new Object[4];
        object[0] = rs.getString(1);
        object[1] = rs.getString(2); 
        object[2] = rs.getString(3); 
        object[3] = rs.getString(4); 
  System.out.println("Si" );
        
        modelo.addRow(object);
          } 
         
        } catch(SQLException ex){
          System.out.println("Nop" ); 
        }

    }

    
    public void llenar(){
         cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null; 
        Statement stmt = null; 
        ResultSet rs = null; 
        String query ="select id,codigo,producto,venta2 from productos"; 
          try {
              //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password); 
           //getting PreparedStatment to execute query 
           stmt = dbCon.prepareStatement(query); 
          //Resultset returned by query 
           rs = stmt.executeQuery(query);  
           while(rs.next()){ 
              
              Object []object = new Object[4];
        object[0] = rs.getString(1);
        object[1] = rs.getString(2); 
        object[2] = rs.getString(3); 
        object[3] = rs.getString(4); 
  System.out.println("Si" );
        
        modelo.addRow(object);
          } 
         
        } catch(SQLException ex){
          System.out.println("Nop" ); 
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("id");

        jTextField1.setText("jTextField1");
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo");

        jTextField2.setText("jTextField2");

        jLabel3.setText("Producto");

        jTextField3.setText("jTextField3");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/diskblue.jpg"))); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("$Venta");

        jTextField4.setText("jTextField4");

        jLabel5.setText("Codigo");

        jTextField5.setText("jTextField5");

        jLabel6.setText("Producto");

        jTextField6.setText("jTextField6");

        jButton2.setText("..");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("..");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/ADDREC.jpg"))); // NOI18N
        jButton4.setText("Nuevo");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/SAL.jpg"))); // NOI18N
        jButton5.setText("Salir");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("jLabel7");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/DEL.jpg"))); // NOI18N
        jButton6.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(77, 77, 77)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(404, 404, 404)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(67, 67, 67)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(90, 90, 90)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(65, 65, 65)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(64, 64, 64)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(55, 55, 55)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
 DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        // get the selected row index
       int selectedRowIndex = jTable1.getSelectedRow();
       
        // set the selected row data into jtextfields
       jTextField1.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jTextField2.setText(model.getValueAt(selectedRowIndex, 1).toString());
         jTextField3.setText(model.getValueAt(selectedRowIndex, 2).toString());
          jTextField4.setText(model.getValueAt(selectedRowIndex, 3).toString());
          jLabel7.setText("Editar");
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 limpiarjtable();
        // TODO add your handling code here:
  llenar1();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//limpiar();

String Buscar= jTextField2.getText();
        cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select codigo,barra,producto,nombrecorto,un,familia,venta2,boleta,solicitaprecio from productos where  barra = '" + Buscar + "'";
        // JOptionPane.showMessageDialog(null, query);
        String existe="N";
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
          
            while (rs.next()) {
             existe="S";
                  }
            
            if (existe.equals("S")){
                 try {
                         dbCon = DriverManager.getConnection(dbURL, username, password); 
                         Statement comando=dbCon.createStatement();
                         String codigo= jTextField2.getText();
                         String barra= jTextField2.getText();
                         String producto= jTextField3.getText();
                         String nombrecorto= jTextField3.getText();
                        // String un= jTextField4.getText();
                        // String familia= jTextField5.getText();
                         String venta2= jTextField4.getText();
                         comando.executeUpdate("UPDATE productos set venta2="+venta2+" WHERE barra='"+barra+"'");
                         JOptionPane.showMessageDialog(null, "Producto Actualizado");
                        } catch(SQLException ex){
                           setTitle(ex.toString());
                        }
            }
            if (existe.equals("N")){
                       try {
                         dbCon = DriverManager.getConnection(dbURL, username, password); 
                         Statement comando=dbCon.createStatement();
                         String codigo= jTextField2.getText();
                         String barra= jTextField2.getText();
                         String producto= jTextField3.getText();
                         String nombrecorto= jTextField3.getText();
                        // String un= jTextField4.getText();
                        // String familia= jTextField5.getText();
                         String venta2= jTextField4.getText();
                         comando.executeUpdate("insert into productos(codigo,barra,producto,nombrecorto,venta2) values ('"+codigo+"','"+barra+"','"+producto+"','"+nombrecorto+"',"+venta2+")");
                         JOptionPane.showMessageDialog(null, "Producto Nuevo Creado");
                        } catch(SQLException ex){
                           setTitle(ex.toString());
                        }
                   }
          limpiar();
        } catch (SQLException ex) {
            System.out.println("Nop");
        }
            



    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       if (JOptionPane.showConfirmDialog(null, "Desea Salir?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    // yes option
    //this.dispose();
    this.setVisible(false);
} else {
    // no option
}
        
        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
 limpiarjtable();
        // TODO add your handling code here:
  llenar2();


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
