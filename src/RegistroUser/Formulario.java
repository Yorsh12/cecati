/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroUser;

import LogIn.LogIn;
import conexion.conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author christian
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        this.setLocationRelativeTo(null);
        
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
        txtUsuario = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 99, 71));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 99, 71));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro Cecati 23");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 250, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_32px.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Usuario..");
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 220, 40));

        txtId.setForeground(new java.awt.Color(204, 204, 204));
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setText("Ingresa tu clave..");
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 220, 40));

        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setText("Contraseña..");
        txtPass.setToolTipText("contraseña");
        txtPass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtPassMouseMoved(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 220, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_OFF.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_ON.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_ON.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_ON.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_arrow_left2_1814084-2.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPassMouseMoved

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Desea salir del Registro?", "Exit",dialog);

        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setState(Formulario.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        LogIn in = new LogIn();
        
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked
public void limpiarCajas(){
    txtId.setText("");
    txtUsuario.setText("");
    txtPass.setText("");
   // txtEmail.setText("");
    
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           int id = Integer.parseInt(txtId.getText());
        String user = txtUsuario.getText();
        char[] pass = txtPass.getPassword();
      //  String email = txtEmail.getText();
        
        
        try {
            
            if(user.isEmpty()){
                
             JOptionPane.showMessageDialog(null, "Es necesario rellenar todos los campos","Atencion", JOptionPane.WARNING_MESSAGE);
            }
                
            else{
                   PreparedStatement ps = cn.prepareStatement("INSERT INTO usuario(claveEmp,usuario,contraseña) VALUES (?,?,?)");
                ps.setString(1,txtId.getText());
                ps.setString(2,user);
                ps.setString(3,txtPass.getText());
               
                
               
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Usuario agregado ");
                limpiarCajas();
               
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
 conection cc = new conection();
    Connection cn = (Connection) cc.getConnection();
}
