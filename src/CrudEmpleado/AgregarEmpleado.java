/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudEmpleado;

import MenuInicio.InicioAdmin;
import RegistroUser.Formulario;
import conexion.conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author christian
 */
public class AgregarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form AgregarEmpleado
     */
    public AgregarEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
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
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bnAceptar = new javax.swing.JButton();
        cbDepartamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtClavep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 99, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 99, 71));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 99, 71));
        jLabel1.setText("Agregar Empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 242, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 141, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 99, 71));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 99, 71));
        jLabel3.setText("Clave:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 149, -1));

        jLabel4.setBackground(new java.awt.Color(255, 99, 71));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 99, 71));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 149, -1));

        jLabel5.setBackground(new java.awt.Color(255, 99, 71));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 99, 71));
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 149, -1));

        jLabel6.setBackground(new java.awt.Color(255, 99, 71));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 99, 71));
        jLabel6.setText("Departamento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        bnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        bnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_OFF.png"))); // NOI18N
        bnAceptar.setBorderPainted(false);
        bnAceptar.setContentAreaFilled(false);
        bnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_ON.png"))); // NOI18N
        bnAceptar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_ON.png"))); // NOI18N
        bnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(bnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 140, 50));

        cbDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        cbDepartamento.setForeground(new java.awt.Color(255, 99, 71));
        cbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Directivo", "Docente", "Otro" }));
        jPanel1.add(cbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 150, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_32px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_arrow_left2_1814084-2.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, 40));

        jLabel10.setBackground(new java.awt.Color(255, 99, 71));
        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 99, 71));
        jLabel10.setText("Apellidos:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
        jPanel1.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 149, -1));

        jLabel11.setBackground(new java.awt.Color(255, 99, 71));
        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 99, 71));
        jLabel11.setText("RFC:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));
        jPanel1.add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 149, -1));

        jLabel12.setBackground(new java.awt.Color(255, 99, 71));
        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 99, 71));
        jLabel12.setText("Clave Presupuestal:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 20));
        jPanel1.add(txtClavep, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 149, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAceptarActionPerformed
        // TODO add your handling code here:
        
        
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido1.getText();
        String email = txtEmail.getText();
        String rfc = txtRfc.getText();
        String claveP = txtClavep.getText();
        
        String depart = (String) cbDepartamento.getSelectedItem();

        try {

            if (nombre.isEmpty() || apellido.isEmpty() || depart.isEmpty()|| email.isEmpty()|| rfc.isEmpty()|| claveP.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Es necesario rellenar todos los campos", "Atencion", JOptionPane.WARNING_MESSAGE);
            } else {
                PreparedStatement ps = cn.prepareStatement("INSERT INTO empleado(clave,nombre,apellido,email,RFC,claveP,departamento) VALUES (?,?,?,?,?,?,?)");
                ps.setString(1, txtId.getText());
                ps.setString(2, nombre);
                ps.setString(3, apellido);
                ps.setString(4, email);
                ps.setString(5, rfc);
                ps.setString(6, claveP);
                ps.setString(7, depart);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Empleado agregado ");
                limpiarCajas();

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bnAceptarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
          this.setState(AgregarEmpleado.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Exit", dialog);

        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here: mouse clicked agregar empleado back
        
        InicioAdmin in = new InicioAdmin();
        in.setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel9MouseClicked
    public void limpiarCajas() {
        txtEmail.setText("");
        txtApellido1.setText("");
        txtClavep.setText("");
        txtRfc.setText("");
        txtId.setText("");
        txtNombre.setText("");
    }
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
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAceptar;
    private javax.swing.JComboBox<String> cbDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtClavep;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables
  conection cc = new conection();
    Connection cn = (Connection) cc.getConnection();
}
