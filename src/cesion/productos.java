/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesion;

import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

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
        modelo.addColumn("$ Mayorista");
        modelo.addColumn("Solicita $");
        modelo.addColumn("Familia");
        modelo.addColumn("Un");
        modelo.addColumn("Boleta");
        
        
       

        limpiar();
        //llenar();

    }

    private void limpiarjtable() {
        modelo.setRowCount(0);
    }

    private void limpiar() {
        jTextField1.setText(null);
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        
        
        jLabel7.setText("Nuevo");
        this.jCheckBox1.setSelected(false);
    }

    private void cargarDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception ex) {

        }
    }

    public void llenar1() {

        String Buscar = jTextField6.getText();
        cargarDriver();
        Conexion cn = new Conexion();
        String dbURL = "jdbc:mysql://" + cn.ip + ":3306/" + cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select id,codigo,producto,venta2,mayorista,solicitaprecio,familia,un,boleta from productos where producto like '%" + Buscar + "%'";
        // JOptionPane.showMessageDialog(null, query);
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
            while (rs.next()) {

                Object[] object = new Object[9];
                object[0] = rs.getString(1);
                object[1] = rs.getString(2);
                object[2] = rs.getString(3);
                object[3] = rs.getString(4);
                object[4] = rs.getString(5);
                object[5] = rs.getString(6);
                object[6] = rs.getString(7);
                object[7] = rs.getString(8);
                 object[8] = rs.getString(9);
                System.out.println("Si");

                modelo.addRow(object);
            }

        } catch (SQLException ex) {
            System.out.println("Nop");
        }

    }

    public void llenar2() {

        String Buscar = jTextField5.getText();
        cargarDriver();
        Conexion cn = new Conexion();
        String dbURL = "jdbc:mysql://" + cn.ip + ":3306/" + cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select id,codigo,producto,venta2,barra,mayorista,solicitaprecio,familia,un,boleta from productos where  barra = '" + Buscar + "'  ";
        // JOptionPane.showMessageDialog(null, query);
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
            while (rs.next()) {

                Object[] object = new Object[9];
                object[0] = rs.getString(1);
                object[1] = rs.getString(2);
                object[2] = rs.getString(3);
                object[3] = rs.getString(4);
                object[4] = rs.getString(6);
                object[5] = rs.getString(7);
                object[6] = rs.getString(8);
                 object[7] = rs.getString(9);
                 object[8] = rs.getString(10);

                modelo.addRow(object);
            }

        } catch (SQLException ex) {
            System.out.println("Nop");
        }

    }

    
    public void llenar3() {

        String Buscar = this.jComboBox2.getSelectedItem().toString();
        cargarDriver();
        Conexion cn = new Conexion();
        String dbURL = "jdbc:mysql://" + cn.ip + ":3306/" + cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select id,codigo,producto,venta2,barra,mayorista,solicitaprecio,familia,un,boleta from productos where  familia= '" + Buscar + "'  ";
        // JOptionPane.showMessageDialog(null, query);
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
            while (rs.next()) {

                Object[] object = new Object[9];
                object[0] = rs.getString(1);
                object[1] = rs.getString(2);
                object[2] = rs.getString(3);
                object[3] = rs.getString(4);
                object[4] = rs.getString(6);
                object[5] = rs.getString(7);
                object[6] = rs.getString(8);
                object[7] = rs.getString(9);
                object[8] = rs.getString(10);

                modelo.addRow(object);
            }

        } catch (SQLException ex) {
            System.out.println("Nop");
        }

    }

    
    
    
    public void llenar() {
        cargarDriver();
        Conexion cn = new Conexion();
        String dbURL = "jdbc:mysql://" + cn.ip + ":3306/" + cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select id,codigo,producto,venta2,mayorista,solicitaprecio,familia,un,boleta from productos";
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
            while (rs.next()) {

                Object[] object = new Object[9];
                object[0] = rs.getString(1);
                object[1] = rs.getString(2);
                object[2] = rs.getString(3);
                object[3] = rs.getString(4);
                object[4] = rs.getString(5);
                object[5] = rs.getString(6);
                object[6] = rs.getString(7);
                object[7] = rs.getString(8);
                object[8] = rs.getString(9);
                System.out.println("Si");

                modelo.addRow(object);
            }

        } catch (SQLException ex) {
            System.out.println("Nop");
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
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();

        setTitle("Productos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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

        jLabel4.setText("$Venta");

        jTextField4.setText("jTextField4");

        jLabel5.setText("Codigo");

        jTextField5.setText("jTextField5");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField5MousePressed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jLabel6.setText("Producto");

        jTextField6.setText("jTextField6");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/buscar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/buscar.png"))); // NOI18N
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

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/excel.gif"))); // NOI18N
        jButton8.setText("Informe");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMaximumSize(new java.awt.Dimension(44, 54));
        jButton8.setMinimumSize(new java.awt.Dimension(44, 54));
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/diskblue.jpg"))); // NOI18N
        jButton10.setText("Grabar");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton10);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/Delete.jpg"))); // NOI18N
        jButton11.setText("Eliminar");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton11);

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

        jLabel8.setText("Mayorista");

        jTextField7.setText("jTextField7");

        jCheckBox1.setText("Solicita Precio");

        jLabel9.setText("Familia");

        jLabel10.setText("Familias");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/buscar.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Stock");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel11.setText("Unidad Principal");

        jCheckBox2.setText("Boleta");

        jLabel12.setText("Unidad Secundaria");

        jLabel13.setText("Conversion");

        jLabel14.setText("Stock Minimo");

        jLabel15.setText("Stock Maximo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(71, 71, 71)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton7)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel8))
                                            .addGap(41, 41, 41)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jCheckBox1)
                                                    .addGap(28, 28, 28)
                                                    .addComponent(jCheckBox2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton9))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(jLabel11)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel12)
                                                                .addComponent(jLabel13))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(6, 6, 6)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addGap(63, 63, 63)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(8, 8, 8)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)))))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        cargarcombofamilias();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // get the selected row index
        int selectedRowIndex = jTable1.getSelectedRow();

        // set the selected row data into jtextfields
        if (model.getValueAt(selectedRowIndex, 0)!= null){
             jTextField1.setText(model.getValueAt(selectedRowIndex, 0).toString());
        }
         if (model.getValueAt(selectedRowIndex, 1)!= null){
                jTextField2.setText(model.getValueAt(selectedRowIndex, 1).toString());
        }
        
         if (model.getValueAt(selectedRowIndex, 2)!= null){
             jTextField3.setText(model.getValueAt(selectedRowIndex, 2).toString());
         }
        
       if (model.getValueAt(selectedRowIndex, 3)!= null){
            jTextField4.setText(model.getValueAt(selectedRowIndex, 3).toString());
       }
    
         if (model.getValueAt(selectedRowIndex, 4)!= null){
             jTextField7.setText(model.getValueAt(selectedRowIndex, 4).toString());
         }
         String solicitaprecio="N";
           if (model.getValueAt(selectedRowIndex, 5)!= null){
              solicitaprecio = model.getValueAt(selectedRowIndex, 5).toString();
         }
       
        
      
        if (solicitaprecio.equals("S")) {
            System.out.println("solicitaprecio:" + solicitaprecio);
            jCheckBox1.setSelected(true);
        }
        String boleta="N";
        if (model.getValueAt(selectedRowIndex, 8)!= null){
             boleta = model.getValueAt(selectedRowIndex, 8).toString();
        }
 
        if (boleta.equals("S")) {
            jCheckBox2.setSelected(true);
        }
        
         if (model.getValueAt(selectedRowIndex, 6)!= null){
             this.jComboBox1.setSelectedItem(model.getValueAt(selectedRowIndex, 6).toString());
         }
        String unip="";
         if (model.getValueAt(selectedRowIndex, 7)!= null){
             unip=model.getValueAt(selectedRowIndex, 7).toString();
             this.jComboBox3.setSelectedItem(unip);
         }
        

        //buscar
        
         String Buscar = model.getValueAt(selectedRowIndex, 0).toString();
        cargarDriver();
        Conexion cn = new Conexion();
        String dbURL = "jdbc:mysql://" + cn.ip + ":3306/" + cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select id,unis,cons,stock_minimo,stock_maximo from productos where  id= " + Buscar ;
        // JOptionPane.showMessageDialog(null, query);
        String unis="",cons="",stock_minimo="",stock_maximo="";
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                unis = rs.getString(2);
                cons = rs.getString(3);
                stock_minimo = rs.getString(4);
                stock_maximo = rs.getString(5);
              // JOptionPane.showMessageDialog(null, Buscar);
            }
            
            this.jComboBox4.setSelectedItem(unis);
            this.jTextField8.setText(cons);
            this.jTextField9.setText(stock_minimo);
            this.jTextField10.setText(stock_maximo);
            
        } catch (SQLException ex) {
            System.out.println("Nop");
        }

        //fin buscar
        
        
        jLabel7.setText("Editar");
    }//GEN-LAST:event_jTable1MouseClicked

    
    
        private void cargarcombounidades(){
        this.jComboBox3.removeAllItems();
        cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select id,unidades from unidades order by unidades";
        // JOptionPane.showMessageDialog(null, query);
       String montoinicial="";
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                 String familias=rs.getString("unidades");
              this.jComboBox3.addItem(familias);
        }
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage().toString());
        }
    }
    
        
        private void cargarcombounidades2(){
        this.jComboBox4.removeAllItems();
        cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select id,unidades from unidades order by unidades";
        // JOptionPane.showMessageDialog(null, query);
       String montoinicial="";
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                 String familias=rs.getString("unidades");
              this.jComboBox4.addItem(familias);
        }
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage().toString());
        }
    }
    
    private void cargarcombofamilias(){
        this.jComboBox1.removeAllItems();
        cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select id,familias from familias order by familias";
        // JOptionPane.showMessageDialog(null, query);
       String montoinicial="";
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                 String familias=rs.getString("familias");
              this.jComboBox1.addItem(familias);
        }
          
        } catch (SQLException ex) {
            System.out.println("Nop");
        }
    }
    
       private void cargarcombofamilias2(){
        this.jComboBox2.removeAllItems();
        cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select id,familias from familias order by familias";
        // JOptionPane.showMessageDialog(null, query);
       String montoinicial="";
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                 String familias=rs.getString("familias");
              this.jComboBox2.addItem(familias);
        }
          
        } catch (SQLException ex) {
            System.out.println("Nop");
        }
    }
    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiarjtable();
        // TODO add your handling code here:
        llenar1();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);


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

    private void jTextField5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MousePressed
        // TODO add your handling code here:
   

    }//GEN-LAST:event_jTextField5MousePressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:

   if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // TODO add your handling code here:
        limpiarjtable();
        // TODO add your handling code here:
        llenar2();
    }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
         cargarcombofamilias();
         cargarcombofamilias2();
         cargarcombounidades();
         cargarcombounidades2();
         
    }//GEN-LAST:event_formWindowActivated

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        limpiarjtable();
        // TODO add your handling code here:
        llenar3();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
   
     
