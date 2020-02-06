/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudEmpleado;

import MenuInicio.InicioAdmin;
import com.mysql.jdbc.Connection;
import conexion.conection;
import static conexion.conection.conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author christian
 */
public class EliminarEmpleado extends javax.swing.JFrame {

  
    /**
     * Creates new form EliminarEmpleado
     */
    public EliminarEmpleado() {
        initComponents();
        mostrarDatos();
        
        
       this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eliminar = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Eliminar.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaEmpleado.setComponentPopupMenu(Eliminar);
        tablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 630, 270));

        jLabel1.setBackground(new java.awt.Color(255, 99, 71));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 99, 71));
        jLabel1.setText("Eliminar Empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 242, -1));

        txtBuscar.setForeground(new java.awt.Color(255, 99, 71));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 210, -1));

        jLabel3.setBackground(new java.awt.Color(255, 99, 71));
        jLabel3.setForeground(new java.awt.Color(255, 99, 71));
        jLabel3.setText("Buscar Clave:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_arrow_left2_1814084-2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_32px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        jButton1.setText("Eliminar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 99, 71));
        jLabel6.setForeground(new java.awt.Color(255, 99, 71));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 99, 71));
        jLabel7.setForeground(new java.awt.Color(255, 99, 71));
        jLabel7.setText("Apellido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 99, 71));
        jLabel8.setForeground(new java.awt.Color(255, 99, 71));
        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 99, 71));
        jLabel9.setForeground(new java.awt.Color(255, 99, 71));
        jLabel9.setText("Clave");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        txtClave.setEditable(false);
        txtClave.setForeground(new java.awt.Color(51, 51, 255));
        txtClave.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, -1));

        txtNombre.setEditable(false);
        txtNombre.setForeground(new java.awt.Color(51, 51, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        txtApellido.setEditable(false);
        txtApellido.setForeground(new java.awt.Color(51, 51, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 180, -1));

        txtEmail.setEditable(false);
        txtEmail.setForeground(new java.awt.Color(51, 51, 255));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 180, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_32px_2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea salir?", "Exit",dialog);

        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
            this.setState(EliminarEmpleado.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked
void mostrardatosBusqueda (String valor){
    String []datos = new String [9];
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Clave");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Email");
    modelo.addColumn("RFC");
    modelo.addColumn("Clave Presupuestal");
    modelo.addColumn("Departamento");
  
    tablaEmpleado.setModel(modelo);
    String sql;
   
 
        sql= "Select clave,nombre,apellido,email,RFC,claveP,departamento from empleado where nombre LIKE '%"+valor+"%'";
      

    try {
        PreparedStatement ps = cn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
        datos[0]=rs.getString(1);
        datos[1]=rs.getString(2);
        datos[2]=rs.getString(3);
        datos[3]=rs.getString(4);
        datos[4]=rs.getString(5);
        datos[5]=rs.getString(6);
        datos[6]=rs.getString(7);
        
       
        modelo.addRow(datos);
        }
   }
    catch (SQLException e) {
        System.out.println(e);
    }
}
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         InicioAdmin in = new InicioAdmin();
      in.setVisible(true);
      dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        String buscar = txtBuscar.getText();
        mostrardatosBusqueda(buscar);
    }//GEN-LAST:event_txtBuscarKeyReleased
public void mostrarDatos(){
      String []datos = new String [11];
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Clave");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Email");
    modelo.addColumn("RFC");
    modelo.addColumn("Clave Presupuestal");
    modelo.addColumn("Departamento");
 
    
tablaEmpleado.setModel(modelo);
   try {
        PreparedStatement ps = cn.prepareStatement("select * from empleado");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
        datos[0]=rs.getString(1);
        datos[1]=rs.getString(2);
        datos[2]=rs.getString(3);
        datos[3]=rs.getString(4);
        datos[4]=rs.getString(5);
        datos[5]=rs.getString(6);
        datos[6]=rs.getString(7);
        
       
        modelo.addRow(datos);
        }
   }
    catch (Exception e) {
    }
}
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed
public void LimpiarCajas(){
    txtApellido.setText(null);
    txtClave.setText(null);
    txtEmail.setText(null);
    txtNombre.setText(null);
    
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //boton borrar
            // String query = "DELETE FROM empleado WHERE nombre = "+txtNombre.getText();
            String id=txtClave.getText();
            String query ="DELETE FROM empleado WHERE clave='"+id+"'";
            Statement sent=cn.createStatement();
            int s=sent.executeUpdate(query);
            
            if (s>0){
            JOptionPane.showMessageDialog(null, "Datos eliminados");
            mostrarDatos();
            LimpiarCajas();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EliminarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }//GEN-LAST:event_jButton1ActionPerformed
        
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // menu popu
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadoMouseClicked
      int i = tablaEmpleado.getSelectedRow();
      TableModel model = tablaEmpleado.getModel();
      
      txtClave.setText(model.getValueAt(i,0).toString());
      
      txtNombre.setText(model.getValueAt(i,1).toString());

        txtApellido.setText(model.getValueAt(i,2).toString());

        txtEmail.setText(model.getValueAt(i,3).toString());

        
        
        
    }//GEN-LAST:event_tablaEmpleadoMouseClicked

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
            java.util.logging.Logger.getLogger(EliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
 conection cc = new conection();
    Connection cn = (Connection) cc.getConnection();
}
