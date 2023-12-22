/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Egresados;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import metodos.Metodoss;

/**
 *
 * @author anton
 */
public class frmPerfiles extends javax.swing.JFrame {
    
    Metodoss m = new Metodoss();
    public frmPerfiles() {
        initComponents();
        llenarCombobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jtxtIDEspecial = new javax.swing.JTextField();
        jbtnBuscarEspecial = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcbxPerfil = new javax.swing.JComboBox<>();
        jtxtEspecial = new javax.swing.JTextField();
        jbtnGuardarEspecial = new javax.swing.JButton();
        jbtnEliminar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jtxtIDPerfil = new javax.swing.JTextField();
        jbtnBuscarPerfil = new javax.swing.JButton();
        jtxtPerfil = new javax.swing.JTextField();
        jbtnguardar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvxs.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_PERFILES.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barra_xl.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Especializaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 600, 420));

        jtxtIDEspecial.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jtxtIDEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        jtxtIDEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIDEspecialActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtIDEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 80));

        jbtnBuscarEspecial.setBackground(new java.awt.Color(204, 255, 255));
        jbtnBuscarEspecial.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jbtnBuscarEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtnBuscarEspecial.setBorder(null);
        jbtnBuscarEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarEspecialActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnBuscarEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 60, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setText("Elija un Perfil:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jcbxPerfil.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jcbxPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcbxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxPerfilActionPerformed(evt);
            }
        });
        jPanel3.add(jcbxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 210, 50));

        jtxtEspecial.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jtxtEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese una especialización:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        jtxtEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEspecialActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 350, 80));

        jbtnGuardarEspecial.setBackground(new java.awt.Color(76, 128, 76));
        jbtnGuardarEspecial.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jbtnGuardarEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jbtnGuardarEspecial.setText("GUARDAR");
        jbtnGuardarEspecial.setBorder(null);
        jbtnGuardarEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarEspecialActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnGuardarEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 150, 60));

        jbtnEliminar1.setBackground(new java.awt.Color(255, 102, 102));
        jbtnEliminar1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jbtnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EDITAR.png"))); // NOI18N
        jbtnEliminar1.setText("ELIMINAR");
        jbtnEliminar1.setBorder(null);
        jbtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminar1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 150, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 600, 320));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Perfiles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 600, 420));

        jtxtIDPerfil.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jtxtIDPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        jtxtIDPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIDPerfilActionPerformed(evt);
            }
        });
        jPanel5.add(jtxtIDPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 80));

        jbtnBuscarPerfil.setBackground(new java.awt.Color(204, 255, 255));
        jbtnBuscarPerfil.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jbtnBuscarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtnBuscarPerfil.setBorder(null);
        jbtnBuscarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarPerfilActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnBuscarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 60, 50));

        jtxtPerfil.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jtxtPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese un nuevo perfil:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        jtxtPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPerfilActionPerformed(evt);
            }
        });
        jPanel5.add(jtxtPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, 80));

        jbtnguardar.setBackground(new java.awt.Color(76, 128, 76));
        jbtnguardar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jbtnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jbtnguardar.setText("GUARDAR");
        jbtnguardar.setBorder(null);
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, 60));

        jbtnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EDITAR.png"))); // NOI18N
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.setBorder(null);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 320));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPerfilActionPerformed

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
        String Perfil = jtxtPerfil.getText();
        m.guardarPerfil(Perfil);
        llenarCombobox();
        jtxtPerfil.setText("");
    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void jtxtEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEspecialActionPerformed

    private void jbtnBuscarEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarEspecialActionPerformed
        if(jtxtIDEspecial.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido para buscar una especialización.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int codigoespe = Integer.parseInt(jtxtIDEspecial.getText());
            Object[] Especial = new Object[2];
            Especial = m.buscarPorEspecial(codigoespe);
            jtxtEspecial.setText(Especial[1].toString());
            if (Especial[1].toString()!=null){
                jcbxPerfil.setSelectedItem(m.obtenerNombrePERFIL((int)Especial[0]));
            }
        }
    }//GEN-LAST:event_jbtnBuscarEspecialActionPerformed

    private void jbtnBuscarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarPerfilActionPerformed
        //traemos el codigo a buscar
        String codigo= jtxtIDPerfil.getText();
        String Perfil = m.buscarPorIDPerfil(codigo);
        jtxtPerfil.setText(Perfil);
        int nuevocodigo = Integer.parseInt(codigo);
        jcbxPerfil.setSelectedItem(m.obtenerNombrePERFIL(nuevocodigo));
    }//GEN-LAST:event_jbtnBuscarPerfilActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        String codigo= jtxtIDPerfil.getText();
        if (codigo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido para borrar un perfil.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            jtxtIDPerfil.setText("");
            jcbxPerfil.setSelectedIndex(0);
            m.borrarPerfil(codigo);
            llenarCombobox();
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnGuardarEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarEspecialActionPerformed
        String Especial = jtxtEspecial.getText();
        int Operador1 = m.obtenerIdPerfil(jcbxPerfil.getSelectedItem().toString());
        m.guardarEspecializacion(Especial, Operador1);
        jtxtEspecial.setText("");
        jcbxPerfil.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnGuardarEspecialActionPerformed

    private void jbtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminar1ActionPerformed
        String Especial = jtxtEspecial.getText();
        m.borrarEspecializacion(Especial);
        
        jtxtEspecial.setText("");
        jcbxPerfil.setSelectedIndex(0);

    }//GEN-LAST:event_jbtnEliminar1ActionPerformed

    private void jcbxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxPerfilActionPerformed

    private void jtxtIDPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIDPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIDPerfilActionPerformed

    private void jtxtIDEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIDEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIDEspecialActionPerformed
    
    private void llenarCombobox() {
        DefaultComboBoxModel<String> model1 = m.obtenerNombresPerfiles();
        jcbxPerfil.setModel(model1);
    }
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
            java.util.logging.Logger.getLogger(frmPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPerfiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnBuscarEspecial;
    private javax.swing.JButton jbtnBuscarPerfil;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnEliminar1;
    private javax.swing.JButton jbtnGuardarEspecial;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JComboBox<String> jcbxPerfil;
    private javax.swing.JTextField jtxtEspecial;
    private javax.swing.JTextField jtxtIDEspecial;
    private javax.swing.JTextField jtxtIDPerfil;
    private javax.swing.JTextField jtxtPerfil;
    // End of variables declaration//GEN-END:variables
}
