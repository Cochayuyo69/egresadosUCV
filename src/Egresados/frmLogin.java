package Egresados;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import metodos.Metodoss;

public class frmLogin extends javax.swing.JFrame {
    Metodoss metodos= new Metodoss();

    public frmLogin() {
        initComponents();
        setTitle("SEGUIMIENTO DE EGRESADOS");
        //Tamaño de la ventana
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btnCrearcuenta = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel10.setText("¿Has olvidado la contraseña?");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 160, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 80, 87));
        jLabel9.setText("Contraseña");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Header.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraKeyReleased(evt);
            }
        });
        jPanel2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 340, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 80, 87));
        jLabel7.setText("Usuario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 40));

        btnCrearcuenta.setBackground(new java.awt.Color(34, 47, 80));
        btnCrearcuenta.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnCrearcuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearcuenta.setText("Registrarse");
        btnCrearcuenta.setBorder(null);
        btnCrearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearcuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCrearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 340, 40));

        btnIniciarSesion.setBackground(new java.awt.Color(227, 5, 22));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 340, 40));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 340, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Content.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 330));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 450, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL2_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL1_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CESAR_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo1_1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 80, 87));
        jLabel8.setText("© 2023 Creado y diseñado por Vallejianos.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 350, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearcuentaActionPerformed
        frmRegistrarse f = new frmRegistrarse();
        f.setVisible(true);
    }//GEN-LAST:event_btnCrearcuentaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String usuario = txtUsuario.getText();
        String contra = txtContra.getText();
        if(usuario.equals("") && contra.equals("")){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingrese un usuario y contraseña.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        else if (usuario.equals("")){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingrese un usuario.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        else if (contra.equals("")){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingrese una contraseña.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        else{
            String est = metodos.consultaUsuario(usuario, contra);
            if (est.equals("CORRECTOS")){
                frmMenu f = new frmMenu();
                f.setVisible(true);
                dispose();
            }
            else if (est.equals("ERROR")){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtContraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String usuario = txtUsuario.getText();
            String contra = txtContra.getText();
            if(usuario.equals("") && contra.equals("")){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Ingrese un usuario y contraseña.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
            else if (usuario.equals("")){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Ingrese un usuario.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
            else if (contra.equals("")){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Ingrese una contraseña.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
            else{
                String est = metodos.consultaUsuario(usuario, contra);
                if (est.equals("CORRECTOS")){
                    frmMenu f = new frmMenu();
                    f.setVisible(true);
                    dispose();
                }
                else if (est.equals("ERROR")){
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_txtContraKeyReleased

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        frmRecuperarContra f = new frmRecuperarContra();
        f.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearcuenta;
    private javax.swing.JButton btnIniciarSesion;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
