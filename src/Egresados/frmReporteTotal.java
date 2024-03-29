/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Egresados;

import Capacitaciones.Metodos_capacitacion;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodoss;

/**
 *
 * @author anton
 */
public class frmReporteTotal extends javax.swing.JFrame {
    SimpleDateFormat formato_fecha = new SimpleDateFormat("yyyy-MM-dd");
    Metodoss m = new Metodoss();
    Metodos_capacitacion ejecutar= new Metodos_capacitacion();
    DefaultTableModel modelo_capacitaciones = new DefaultTableModel();
    Object[] indice={"Nombre Completo", "Num 1", "Num 2","Num 3"};
    String[][] egresados;
    
    public frmReporteTotal() {
        initComponents();
        llenarCombobox();
        modelo_capacitaciones.setColumnIdentifiers(indice);
        
        tbl_egresados.setModel(modelo_capacitaciones);

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
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbx_C_consulta = new javax.swing.JComboBox<>();
        cbx_area = new javax.swing.JComboBox<>();
        cbx_especializacion = new javax.swing.JComboBox<>();
        lbl_cAsistencias_CAPA = new javax.swing.JLabel();
        jdc_FechaFin = new com.toedter.calendar.JDateChooser();
        jdc_FechaInicio = new com.toedter.calendar.JDateChooser();
        btn_BuscarCapa = new javax.swing.JButton();
        lbl_id_CAPA = new javax.swing.JLabel();
        lbl_NOMBRE_CAPA = new javax.swing.JLabel();
        lbl_MONTO_CAPA = new javax.swing.JLabel();
        lbl_cInvitaciones_CAPA = new javax.swing.JLabel();
        lbl_MODALIDAD_CAPA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ckx_especialidad = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_pAsistencias_CAPA = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_numInvi_egre = new javax.swing.JLabel();
        btn_BuscarEgre = new javax.swing.JButton();
        lbl_NOMBRE_Egre = new javax.swing.JLabel();
        lbl_num_egre = new javax.swing.JLabel();
        lbl_noA_egre = new javax.swing.JLabel();
        lbl_p_asistencias_egre = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtxt_CodigoE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_num_Asis_egre = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_BuscarEgre1 = new javax.swing.JButton();
        cbx_area2 = new javax.swing.JComboBox<>();
        cbx_especializacion2 = new javax.swing.JComboBox<>();
        cbx_titulo2 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btn_BuscarEgre2 = new javax.swing.JButton();
        cbx_E_consulta2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_egresados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CAPACITACIONES"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("FECHA INICIO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        cbx_C_consulta.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbx_C_consulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "% ASISTENCIAS MAYOR", "% ASISTENCIAS MENOR" }));
        cbx_C_consulta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_C_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_C_consultaActionPerformed(evt);
            }
        });
        jPanel2.add(cbx_C_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 210, 50));

        cbx_area.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_area.setToolTipText("");
        cbx_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbx_area.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbx_area.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbx_area.setEnabled(false);
        cbx_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_areaActionPerformed(evt);
            }
        });
        jPanel2.add(cbx_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 180, 50));

        cbx_especializacion.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_especializacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_especializacion.setEnabled(false);
        cbx_especializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especializacionActionPerformed(evt);
            }
        });
        jPanel2.add(cbx_especializacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 180, 50));

        lbl_cAsistencias_CAPA.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel2.add(lbl_cAsistencias_CAPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 70, 20));

        jdc_FechaFin.setBackground(new java.awt.Color(255, 255, 255));
        jdc_FechaFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdc_FechaFin.setDateFormatString("yyyy-MM-dd");
        jdc_FechaFin.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jPanel2.add(jdc_FechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 160, 50));

        jdc_FechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        jdc_FechaInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdc_FechaInicio.setDateFormatString("yyyy-MM-dd");
        jdc_FechaInicio.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jPanel2.add(jdc_FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 50));

        btn_BuscarCapa.setBackground(new java.awt.Color(255, 51, 51));
        btn_BuscarCapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_BuscarCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarCapaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_BuscarCapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 50, 50));

        lbl_id_CAPA.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel2.add(lbl_id_CAPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 70, 20));

        lbl_NOMBRE_CAPA.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel2.add(lbl_NOMBRE_CAPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 220, 20));

        lbl_MONTO_CAPA.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel2.add(lbl_MONTO_CAPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, 20));

        lbl_cInvitaciones_CAPA.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel2.add(lbl_cInvitaciones_CAPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 70, 20));

        lbl_MODALIDAD_CAPA.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel2.add(lbl_MODALIDAD_CAPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 70, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setText("% Asistencias:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setText("ID:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setText("Nombre:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Costo:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setText("Modalidad:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setText("C. Invitados:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        ckx_especialidad.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ckx_especialidad.setText("ESPECIALIDAD");
        ckx_especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckx_especialidadActionPerformed(evt);
            }
        });
        jPanel2.add(ckx_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel5.setText("FECHA FIN:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setText("C. Asistentes:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        lbl_pAsistencias_CAPA.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel2.add(lbl_pAsistencias_CAPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 210, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 610, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EGRESADO"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_numInvi_egre.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel3.add(lbl_numInvi_egre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 70, 20));

        btn_BuscarEgre.setBackground(new java.awt.Color(255, 51, 51));
        btn_BuscarEgre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_BuscarEgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarEgreActionPerformed(evt);
            }
        });
        jPanel3.add(btn_BuscarEgre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 170, 50));

        lbl_NOMBRE_Egre.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jPanel3.add(lbl_NOMBRE_Egre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 220, 20));

        lbl_num_egre.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel3.add(lbl_num_egre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 300, 20));

        lbl_noA_egre.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel3.add(lbl_noA_egre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 70, 20));

        lbl_p_asistencias_egre.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel3.add(lbl_p_asistencias_egre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 70, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setText("# de invitaciones:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setText("Nombre:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel15.setText("Número(s):");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel16.setText("# de asistencias:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel17.setText("% de C y no asistencias:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jtxt_CodigoE.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel3.add(jtxt_CodigoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, 50));

        jLabel1.setText("CÓDIGO DEL EGRESADO:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel18.setText("% de asistencias:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lbl_num_Asis_egre.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel3.add(lbl_num_Asis_egre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 170, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 600, 250));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CAPACITACION"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_BuscarEgre1.setBackground(new java.awt.Color(255, 51, 51));
        btn_BuscarEgre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_BuscarEgre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarEgre1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_BuscarEgre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 180, 50));

        cbx_area2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_area2.setToolTipText("");
        cbx_area2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbx_area2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbx_area2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbx_area2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_area2ActionPerformed(evt);
            }
        });
        jPanel4.add(cbx_area2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 50));

        cbx_especializacion2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_especializacion2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_especializacion2.setEnabled(false);
        cbx_especializacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especializacion2ActionPerformed(evt);
            }
        });
        jPanel4.add(cbx_especializacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 180, 50));

        cbx_titulo2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_titulo2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_titulo2.setEnabled(false);
        cbx_titulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_titulo2ActionPerformed(evt);
            }
        });
        jPanel4.add(cbx_titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 180, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 610, 280));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EGRESADO"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_BuscarEgre2.setBackground(new java.awt.Color(255, 51, 51));
        btn_BuscarEgre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_BuscarEgre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarEgre2ActionPerformed(evt);
            }
        });
        jPanel5.add(btn_BuscarEgre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 170, 50));

        cbx_E_consulta2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbx_E_consulta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Comprometidos pero no asistieron", "Nunca fueron a una capacitación", "Asistieron pero poco satisfechos" }));
        cbx_E_consulta2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_E_consulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_E_consulta2ActionPerformed(evt);
            }
        });
        jPanel5.add(cbx_E_consulta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 280, 50));

        tbl_egresados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_egresados);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 550, 190));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 590, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1279, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_areaActionPerformed
        DefaultComboBoxModel<String> modelo;
        String Texto_Seleccionado = cbx_area.getSelectedItem().toString();
        int area=cbx_area.getSelectedIndex();
        if(area==0){
            modelo= new DefaultComboBoxModel<>();
            cbx_especializacion.setModel(modelo);
            cbx_especializacion.setEnabled(false);
        }else{
            int id=m.obtener_id_Area_trabajo(Texto_Seleccionado);
            modelo = ejecutar.obtener_especializaciones(id);
            cbx_especializacion.setModel(modelo);
            cbx_especializacion.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_areaActionPerformed

    private void cbx_especializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especializacionActionPerformed
//        DefaultComboBoxModel<String> modelo;
//        if(btnCrearActivo){
//            modelo=new DefaultComboBoxModel<>(new String[]{""});
//            cbx_titulo.setEnabled(false);
//        }else {
//            String especializacion_Seleccionada = cbx_especializacion.getSelectedItem().toString();
//            String area_seleccionada=cbx_area.getSelectedItem().toString();
//            modelo = ejecutar.obtener_Titulos(area_seleccionada, especializacion_Seleccionada);
//            cbx_titulo.setModel(modelo);
//            cbx_titulo.setEnabled(true);
//        }
    }//GEN-LAST:event_cbx_especializacionActionPerformed

    private void cbx_C_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_C_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_C_consultaActionPerformed

    private void btn_BuscarCapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarCapaActionPerformed
        String Fecha_I=formato_fecha.format(jdc_FechaInicio.getDate());
        String Fecha_F=formato_fecha.format(jdc_FechaFin.getDate());
        
        String[] detalles_capa = new String[7];
        
        int num = cbx_C_consulta.getSelectedIndex();
        
        if (ckx_especialidad.isSelected()) {
            String area = cbx_area.getSelectedItem().toString();
            String espe = cbx_especializacion.getSelectedItem().toString();
            if(area!=null){
                if(espe!=null){
                    if (num==0){
                    detalles_capa = m.CapaMayorAsistEspe(Fecha_I, Fecha_F, area, espe);
                    lbl_id_CAPA.setText(detalles_capa[0]);
                    lbl_NOMBRE_CAPA.setText(detalles_capa[1]);
                    lbl_MONTO_CAPA.setText(detalles_capa[2]);
                    lbl_cInvitaciones_CAPA.setText(detalles_capa[4]);
                    lbl_MODALIDAD_CAPA.setText(detalles_capa[3]);
                    lbl_cAsistencias_CAPA.setText(detalles_capa[5]);
                    lbl_pAsistencias_CAPA.setText("% "+detalles_capa[6]);
                    }
                    else if(num==1){
                        detalles_capa = m.CapaMenorAsistEspe(Fecha_I, Fecha_F, area, espe);
                        lbl_id_CAPA.setText(detalles_capa[0]);
                        lbl_NOMBRE_CAPA.setText(detalles_capa[1]);
                        lbl_MONTO_CAPA.setText(detalles_capa[2]);
                        lbl_cInvitaciones_CAPA.setText(detalles_capa[4]);
                        lbl_MODALIDAD_CAPA.setText(detalles_capa[3]);
                        lbl_cAsistencias_CAPA.setText(detalles_capa[5]);
                        lbl_pAsistencias_CAPA.setText("% "+detalles_capa[6]);
                        
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Seleccione una especialización.", "Error", JOptionPane.WARNING_MESSAGE);
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Seleccione una área.", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
        }
        else{
            if (num==0){
                detalles_capa = m.CapaMayorAsist(Fecha_I, Fecha_F);
                lbl_id_CAPA.setText(detalles_capa[0]);
                lbl_NOMBRE_CAPA.setText(detalles_capa[1]);
                lbl_MONTO_CAPA.setText(detalles_capa[2]);
                lbl_cInvitaciones_CAPA.setText(detalles_capa[4]);
                lbl_MODALIDAD_CAPA.setText(detalles_capa[3]);
                lbl_cAsistencias_CAPA.setText(detalles_capa[5]);
                lbl_pAsistencias_CAPA.setText("% "+detalles_capa[6]);
            }
            else if(num==1){
                detalles_capa = m.CapaMenorAsist(Fecha_I, Fecha_F);
                lbl_id_CAPA.setText(detalles_capa[0]);
                lbl_NOMBRE_CAPA.setText(detalles_capa[1]);
                lbl_MONTO_CAPA.setText(detalles_capa[2]);
                lbl_cInvitaciones_CAPA.setText(detalles_capa[4]);
                lbl_MODALIDAD_CAPA.setText(detalles_capa[3]);
                lbl_cAsistencias_CAPA.setText(detalles_capa[5]);
                lbl_pAsistencias_CAPA.setText("% "+detalles_capa[6]);
            }
        }
    }//GEN-LAST:event_btn_BuscarCapaActionPerformed

    private void ckx_especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckx_especialidadActionPerformed
        if (ckx_especialidad.isSelected()) {
            cbx_area.setEnabled(true);
        }
        else if(ckx_especialidad.isSelected()==false){
            cbx_area.setEnabled(false);
            cbx_especializacion.setEnabled(false);
        }
    }//GEN-LAST:event_ckx_especialidadActionPerformed

    private void btn_BuscarEgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarEgreActionPerformed
        String codEgre = jtxt_CodigoE.getText();
        String[] detalles = new String[8];
        if (codEgre!=null){
            detalles = m.ConsultaTotalEgre(codEgre);
            lbl_NOMBRE_Egre.setText(detalles[0]);
            lbl_num_egre.setText(detalles[1] + " | " + detalles[2] + " | " + detalles[3]);
            lbl_num_Asis_egre.setText(detalles[4]);
            lbl_p_asistencias_egre.setText("% "+detalles[5]);
            lbl_noA_egre.setText("% "+detalles[6]);
            lbl_numInvi_egre.setText(detalles[7]);
        }
    }//GEN-LAST:event_btn_BuscarEgreActionPerformed

    private void btn_BuscarEgre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarEgre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarEgre1ActionPerformed

    private void cbx_area2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_area2ActionPerformed
        DefaultComboBoxModel<String> modelo;
        String Texto_Seleccionado = cbx_area2.getSelectedItem().toString();
        int area=cbx_area2.getSelectedIndex();
        if(area==0){
            modelo= new DefaultComboBoxModel<>();
            cbx_especializacion2.setModel(modelo);
            cbx_especializacion2.setEnabled(false);
        }else{
            int id=m.obtener_id_Area_trabajo(Texto_Seleccionado);
            modelo = ejecutar.obtener_especializaciones(id);
            cbx_especializacion2.setModel(modelo);
            cbx_especializacion2.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_area2ActionPerformed

    private void cbx_especializacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especializacion2ActionPerformed
        DefaultComboBoxModel<String> modelo;
            String especializacion_Seleccionada = cbx_especializacion2.getSelectedItem().toString();
            String area_seleccionada=cbx_area2.getSelectedItem().toString();
            modelo = ejecutar.obtener_Titulos(area_seleccionada, especializacion_Seleccionada);
            cbx_titulo2.setModel(modelo);
            cbx_titulo2.setEnabled(true);
        
    }//GEN-LAST:event_cbx_especializacion2ActionPerformed

    private void cbx_titulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_titulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_titulo2ActionPerformed

    private void btn_BuscarEgre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarEgre2ActionPerformed
        int num = cbx_E_consulta2.getSelectedIndex();
        if (num != 0) {
            if (num == 1) {
                modelo_capacitaciones.setRowCount(0);
                egresados = m.mostrar_C_noFueron();
                if (egresados != null) {
                    for (String[] row : egresados) {
                        modelo_capacitaciones.addRow(new Object[]{row[0], row[1], row[2]});
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron egresados", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            else if(num == 2){
                modelo_capacitaciones.setRowCount(0);
                egresados = m.Egre_nunca_fueron();
                if (egresados != null) {
                    for (String[] row : egresados) {
                        modelo_capacitaciones.addRow(new Object[]{row[0], row[1], row[2]});
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron egresados", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btn_BuscarEgre2ActionPerformed

    private void cbx_E_consulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_E_consulta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_E_consulta2ActionPerformed
    
    private void llenarCombobox() {
        DefaultComboBoxModel<String> model = m.obtener_areas_trabajo();
        cbx_area.setModel(model);
        DefaultComboBoxModel<String> model2 = m.obtener_areas_trabajo();
        cbx_area2.setModel(model2);
    }
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
            java.util.logging.Logger.getLogger(frmReporteTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReporteTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReporteTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReporteTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReporteTotal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BuscarCapa;
    private javax.swing.JButton btn_BuscarEgre;
    private javax.swing.JButton btn_BuscarEgre1;
    private javax.swing.JButton btn_BuscarEgre2;
    private javax.swing.JComboBox<String> cbx_C_consulta;
    private javax.swing.JComboBox<String> cbx_E_consulta2;
    private javax.swing.JComboBox<String> cbx_area;
    private javax.swing.JComboBox<String> cbx_area2;
    private javax.swing.JComboBox<String> cbx_especializacion;
    private javax.swing.JComboBox<String> cbx_especializacion2;
    private javax.swing.JComboBox<String> cbx_titulo2;
    private javax.swing.JCheckBox ckx_especialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc_FechaFin;
    private com.toedter.calendar.JDateChooser jdc_FechaInicio;
    private javax.swing.JTextField jtxt_CodigoE;
    private javax.swing.JLabel lbl_MODALIDAD_CAPA;
    private javax.swing.JLabel lbl_MONTO_CAPA;
    private javax.swing.JLabel lbl_NOMBRE_CAPA;
    private javax.swing.JLabel lbl_NOMBRE_Egre;
    private javax.swing.JLabel lbl_cAsistencias_CAPA;
    private javax.swing.JLabel lbl_cInvitaciones_CAPA;
    private javax.swing.JLabel lbl_id_CAPA;
    private javax.swing.JLabel lbl_noA_egre;
    private javax.swing.JLabel lbl_numInvi_egre;
    private javax.swing.JLabel lbl_num_Asis_egre;
    private javax.swing.JLabel lbl_num_egre;
    private javax.swing.JLabel lbl_pAsistencias_CAPA;
    private javax.swing.JLabel lbl_p_asistencias_egre;
    private javax.swing.JTable tbl_egresados;
    // End of variables declaration//GEN-END:variables
}
