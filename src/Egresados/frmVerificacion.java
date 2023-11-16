package Egresados;

import datos.DatosUsuarios;
import javax.swing.JOptionPane;
import metodos.Metodoss;

public class frmVerificacion extends javax.swing.JFrame implements FormularioListener {
    
    frmRegistrarse f = new frmRegistrarse();
    DatosUsuarios datos = new DatosUsuarios();
    Metodoss metodos= new Metodoss();

    private FormularioListener formularioListener;
    private String correoElectronico;
    private String codigoVerificacion;
    private String usuario;
    private String contrasena;
    private String apellidosNombres;

    public frmVerificacion(FormularioListener listener, String correoElectronico, String codigoVerificacion, String usuario, String contrasena, String apellidosNombres) {
        initComponents();
        this.formularioListener = listener;
        this.correoElectronico = correoElectronico;
        this.codigoVerificacion = codigoVerificacion;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.apellidosNombres = apellidosNombres;
    }

    private frmVerificacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvxs.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 80, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Verificación.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barra_nueva.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        jtxtCodigo.setToolTipText("");
        jtxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese el código de verificación:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 0, 18))); // NOI18N
        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });
        jtxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 310, 80));

        btnVerificar.setBackground(new java.awt.Color(227, 5, 22));
        btnVerificar.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificar.setText("Verificar correo");
        btnVerificar.setBorder(null);
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {
        // Este método se ejecuta cuando el formulario se cierra.
        if (formularioListener != null) {
            formularioListener.formularioCerrado();
        }
    }
    
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String verificar = jtxtCodigo.getText().trim();
        if (codigoVerificacion.equals(verificar)) {
            //GUARDAR DATOS
            datos.setAPELLIDOS_Y_NOMBRES(apellidosNombres);
            datos.setCONTRASEÑA(contrasena);
            datos.setCORREO_ELECTRONICO(correoElectronico);
            datos.setUSUARIO(usuario);

            metodos.guardarUsuario(datos);
            dispose();  // Cierra el formulario actual (frmVerificacion)

            // Cierra el formulario padre (frmRegistrarse)
            if (formularioListener != null) {
                formularioListener.formularioCerrado();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el código de verificación correcto.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void jtxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoKeyTyped
       char car = evt.getKeyChar();
        if(Character.isDigit(car)){
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_jtxtCodigoKeyTyped

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
            java.util.logging.Logger.getLogger(frmVerificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVerificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVerificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVerificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtCodigo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void formularioCerrado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
