
package Egresados;

import datos.Datos;
import javax.swing.JOptionPane;
import metodos.Metodoss;
public class frmSistema extends javax.swing.JFrame {
    Datos datos = new Datos();
    Metodoss metodos= new Metodoss();

    public frmSistema() {
        initComponents();
        setTitle("SEGUIMIENTO DE EGRESADOS");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneCustom1 = new raven.tabbed.TabbedPaneCustom();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtcodigoE = new javax.swing.JTextField();
        jbtnbuscar = new javax.swing.JButton();
        jbtnguardar = new javax.swing.JButton();
        jtxtnacionalidad = new javax.swing.JTextField();
        jbtnnuevo = new javax.swing.JButton();
        jtxtcorreo1 = new javax.swing.JTextField();
        jtxtnombre1 = new javax.swing.JTextField();
        jtxttelefono1 = new javax.swing.JTextField();
        jcbxlabura = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabbedPaneCustom1.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPaneCustom1.setSelectedColor(new java.awt.Color(95, 119, 186));
        tabbedPaneCustom1.setUnselectedColor(new java.awt.Color(73, 89, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL2_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 320, 180));

        jtxtcodigoE.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jtxtcodigoE.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Código de estudiante", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxtcodigoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcodigoEActionPerformed(evt);
            }
        });
        jtxtcodigoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtcodigoEKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtcodigoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 420, 80));

        jbtnbuscar.setBackground(new java.awt.Color(255, 102, 102));
        jbtnbuscar.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jbtnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtnbuscar.setText("BUSCAR");
        jbtnbuscar.setBorder(null);
        jbtnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 760, 60));

        jbtnguardar.setBackground(new java.awt.Color(204, 255, 255));
        jbtnguardar.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jbtnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jbtnguardar.setText("GUARDAR");
        jbtnguardar.setBorder(null);
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, 250, 75));

        jtxtnacionalidad.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jtxtnacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nacionalidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxtnacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnacionalidadActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtnacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 419, 80));

        jbtnnuevo.setBackground(new java.awt.Color(204, 255, 255));
        jbtnnuevo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jbtnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jbtnnuevo.setText("NUEVO");
        jbtnnuevo.setBorder(null);
        jbtnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 249, 75));

        jtxtcorreo1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jtxtcorreo1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Correo Electrónico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxtcorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcorreo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtcorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 420, 80));

        jtxtnombre1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jtxtnombre1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Apellidos y Nombres", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxtnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 420, 80));

        jtxttelefono1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jtxttelefono1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Teléfono/N°Celular", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxttelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttelefono1ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxttelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 419, 80));

        jcbxlabura.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jcbxlabura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jcbxlabura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jcbxlabura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 340, 230, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogotipoUCV_VersiónLarga 1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo1_2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, -1, 160));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Trabaja:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 300, 80, 40));

        tabbedPaneCustom1.addTab("Egresados", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        tabbedPaneCustom1.addTab("tab2", jPanel2);

        getContentPane().add(tabbedPaneCustom1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtcodigoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcodigoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodigoEActionPerformed

    private void jbtnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbuscarActionPerformed
        String codigoBusqueda = jtxtcodigoE.getText();
        if (codigoBusqueda != null && !codigoBusqueda.isEmpty()) {
            Datos datosEncontrados = metodos.buscarPorCodigo(codigoBusqueda);

            if (datosEncontrados != null) {
                jtxtcodigoE.setText(datosEncontrados.getCodigoUCV());
                jtxtnombre1.setText(datosEncontrados.getApellidos());
                jtxtcorreo1.setText(datosEncontrados.getCorreo());
                jtxtnacionalidad.setText(datosEncontrados.getNacionalidad());
                jtxttelefono1.setText(String.valueOf(datosEncontrados.getTel()));
                jcbxlabura.setSelectedItem(datosEncontrados.getLabura());
                
                
                //BLOQUEAR LOS TEXT FIELD Y EL CBX
                jtxtcodigoE.setEditable(false);
                jtxtcorreo1.setEditable(false);
                jtxtnacionalidad.setEditable(false);
                jtxtnombre1.setEditable(false);
                jtxttelefono1.setEditable(false);
                jcbxlabura.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Código de estudiante no encontrado", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un código de estudiante válido", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jbtnbuscarActionPerformed

    private void jbtnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnuevoActionPerformed
        //DESBLOQUEAR LOS TEXT FIELD Y EL CBX
        jtxtcodigoE.setEditable(true);
        jtxtcorreo1.setEditable(true);
        jtxtnacionalidad.setEditable(true);
        jtxtnombre1.setEditable(true);
        jtxttelefono1.setEditable(true);
        jcbxlabura.setEnabled(true);
        //VACIAR LOS TEXT FIELD 
        jtxtcodigoE.setText("");
        jtxtcorreo1.setText("");
        jtxtnacionalidad.setText("");
        jtxtnombre1.setText("");
        jtxttelefono1.setText("");
    }//GEN-LAST:event_jbtnnuevoActionPerformed

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
        String codigo = jtxtcodigoE.getText();
        metodos.CompararCodigo(codigo);
        String apellido = jtxtnombre1.getText();
        String correo = jtxtcorreo1.getText();
        String nacionalidad = jtxtnacionalidad.getText();
        int tel=Integer.parseInt(jtxttelefono1.getText());
        String labura = jcbxlabura.getSelectedItem().toString();
        
           datos.setCodigoUCV(codigo);
           datos.setApellidos(apellido);
           datos.setCorreo(correo);
           datos.setNacionalidad(nacionalidad);
           datos.setTel(tel);
           datos.setLabura(labura);

           metodos.guardar(datos);
           metodos.guardarArchivo(datos);

           //VACIAR LOS TEXT FIELD 
            jtxtcodigoE.setText("");
            jtxtcorreo1.setText("");
            jtxtnacionalidad.setText("");
            jtxtnombre1.setText("");
            jtxttelefono1.setText("");
        
    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void jtxtnacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnacionalidadActionPerformed

    private void jtxtnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombre1ActionPerformed

    private void jtxtcorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcorreo1ActionPerformed

    private void jtxttelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttelefono1ActionPerformed

    private void jtxtcodigoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcodigoEKeyTyped
        char car = evt.getKeyChar();
        if(Character.isDigit(car)){
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_jtxtcodigoEKeyTyped

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
            java.util.logging.Logger.getLogger(frmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnbuscar;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JButton jbtnnuevo;
    private javax.swing.JComboBox<String> jcbxlabura;
    private javax.swing.JTextField jtxtcodigoE;
    private javax.swing.JTextField jtxtcorreo1;
    private javax.swing.JTextField jtxtnacionalidad;
    private javax.swing.JTextField jtxtnombre1;
    private javax.swing.JTextField jtxttelefono1;
    private raven.tabbed.TabbedPaneCustom tabbedPaneCustom1;
    // End of variables declaration//GEN-END:variables
}
