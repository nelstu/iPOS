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

/**
 *
 * @author dev
 */
public class cerrarcaja extends javax.swing.JFrame {

    /**
     * Creates new form cerrarcaja
     */
    public cerrarcaja() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    private void cargarDriver() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex) {

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Fecha");

        jLabel2.setText("jLabel2");

        jLabel3.setText("Boletas Emitidas");

        jLabel4.setText("jLabel4");

        jLabel5.setText("Monto Inicial");

        jLabel6.setText("jLabel6");

        jLabel7.setText("Efectivo");

        jLabel8.setText("jLabel8");

        jLabel9.setText("Cheque");

        jLabel10.setText("jLabel10");

        jLabel11.setText("Transbank");

        jLabel12.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel13.setText("Total Venta");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel15.setText("Total Caja");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel16.setText("jLabel16");

        jLabel17.setText("Real Efectivo");

        jLabel18.setText("Real Cheque");

        jLabel19.setText("Real Transbank");

        jLabel20.setText("Diferencia");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Cerrar Caja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12))
                            .addGap(115, 115, 115)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(97, 97, 97)
                                    .addComponent(jLabel21))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(42, 42, 42)
                                    .addComponent(jTextField3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(61, 61, 61)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(58, 58, 58)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel17)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel19)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void  actualizar(String buscar){
        String Desde="2021-03-01";
        String Hasta="2021-03-31";
        
        
         cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        Statement stmt0 = null;
        ResultSet rs0 = null;
        String query = "select fecha FROM cajas WHERE fecha = '" + buscar + "' ";
     
       String montoinicial="";
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                 String fechaca=rs.getString("fecha");
                // System.out.println("Fecha->"+fechaca);
                 //buscar en boletas
                     try {
                         //getting database connection to MySQL server 
                         dbCon = DriverManager.getConnection(dbURL, username, password);
                         //getting PreparedStatment to execute query 
                          String query0 = "select  numero_bol,fecha,total,forma FROM boletas WHERE fecha='"+fechaca+"' order by numero_bol ASC";
     
                         stmt0 = dbCon.prepareStatement(query0);
                         //Resultset returned by query 
                         rs0 = stmt0.executeQuery(query0);
                         int stot=0;
                         int son=0;
                         int inibol=0;
                         int finbol=0;
                         int van=0;
                         int actual=0;
                         while (rs0.next()) {
                             if (van==0){
                                 inibol=rs0.getInt("numero_bol");
                                // System.out.println("Aqui"+inibol);
                             }
                             actual=rs0.getInt("numero_bol");
                             stot=stot+rs0.getInt("total");
                             son++;
                             van++;
                            }
                           
                            //actualizar datos caja
                            try {
                                dbCon = DriverManager.getConnection(dbURL, username, password); 
                                Statement comando=dbCon.createStatement();
                            
                                comando.executeUpdate("UPDATE cajas set desde="+inibol+",hasta="+actual+",ventadia='"+stot+"',cantboletas="+son+" WHERE fecha='"+fechaca+"'");
                        
                                } catch(SQLException ex){
                                          System.out.println(ex.getMessage().toString());
                                    }
                            
                            //fin actualizar datos caja
                            
                         } catch (SQLException ex0) {
                            System.out.println(ex0.getMessage().toString());
                          }
                 
                 //fin buscar en boletas
     
                

            }
          
        } catch (SQLException ex2) {
            System.out.println(ex2.getMessage().toString());
        }
            
      


        
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       java.util.Date utilDate = new java.util.Date(); //fecha actual
        long lnMilisegundos = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
       
        String Buscar= sqlDate.toString();
        int reply = JOptionPane.showConfirmDialog(null, "Desea Cerrar la Caja", "Cierre de Caja", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
                 actualizar(Buscar);
                 cargarDriver();
                 Conexion cn=new Conexion();
                 String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
                 String username = cn.usuario;
                 String password = cn.pass;
                 Connection dbCon = null;
                 Statement stmt = null;
                 ResultSet rs = null;
                 
                 //buscar datos para actualizar Caja
                 
                 
                 //fin buscar datos para actualizar Caja
                try {
                         dbCon = DriverManager.getConnection(dbURL, username, password); 
                         Statement comando=dbCon.createStatement();
                       
                       
        
                         String sql="UPDATE cajas set estado='Cerrada' WHERE fecha='"+Buscar+"'";
                         comando.executeUpdate(sql);
                         JOptionPane.showMessageDialog(null, "Caja Abierta");
                           this.setVisible(false);
                        } catch(SQLException ex){
                           setTitle(ex.toString());
                        }
            } else {
           
           
          }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(cerrarcaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cerrarcaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cerrarcaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cerrarcaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cerrarcaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
