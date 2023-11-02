/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Egresados;

import datos.DatosEgresados;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodoss;

public class frmReportes extends javax.swing.JFrame {

    DatosEgresados datos = new DatosEgresados();
    Metodoss metodos = new Metodoss();

    public frmReportes() {
        initComponents();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Código de Estudiante");
        model.addColumn("Filial");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("Nombres");
        model.addColumn("Correo Electrónico");
        model.addColumn("Año de egreso");
        model.addColumn("Semestre de egreso");
        model.addColumn("Tipo de documento de identidad");
        model.addColumn("Nº de documento de identidad");
        model.addColumn("Tiene Grado");
        model.addColumn("Resolucion de Grado");
        model.addColumn("Tiene Título");
        model.addColumn("Resolucion de Título");
        model.addColumn("Estado de trabajo");
        model.addColumn("Teléfono 1");
        model.addColumn("Operador 1");
        model.addColumn("Teléfono 2");
        model.addColumn("Operador 2");
        model.addColumn("Teléfono 3");
        model.addColumn("Operador 2");
        
        tblDatos.setModel(model);
        
        String[][] datos = metodos.mostrar();
        if (datos != null) {
            for (String[] row : datos) {
                model.addRow(row);
            }
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnbuscar = new javax.swing.JButton();
        txtNumeroDoc = new javax.swing.JTextField();
        jtxtcodigoE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        txtNumeroDoc.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtNumeroDoc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nº Documento de identidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtNumeroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDocActionPerformed(evt);
            }
        });
        txtNumeroDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDocKeyTyped(evt);
            }
        });

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_REPORTES.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N

        tblDatos.setBackground(new java.awt.Color(255, 255, 250));
        tblDatos.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDatos.setColumnSelectionAllowed(true);
        tblDatos.setMaximumSize(new java.awt.Dimension(1280, 500));
        tblDatos.setMinimumSize(new java.awt.Dimension(1280, 500));
        tblDatos.getTableHeader().setReorderingAllowed(false);
        tblDatos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tblDatosComponentResized(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);
        tblDatos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        setPreferredSize(new Dimension(1280, 700));

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jtxtcodigoE, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbtnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtcodigoE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jbtnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1996, 1996, 1996))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbuscarActionPerformed
        //traemos el codigo a buscar
        String codigo = jtxtcodigoE.getText();
        String numeroDocIdenti = txtNumeroDoc.getText();

        if (codigo.equals("") && numeroDocIdenti.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el código del estudiante o su Nº Documento de identidad.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("lol");
        } else if (numeroDocIdenti.equals("")) {
            //instancia de la clase datos para guardar lo obtenido
            DatosEgresados datosencontrados = new DatosEgresados();
            //traer al metodo :D
            metodos.buscarPorCodigo(codigo, numeroDocIdenti, datosencontrados);
            if (datosencontrados.getReGrado() != null) {
                //colocar en el formulario lo encontrado

            }
        } else {
            //instancia de la clase datos para guardar lo obtenido
            DatosEgresados datosencontrados = new DatosEgresados();
            //traer al metodo :D
            metodos.buscarPorCodigo(codigo, numeroDocIdenti, datosencontrados);
            if (datosencontrados.getReGrado() != null) {
                //colocar en el formulario lo encontrado

            }
        }
    }//GEN-LAST:event_jbtnbuscarActionPerformed

    private void txtNumeroDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDocKeyTyped
        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {
        } else {
            evt.consume();
        }

        if (txtNumeroDoc.getText().length() >= 8) {
            evt.consume();
            //SONIDO ERROR
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNumeroDocKeyTyped

    private void txtNumeroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDocActionPerformed

    private void jtxtcodigoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcodigoEKeyTyped
        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {
        } else {
            evt.consume();
        }

        if (jtxtcodigoE.getText().length() >= 10) {
            evt.consume();
            //SONIDO ERROR
            getToolkit().beep();
        }
    }//GEN-LAST:event_jtxtcodigoEKeyTyped

    private void jtxtcodigoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcodigoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodigoEActionPerformed

    private void tblDatosComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblDatosComponentResized

    }//GEN-LAST:event_tblDatosComponentResized

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
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnbuscar;
    private javax.swing.JTextField jtxtcodigoE;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtNumeroDoc;
    // End of variables declaration//GEN-END:variables
}