try
{
    
    File f = new File("informeproductos.xls"); // Creamos un objeto file
    System.out.println(f.getAbsolutePath());  
//Se crea el libro Excel
WritableWorkbook workbook =Workbook.createWorkbook(f);

//Se crea una nueva hoja dentro del libro
WritableSheet sheet =workbook.createSheet("Informe", 0);

//Creamos celdas de varios tipos
//sheet.addCell(new jxl.write.Number(0, 0, "Numero"));
sheet.addCell(new jxl.write.Label(0, 0, "Codigo"));
sheet.addCell(new jxl.write.Label(1, 0, "Producto"));
sheet.addCell(new jxl.write.Label(2, 0, "Un"));
sheet.addCell(new jxl.write.Label(3, 0, "$Venta"));
sheet.addCell(new jxl.write.Label(4, 0, "Familia"));
//sheet.addCell(new jxl.write.Boolean(3,0,true));
//buscar ventas
cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null; 
        Statement stmt = null; 
        ResultSet rs = null; 
        String query ="select barra,producto,un,venta2,familia from productos  order by familia ASC"; 
          try {
              //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password); 
           //getting PreparedStatment to execute query 
           stmt = dbCon.prepareStatement(query); 
          //Resultset returned by query 
           rs = stmt.executeQuery(query);  
           int j=1;

           while(rs.next()){ 
              sheet.addCell(new jxl.write.Label(0, j, rs.getString(1)));
              sheet.addCell(new jxl.write.Label(1, j, rs.getString(2)));
              sheet.addCell(new jxl.write.Label(2, j, rs.getString(3)));
              
              sheet.addCell(new jxl.write.Number(3, j, rs.getInt(4)));
              sheet.addCell(new jxl.write.Label(4, j, rs.getString(5)));
    
              j++;
              } 
        
        } catch(SQLException ex){
          System.out.println(ex.getMessage().toString() ); 
        }
//fin buscar ventas


//Escribimos los resultados al fichero Excel
workbook.write();
workbook.close();



System.out.println("Ejemplo finalizado.");
}
catch (IOException ex)
{
System.out.println("Error al crear el fichero.");
}
catch (WriteException ex)
{
System.out.println("Error al escribir el fichero.");
}

  try {
                Desktop.getDesktop().open(new File("informeproductos.xls"));
                //To check if the solution is open or not, you can wait some time here
                Thread.sleep(1000);

            } catch (IOException | InterruptedException ex) {
             //   Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
      

}  


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        Movimientos objeto11 = new Movimientos();
        objeto11.setVisible(true);
        objeto11.jLabel1.setText(this.jTextField2.getText());
        objeto11.llenar();

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
      if (this.jComboBox1.getSelectedIndex() ==-1){
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Familia");
            return;
        }    
            
    if (this.jComboBox3.getSelectedIndex() ==-1){
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Unidad Principal");
            return;
        }
  String Buscar = jTextField2.getText();
        cargarDriver();
        Conexion cn = new Conexion();
        String dbURL = "jdbc:mysql://" + cn.ip + ":3306/" + cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select codigo,barra,producto,nombrecorto,un,familia,venta2,boleta,solicitaprecio from productos where  barra = '" + Buscar + "'";
        // JOptionPane.showMessageDialog(null, query);
        String existe = "N";
        try {
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password);
            //getting PreparedStatment to execute query 
            stmt = dbCon.prepareStatement(query);
            //Resultset returned by query 
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                existe = "S";
            }

            if (existe.equals("S")) {
                try {
                    dbCon = DriverManager.getConnection(dbURL, username, password);
                    Statement comando = dbCon.createStatement();
                    String codigo = jTextField2.getText();
                    String barra = jTextField2.getText();
                    String producto = jTextField3.getText();
                    String nombrecorto = jTextField3.getText();
                    // String un= jTextField4.getText();
                    // String familia= jTextField5.getText();
                    String venta2 = jTextField4.getText();
                    String mayorista = jTextField7.getText();

                    String solicitaprecio = "N";
                    if (jCheckBox1.isSelected()) {
                        solicitaprecio = "S";
                    }
                    String boleta = "N";
                    if (jCheckBox2.isSelected()) {
                        boleta = "S";
                    }
                    String unidad= this.jComboBox3.getSelectedItem().toString();
                    String familia= this.jComboBox1.getSelectedItem().toString();
                    
                    String unis= this.jComboBox4.getSelectedItem().toString();
                    String cons = jTextField8.getText();
                    String stock_minimo = jTextField9.getText();
                    String stock_maximo = jTextField10.getText();
                     if(cons.isEmpty()){
                        cons="0";
                    }
                    if(stock_minimo.isEmpty()){
                        stock_minimo="0";
                    }
                     if(stock_maximo.isEmpty()){
                        stock_maximo="0";
                    }
                    
                    comando.executeUpdate("UPDATE productos set stock_maximo=" + stock_maximo + ",stock_minimo=" + stock_minimo + ",cons=" + cons + ",unis='" + unis + "',boleta='" + boleta + "',un='" + unidad + "',nombrecorto='" + producto + "',producto='" + producto + "',familia='" + familia + "',solicitaprecio='" + solicitaprecio + "',venta2=" + venta2 + ",mayorista=" + mayorista + " WHERE barra='" + barra + "'");
                    JOptionPane.showMessageDialog(null, "Producto Actualizado");
                    //this.jComboBox1.removeAllItems();
                    //this.jComboBox3.removeAllItems();
                    //this.jComboBox4.removeAllItems();
                } catch (SQLException ex) {
                    System.out.println("Actualizar Productos:"+ex.getMessage().toString());
                }
            }
            if (existe.equals("N")) {
                try {
                    dbCon = DriverManager.getConnection(dbURL, username, password);
                    Statement comando = dbCon.createStatement();
                    String codigo = jTextField2.getText();
                    String barra = jTextField2.getText();
                    String producto = jTextField3.getText();
                    String nombrecorto = jTextField3.getText();
                    // String un= jTextField4.getText();
                    // String familia= jTextField5.getText();
                    String venta2 = jTextField4.getText();
                    String mayorista = jTextField7.getText();
                    String familia= this.jComboBox1.getSelectedItem().toString();
                     
                    String unis= this.jComboBox4.getSelectedItem().toString();
                    String cons = jTextField8.getText();
                    String stock_minimo = jTextField9.getText();
                    String stock_maximo = jTextField10.getText();
                    
                     if(cons.isEmpty()){
                        cons="0";
                    }
                    if(stock_minimo.isEmpty()){
                        stock_minimo="0";
                    }
                     if(stock_maximo.isEmpty()){
                        stock_maximo="0";
                    }
                    
                     
                     
                    comando.executeUpdate("insert into productos(stock_maximo,stock_minimo,cons,unis,familia,codigo,barra,producto,nombrecorto,venta2,mayorista) values (" + stock_maximo + "," + stock_minimo + "," + cons + ",'" + unis + "','" + familia + "','" + codigo + "','" + barra + "','" + producto + "','" + nombrecorto + "'," + venta2 + "," + mayorista + ")");
                    JOptionPane.showMessageDialog(null, "Producto Nuevo Creado");
                    this.jComboBox1.removeAllItems();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }
            }
            limpiar();
        } catch (SQLException ex) {
            System.out.println("Nop");
        }

        limpiar();
        limpiarjtable();

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:

   if (JOptionPane.showConfirmDialog(null, "Desea Eliminar Productos?", "Eliminar Productos",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            // yes option
            String Buscar = jTextField2.getText();
            cargarDriver();
            Conexion cn = new Conexion();
            String dbURL = "jdbc:mysql://" + cn.ip + ":3306/" + cn.base;
            String username = cn.usuario;
            String password = cn.pass;
            Connection dbCon = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                dbCon = DriverManager.getConnection(dbURL, username, password);
                Statement comando = dbCon.createStatement();
                String id = jTextField1.getText();

                comando.executeUpdate("DELETE from productos  WHERE id=" + id);
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
            } catch (SQLException ex) {
                setTitle(ex.toString());
            }
            limpiar();
            limpiarjtable();
        } else {
            // no option
        }



    }//GEN-LAST:event_jButton11ActionPerformed

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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
