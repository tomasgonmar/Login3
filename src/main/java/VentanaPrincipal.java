
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Tomás González Martín
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private JButton entrar;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        getRootPane().setDefaultButton(entrar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        lblLogo2 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jSeparatorMail = new javax.swing.JSeparator();
        textFieldEmail = new javax.swing.JTextField();
        jSeparatorContraseña = new javax.swing.JSeparator();
        jPasswordField = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblInicioSesion = new javax.swing.JLabel();
        panelAcceso = new javax.swing.JPanel();
        lblAcceso = new javax.swing.JLabel();
        panelCierre = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        panelMovimientoVentana = new javax.swing.JPanel();
        lblLogo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        panelFondo.setBackground(new java.awt.Color(153, 255, 255));
        panelFondo.setForeground(new java.awt.Color(102, 255, 255));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelPrincipal.add(lblLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 100, 120));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.login-2.png"))); // NOI18N
        panelPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 110, 50));
        panelPrincipal.add(jSeparatorMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, 10));

        textFieldEmail.setForeground(new java.awt.Color(204, 204, 204));
        textFieldEmail.setText("mail@dominio.com");
        textFieldEmail.setBorder(null);
        textFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldEmailFocusLost(evt);
            }
        });
        panelPrincipal.add(textFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 250, 30));
        panelPrincipal.add(jSeparatorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 250, 10));

        jPasswordField.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField.setText("passwordPrueba");
        jPasswordField.setBorder(null);
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        panelPrincipal.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 250, -1));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Usuario");
        panelPrincipal.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 180, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContraseña.setText("Contraseña");
        panelPrincipal.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, -1));

        lblInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblInicioSesion.setText("INICIAR SESION");
        panelPrincipal.add(lblInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, -1));

        panelAcceso.setBackground(new java.awt.Color(91, 189, 157));

        lblAcceso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAcceso.setForeground(new java.awt.Color(255, 255, 255));
        lblAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcceso.setText("ACCEDER");
        lblAcceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccesoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAccesoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAccesoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAccesoLayout = new javax.swing.GroupLayout(panelAcceso);
        panelAcceso.setLayout(panelAccesoLayout);
        panelAccesoLayout.setHorizontalGroup(
            panelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccesoLayout.createSequentialGroup()
                .addComponent(lblAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAccesoLayout.setVerticalGroup(
            panelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccesoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPrincipal.add(panelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 250, 50));

        panelCierre.setBackground(new java.awt.Color(255, 255, 255));

        lblCierre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCierre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCierre.setText("X");
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCierreLayout = new javax.swing.GroupLayout(panelCierre);
        panelCierre.setLayout(panelCierreLayout);
        panelCierreLayout.setHorizontalGroup(
            panelCierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCierre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelCierreLayout.setVerticalGroup(
            panelCierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCierre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        panelMovimientoVentana.setOpaque(false);
        panelMovimientoVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMovimientoVentanaMouseDragged(evt);
            }
        });
        panelMovimientoVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMovimientoVentanaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMovimientoVentanaLayout = new javax.swing.GroupLayout(panelMovimientoVentana);
        panelMovimientoVentana.setLayout(panelMovimientoVentanaLayout);
        panelMovimientoVentanaLayout.setHorizontalGroup(
            panelMovimientoVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        panelMovimientoVentanaLayout.setVerticalGroup(
            panelMovimientoVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelMovimientoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));
        panelPrincipal.add(lblLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 110, 50));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEmailFocusGained
        if(textFieldEmail.getText().isEmpty()||textFieldEmail.getText().equals("mail@dominio.com"))
        textFieldEmail.setText("");
        textFieldEmail.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldEmailFocusGained

    private void textFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEmailFocusLost
        if(textFieldEmail.getText().isEmpty()){
            textFieldEmail.setForeground(new Color(204,204,204));
            textFieldEmail.setText("mail@dominio.com");
        }
    }//GEN-LAST:event_textFieldEmailFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        if(jPasswordField.getText().isEmpty()||jPasswordField.getText().equals("passwordPrueba"))
        jPasswordField.setText("");
        jPasswordField.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        if(jPasswordField.getText().isEmpty()){
            jPasswordField.setForeground(new Color(204,204,204));
            jPasswordField.setText("passwordPrueba");
        }
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void lblAccesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccesoMouseClicked
        if(jPasswordField.getText().equals("1234")&& textFieldEmail.getText().equals("micorreo@email.com")){
            JOptionPane.showMessageDialog(rootPane, "Sesion iniciada correctamente","",JOptionPane.PLAIN_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrectos","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblAccesoMouseClicked

    private void lblAccesoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccesoMouseEntered
        panelAcceso.setBackground(new Color(86,210,169));
    }//GEN-LAST:event_lblAccesoMouseEntered

    private void lblAccesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccesoMouseExited
        panelAcceso.setBackground(new Color(91,189,157));
    }//GEN-LAST:event_lblAccesoMouseExited

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        panelCierre.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        panelCierre.setBackground(Color.white);
    }//GEN-LAST:event_lblCierreMouseExited

    private void panelMovimientoVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMovimientoVentanaMouseDragged
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_panelMovimientoVentanaMouseDragged

    private void panelMovimientoVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMovimientoVentanaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelMovimientoVentanaMousePressed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparatorContraseña;
    private javax.swing.JSeparator jSeparatorMail;
    private javax.swing.JLabel lblAcceso;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelAcceso;
    private javax.swing.JPanel panelCierre;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMovimientoVentana;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField textFieldEmail;
    // End of variables declaration//GEN-END:variables
}
