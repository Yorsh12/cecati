/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;

import MenuInicio.InicioAdmin;
import javax.swing.JOptionPane;
import AppPackage.AnimationClass;
import Metodos.metodosLogin;
import RegistroUser.Formulario;
import conexion.conection;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author christian
 */
public class LogIn extends javax.swing.JFrame {
 InicioAdmin ad = new InicioAdmin();
String nombre;
    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        
    }
public void openInterner(){
    try {
        Desktop.getDesktop().browse(URI.create("https://www.google.com.mx"));
    } catch (Exception e) {
        JOptionPane.showConfirmDialog(this, e);
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

        jpIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlMusica = new javax.swing.JLabel();
        jlInternet = new javax.swing.JLabel();
        jlCalculadora = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jpMenu = new javax.swing.JLabel();
        jpMenu1 = new javax.swing.JLabel();
        jpMenu2 = new javax.swing.JLabel();
        jpMenu3 = new javax.swing.JLabel();
        jpMenu4 = new javax.swing.JLabel();
        jpMenu5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("A little sunshine", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("Contraseña:");
        jpIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 200, 30));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("A little sunshine", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Usuario:");
        jpIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_96px_2.png"))); // NOI18N
        jpIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 110));

        txtUser.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setText("Ingrese Usuario..");
        txtUser.setBorder(null);
        jpIngreso.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 180, 30));
        jpIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 210, 10));
        jpIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 210, 10));

        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setText("password");
        txtPass.setBorder(null);
        jpIngreso.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Key_32px.png"))); // NOI18N
        jpIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_customer_32px_1.png"))); // NOI18N
        jpIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Menu_32px.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jpIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_OFF.png"))); // NOI18N
        jButton1.setBorderPainted(false);
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
        jpIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, 60));

        jlMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Musical_Notes_32px.png"))); // NOI18N
        jpIngreso.add(jlMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 170, 40, 40));

        jlInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Globe_32px.png"))); // NOI18N
        jlInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlInternetMouseClicked(evt);
            }
        });
        jpIngreso.add(jlInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 70, 40, 40));

        jlCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Calculator_32px.png"))); // NOI18N
        jlCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCalculadoraMouseClicked(evt);
            }
        });
        jpIngreso.add(jlCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 120, 40, 40));

        jLabel16.setBackground(new java.awt.Color(0, 51, 255));
        jLabel16.setForeground(new java.awt.Color(0, 51, 255));
        jLabel16.setText("Regístrate ahora»");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jpIngreso.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 99, 71));
        jLabel7.setForeground(new java.awt.Color(255, 99, 71));
        jLabel7.setText("Notas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 99, 71));
        jLabel9.setForeground(new java.awt.Color(255, 99, 71));
        jLabel9.setText("Programado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 99, 71));
        jLabel10.setForeground(new java.awt.Color(255, 99, 71));
        jLabel10.setText("Cronograma");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 99, 71));
        jLabel11.setForeground(new java.awt.Color(255, 99, 71));
        jLabel11.setText("Herramientas");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 99, 71));
        jLabel12.setForeground(new java.awt.Color(255, 99, 71));
        jLabel12.setText("Socios");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 99, 71));
        jLabel13.setForeground(new java.awt.Color(255, 99, 71));
        jLabel13.setText("Google Drive");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jpMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Maintenance_96px.png"))); // NOI18N
        jpMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpMenuMouseMoved(evt);
            }
        });
        jpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenuMouseExited(evt);
            }
        });
        jPanel1.add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 190, 170));

        jpMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Today_96px.png"))); // NOI18N
        jpMenu1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpMenu1MouseMoved(evt);
            }
        });
        jpMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenu1MouseExited(evt);
            }
        });
        jPanel1.add(jpMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 190, 170));

        jpMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Clock_96px.png"))); // NOI18N
        jpMenu2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpMenu2MouseMoved(evt);
            }
        });
        jpMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenu2MouseExited(evt);
            }
        });
        jPanel1.add(jpMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 190, 170));

        jpMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Google_Drive_96px.png"))); // NOI18N
        jpMenu3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpMenu3MouseMoved(evt);
            }
        });
        jpMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMenu3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenu3MouseExited(evt);
            }
        });
        jPanel1.add(jpMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 190, 170));

        jpMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Idea_96px.png"))); // NOI18N
        jpMenu4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpMenu4MouseMoved(evt);
            }
        });
        jpMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenu4MouseExited(evt);
            }
        });
        jPanel1.add(jpMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 190, 170));

        jpMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Handshake_96px.png"))); // NOI18N
        jpMenu5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpMenu5MouseMoved(evt);
            }
        });
        jpMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenu5MouseExited(evt);
            }
        });
        jPanel1.add(jpMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 190, 170));

        jTextField2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Buscar..");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 240, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_32px_2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 17, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_32px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 17, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void sesion(String sesion){
   
    
   
    
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        metodosLogin metodoslogin = new metodosLogin();
  
   
        
