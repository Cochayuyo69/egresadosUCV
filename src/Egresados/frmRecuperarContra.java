package Egresados;
import javax.swing.JOptionPane;
import metodos.Metodoss;

public class frmRecuperarContra extends javax.swing.JFrame {

    Metodoss m = new Metodoss();
    String codigo;
    String correo;
    public frmRecuperarContra() {
        initComponents();
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
        jtxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        jtxtCorreo = new javax.swing.JTextField();
        btnCorreo = new javax.swing.JButton();
        jtxtContra = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(628, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(628, 410));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtCodigo.setToolTipText("");
        jtxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese el código de verificación:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 0, 18))); // NOI18N
        jtxtCodigo.setEnabled(false);
        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NuevaContraseña.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvxs.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 80, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barra_nueva.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        btnVerificar.setBackground(new java.awt.Color(34, 47, 80));
        btnVerificar.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificar.setText("Verificar correo");
        btnVerificar.setBorder(null);
        btnVerificar.setEnabled(false);
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 240, 50));

        jtxtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese su correo electrónico:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 0, 18))); // NOI18N
        jtxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 310, 80));

        btnCorreo.setBackground(new java.awt.Color(227, 5, 22));
        btnCorreo.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnCorreo.setForeground(new java.awt.Color(255, 255, 255));
        btnCorreo.setText("Enviar correo de verificación");
        btnCorreo.setBorder(null);
        btnCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 240, 50));

        jtxtContra.setToolTipText("");
        jtxtContra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese la nueva contraseña:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 0, 18))); // NOI18N
        jtxtContra.setEnabled(false);
        jtxtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtContraActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 310, 80));

        btnGuardar.setBackground(new java.awt.Color(24, 255, 14));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar ");
        btnGuardar.setBorder(null);
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String verificar = jtxtCodigo.getText().trim();
        if(codigo.equals(verificar)){
            JOptionPane.showMessageDialog(null, "El código de verificación es correcto.", "INFORMACIÓN",JOptionPane.INFORMATION_MESSAGE);
            jtxtContra.setEnabled(true);
            btnGuardar.setEnabled(true);
            jtxtCodigo.setEnabled(false);
            btnVerificar.setEnabled(false);
        }
        else JOptionPane.showMessageDialog(null, "Ingrese el código de verificación correcto.", "ERROR",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void jtxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCorreoActionPerformed

    private void btnCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorreoActionPerformed
        correo = jtxtCorreo.getText().trim();
        boolean estado = m.consultaCorreo(correo);
        codigo = m.generarNumerosAlAzar();
        if(estado){
            m.enviarCorreoNuevaContra(correo, codigo);
            jtxtCodigo.setEnabled(true);
            btnVerificar.setEnabled(true);
            btnCorreo.setEnabled(false);
            jtxtCorreo.setEnabled(false);
        }
        else JOptionPane.showMessageDialog(null, "No hay un usuario registrado con el correo ingresado.", "ERROR",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnCorreoActionPerformed

    private void jtxtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtContraActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String NuevaContra = jtxtContra.getText();
        m.CambiarContra(NuevaContra, correo);
    }//GEN-LAST:event_btnGuardarActionPerformed
   
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
            java.util.logging.Logger.getLogger(frmRecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRecuperarContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorreo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtContra;
    private javax.swing.JTextField jtxtCorreo;
    // End of variables declaration//GEN-END:variables
}
