/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Egresados;

import Capacitaciones.Metodos_capacitacion;
import Excel.BD_Excel;
import Reportes.metodos_reportes;
import datos.DatosEgresados;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import metodos.Metodoss;

/**
 *
 * @author Acer
 */
public class frmAsistencias extends javax.swing.JFrame {
    DefaultTableModel modelo_asistencias = new DefaultTableModel();
    Metodos_capacitacion ejecutar= new Metodos_capacitacion();
    DatosEgresados datos = new DatosEgresados();
    Metodoss metodos = new Metodoss();
    metodos_reportes reporte= new metodos_reportes();
    String[][] Asistencias;
    int contador_invitados=0;
    Object[] indice={"CODIGO UCV", "APELLIDO PATERNO", "APELLIDO MATERNO", "NOMBRES", "COMPROMISO", "ASISTENCIA"};
    public frmAsistencias() {
        initComponents();
        DefaultComboBoxModel<String> model5 = metodos.obtener_areas_trabajo();
        cbx_area.setModel(model5); 
        modelo_asistencias.setColumnIdentifiers(indice);
        tbl_asistencias.setModel(modelo_asistencias);
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_asistencias = new javax.swing.JTable();
        btnImportar = new javax.swing.JButton();
        cbx_importar_asitencia = new javax.swing.JComboBox<>();
        cbx_area = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbx_especializacion = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        cbx_titulo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_contador = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_contador2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_contador3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ASISTENCIAS.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N

        tbl_asistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_asistencias);

        jScrollPane1.setViewportView(jScrollPane2);

        btnImportar.setBackground(new java.awt.Color(76, 128, 76));
        btnImportar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMPORTAR.png"))); // NOI18N
        btnImportar.setText("IMPORTAR");
        btnImportar.setBorder(null);
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        cbx_importar_asitencia.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        cbx_importar_asitencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPROMISO DE ASISTENCIA", "ASISTENCIAS" }));
        cbx_importar_asitencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_importar_asitenciaActionPerformed(evt);
            }
        });

        cbx_area.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_area.setToolTipText("");
        cbx_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbx_area.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbx_area.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbx_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_areaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel5.setText("ÁREA");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel6.setText("ESPECIALIZACIÓN");

        cbx_especializacion.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_especializacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_especializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especializacionActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(255, 102, 102));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        cbx_titulo.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_titulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tituloActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel15.setText("TÍTULO");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel11.setText("CAPACITACIONES:");

        lbl_contador.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        lbl_contador.setText("0");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel12.setText("ASISTENCIAS");

        lbl_contador2.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        lbl_contador2.setText("0");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel13.setText("FALTAS");

        lbl_contador3.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        lbl_contador3.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbx_importar_asitencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(225, 225, 225)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbx_area, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbl_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbl_contador3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbx_especializacion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbl_contador2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel15))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbx_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(178, 178, 178)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_area, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_especializacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(lbl_contador3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(lbl_contador2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_importar_asitencia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        JFileChooser  dlg = new JFileChooser(); // crear un objeto de dialogo
        int option = dlg.showOpenDialog(this); //ABRE LA VENTANA DE DIALOGO
        if(option==JFileChooser.APPROVE_OPTION){ /// Se hace click en el boton abrir del dialogo
            String direccion = dlg.getSelectedFile().getPath(); // Obtieme ruta y nombre del archivo seleccionado
            BD_Excel importar = new BD_Excel();
            try {
                if(cbx_importar_asitencia.getSelectedIndex()==0){
                    importar.importar_compromiso_asistencia(direccion);
                }else{

                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void cbx_importar_asitenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_importar_asitenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_importar_asitenciaActionPerformed

    private void cbx_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_areaActionPerformed

        DefaultComboBoxModel<String> modelo;
        String Texto_Seleccionado = cbx_area.getSelectedItem().toString();
        int area=cbx_area.getSelectedIndex();
        if(area==0){
            modelo= new DefaultComboBoxModel<>();
            cbx_especializacion.setModel(modelo);
            cbx_especializacion.setEnabled(false);
            btn_buscar.setEnabled(false);
        }else{
            int id=metodos.obtener_id_Area_trabajo(Texto_Seleccionado);
            modelo = ejecutar.obtener_especializaciones(id);
            cbx_especializacion.setModel(modelo);
            cbx_especializacion.setEnabled(true);
            btn_buscar.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_areaActionPerformed

    private void cbx_especializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especializacionActionPerformed
        DefaultComboBoxModel<String> modelo;
            String especializacion_Seleccionada = cbx_especializacion.getSelectedItem().toString();
            String area_seleccionada=cbx_area.getSelectedItem().toString();
            modelo = ejecutar.obtener_Titulos(area_seleccionada, especializacion_Seleccionada);
            cbx_titulo.setModel(modelo);
            cbx_titulo.setEnabled(true);
    }//GEN-LAST:event_cbx_especializacionActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

            modelo_asistencias.setRowCount(0);
            String Area=cbx_area.getSelectedItem().toString();
            String Especializacion=cbx_especializacion.getSelectedItem().toString();
            String [] Partes_titulo= metodos.obtener_partes_titulo(cbx_titulo.getSelectedItem().toString());
            String ID_titulo=Partes_titulo[0];
            Asistencias = reporte.buscar_asistencias_por_capacitacion(Area, Especializacion, ID_titulo);
            if (Asistencias != null) {
                for (String[] row : Asistencias) {
                    modelo_asistencias.addRow(row);
                }
            }
            tbl_asistencias.setModel(modelo_asistencias);
            contador_invitados=Asistencias.length;
            lbl_contador.setText(String.valueOf(contador_invitados));
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void cbx_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tituloActionPerformed

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
            java.util.logging.Logger.getLogger(frmAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAsistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<String> cbx_area;
    private javax.swing.JComboBox<String> cbx_especializacion;
    private javax.swing.JComboBox<String> cbx_importar_asitencia;
    private javax.swing.JComboBox<String> cbx_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_contador;
    private javax.swing.JLabel lbl_contador2;
    private javax.swing.JLabel lbl_contador3;
    private javax.swing.JTable tbl_asistencias;
    // End of variables declaration//GEN-END:variables
}