if(metodoslogin.validar_ingreso()==1){
     
     /////////
   
       ad.inisesion();
              
    
    //////
      
           
           this.dispose();
           
           JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
                   + "bienvenido", "Mensaje de bienvenida",
                   JOptionPane.INFORMATION_MESSAGE);
           
           InicioAdmin formformulario1 = new InicioAdmin();
           formformulario1.setVisible(true);
   

}else {
                    
        JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
        + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
        JOptionPane.ERROR_MESSAGE);
            
}
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        AnimationClass internet = new AnimationClass();
        
        internet.jLabelXRight(-40, 20, 10, 5, jlInternet);
        
         AnimationClass calculadora = new AnimationClass();
        
        calculadora.jLabelXRight(-40, 20, 10, 5, jlCalculadora);
        
         AnimationClass musica = new AnimationClass();
        
        musica.jLabelXRight(-40, 20, 10, 5, jlMusica);
        
        //<------
        
           AnimationClass internett = new AnimationClass();
        
        internet.jLabelXLeft(20,-40, 10, 5, jlInternet);
        
        AnimationClass calculadoraa = new AnimationClass();
        
        calculadoraa.jLabelXLeft(20,-40, 10, 5, jlCalculadora);
        
        AnimationClass musicaa = new AnimationClass();
        
        musicaa.jLabelXLeft(20,-40, 10, 5, jlMusica);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       this.setState(LogIn.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Desea salir del LogIn?", "Exit",dialog);
        
        if(result == 0){
            System.exit(0);
        }

    }//GEN-LAST:event_jLabel15MouseClicked
//[255,99,71]
    private void jpMenu1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu1MouseMoved
        jpMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
    }//GEN-LAST:event_jpMenu1MouseMoved

    private void jpMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu1MouseExited
        jpMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jpMenu1MouseExited

    private void jpMenu2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu2MouseMoved
       jpMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
    }//GEN-LAST:event_jpMenu2MouseMoved

    private void jpMenu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu2MouseExited
       jpMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jpMenu2MouseExited

    private void jpMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenuMouseMoved
        jpMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
    }//GEN-LAST:event_jpMenuMouseMoved

    private void jpMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenuMouseExited
       jpMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jpMenuMouseExited

    private void jpMenu4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu4MouseMoved
       jpMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
    }//GEN-LAST:event_jpMenu4MouseMoved

    private void jpMenu4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu4MouseExited
        jpMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jpMenu4MouseExited

    private void jpMenu3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu3MouseMoved
         jpMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
    }//GEN-LAST:event_jpMenu3MouseMoved

    private void jpMenu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu3MouseExited
        jpMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jpMenu3MouseExited

    private void jpMenu5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu5MouseMoved
        jpMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
    }//GEN-LAST:event_jpMenu5MouseMoved

    private void jpMenu5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu5MouseExited
        jpMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jpMenu5MouseExited

    private void jlInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInternetMouseClicked
          openInterner();
          
    }//GEN-LAST:event_jlInternetMouseClicked

    private void jlCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCalculadoraMouseClicked
       String osName = System.getProperty("os.name").toLowerCase();
Runtime obj = Runtime.getRuntime();
 
if(osName.indexOf("win") >= 0) {
           try {
               obj.exec("C:\\WINDOWS\\system32\\CALC.EXE");
           } catch (IOException ex) {
               Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
           }
}
 
else if(osName.indexOf("mac") >= 0) {
	// codigo para Mac
        try {
               obj.exec("/Applications/Calculator.app");
           } catch (IOException ex) {
               Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
           }
}
 
else if(osName.indexOf("nux") >= 0) {
           try {
               obj.exec("/usr/bin/gnome-calculator");
           } catch (IOException ex) {
               Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
           }
}   
 

    }//GEN-LAST:event_jlCalculadoraMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // evento registro
        
        Formulario F = new Formulario();
        
        F.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jpMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu3MouseClicked
        // TODO add your handling code here: codigo mosuse clicked drive
         try {
        Desktop.getDesktop().browse(URI.create("https://drive.google.com/drive/"));
    } catch (Exception e) {
        JOptionPane.showConfirmDialog(this, e);
    }
    }//GEN-LAST:event_jpMenu3MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jlCalculadora;
    private javax.swing.JLabel jlInternet;
    private javax.swing.JLabel jlMusica;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JLabel jpMenu;
    private javax.swing.JLabel jpMenu1;
    private javax.swing.JLabel jpMenu2;
    private javax.swing.JLabel jpMenu3;
    private javax.swing.JLabel jpMenu4;
    private javax.swing.JLabel jpMenu5;
    public static javax.swing.JPasswordField txtPass;
    public static javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
conection cc = new conection();
    Connection cn = (Connection) cc.getConnection();
}
