package Egresados;

import datos.DatosUsuarios;
import javax.swing.JOptionPane;
import metodos.Metodoss;

public class frmRegistrarse extends javax.swing.JFrame implements FormularioListener{
    DatosUsuarios datos = new DatosUsuarios();
    Metodoss metodos= new Metodoss();
    String CORREO_ELECTRONICO;
    String codigo;

    public frmRegistrarse() {
        initComponents();
        setTitle("REGISTRARSE");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        txtApellidosNombres = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvxs.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 80, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo Usuario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barra_nueva.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 250));
        txtUsuario.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre de usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 20))); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, 70));

        txtContra.setBackground(new java.awt.Color(255, 255, 250));
        txtContra.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtContra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contraseña", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 20))); // NOI18N
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 290, 70));

        txtApellidosNombres.setBackground(new java.awt.Color(255, 255, 250));
        txtApellidosNombres.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtApellidosNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Apellidos y nombres", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 20))); // NOI18N
        txtApellidosNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosNombresActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellidosNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, 70));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 250));
        txtCorreo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Correo electrónico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 20))); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 290, 70));

        btnVerificar.setBackground(new java.awt.Color(227, 5, 22));
        btnVerificar.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificar.setText("Registrar");
        btnVerificar.setBorder(null);
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 340, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    @Override
    public void formularioCerrado() {
    }

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void txtApellidosNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosNombresActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        CORREO_ELECTRONICO = txtCorreo.getText();
        codigo = metodos.generarNumerosAlAzar();
        String USUARIO = txtUsuario.getText();
        String CONTRASEÑA = txtContra.getText();
        String APELLIDOS_Y_NOMBRES = txtApellidosNombres.getText();
        boolean verificacion = metodos.verificarCorreo(CORREO_ELECTRONICO);
        if(metodos.consultaCorreo(CORREO_ELECTRONICO)){
            JOptionPane.showMessageDialog(null, "El correo ingresado ya está registrado.", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
        else {
            if (USUARIO.equals("") || CONTRASEÑA.equals("") || APELLIDOS_Y_NOMBRES.equals("") || CORREO_ELECTRONICO.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los datos por favor.", "AVISO", JOptionPane.WARNING_MESSAGE);
            } else if (verificacion) {
                metodos.enviarCorreoVerifacion(CORREO_ELECTRONICO, codigo);
                frmVerificacion fv = new frmVerificacion(this, CORREO_ELECTRONICO, codigo, USUARIO, CONTRASEÑA, APELLIDOS_Y_NOMBRES);
                txtApellidosNombres.setEnabled(false);
                txtContra.setEnabled(false);
                txtCorreo.setEnabled(false);
                txtUsuario.setEnabled(false);
                btnVerificar.setEnabled(false);
                fv.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un correo electrónico válido.", "AVISO", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidosNombres;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
