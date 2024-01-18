
package Egresados;

import Capacitaciones.Metodos_capacitacion;
import Reportes.metodos_reportes;
import datos.DatosEgresados;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodoss;

public class frmMenuReportes extends javax.swing.JFrame {
    Metodos_capacitacion ejecutar= new Metodos_capacitacion();
    DatosEgresados datos = new DatosEgresados();
    Metodoss metodos = new Metodoss();
    //Capacitaciones
    metodos_reportes reporte= new metodos_reportes();
    DefaultTableModel modelo_capacitaciones = new DefaultTableModel();
    String[][] capacitaciones;
    int contador_capacitaciones=0;
    DefaultTableModel modelo_centro_labores = new DefaultTableModel();
    String[][] centro_labores;
    Object[] indice={"ID", "AREA", "ESPECIALIZACIÓN", "TÍTULO", "FECHA", "TURNO", "HORA", "MODALIDAD", "COSTO", "MENSAJE"};
    Object[] indice_labores={"ID", "AREA","ESPECIALIZACIÓN"};
    //
    //Botones
    boolean btn_egresado_activo=false;
    public frmMenuReportes() {
        initComponents();
        desactivar_capacitaciones();
        DefaultTableModel model = new DefaultTableModel();
        DefaultComboBoxModel<String> model5 = metodos.obtener_areas_trabajo();
        cbx_area.setModel(model5);
        cbx_area_labores.setModel(model5);
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
        
        
        modelo_capacitaciones.setColumnIdentifiers(indice);

        tbl_reporte_capacitaciones.setModel(modelo_capacitaciones);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(1).setPreferredWidth(170);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(2).setPreferredWidth(170);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(3).setPreferredWidth(370);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(5).setPreferredWidth(100);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(6).setPreferredWidth(100);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(7).setPreferredWidth(100);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(8).setPreferredWidth(100);
        tbl_reporte_capacitaciones.getColumnModel().getColumn(9).setPreferredWidth(400);
        
        modelo_centro_labores.setColumnIdentifiers(indice_labores);
        String[][] datos = metodos.mostrarEgresados();
        if (datos != null) {
            for (String[] row : datos) {
                model.addRow(row);
            }
        }
        
        capacitaciones =reporte.Capacitaciones();
        if (capacitaciones != null) {
            for (String[] FILA : capacitaciones) {
                modelo_capacitaciones.addRow(FILA);
            }
        }
        lbl_contador.setText(String.valueOf(capacitaciones.length));
    }
    private void desactivar_capacitaciones(){
        cbx_area.setEnabled(false);
        cbx_especializacion.setEnabled(false);
        btn_buscar.setEnabled(false);
        txt_codigo_egresado.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        materialTabbed2 = new tabbed.MaterialTabbed();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroDoc = new javax.swing.JTextField();
        jtxtcodigoE = new javax.swing.JTextField();
        jbtnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_reporte_capacitaciones = new javax.swing.JTable();
        cbx_area = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbx_especializacion = new javax.swing.JComboBox<>();
        btn_nuevabusqueda_capacitacion = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbl_contador = new javax.swing.JLabel();
        txt_codigo_egresado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_nuevabuqueda_egresados = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_reporte_labores = new javax.swing.JTable();
        btn_buscar_centro_labores = new javax.swing.JButton();
        cbx_area_labores = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1402, 720));
        setMinimumSize(new java.awt.Dimension(1402, 720));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        materialTabbed2.setBackground(new java.awt.Color(0, 0, 0));
        materialTabbed2.setForeground(new java.awt.Color(34, 47, 80));
        materialTabbed2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        materialTabbed2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 6, 106, 76));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_REPORTES.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 33, -1, -1));

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
        jPanel1.add(txtNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 380, 70));

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
        jPanel1.add(jtxtcodigoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 380, 70));

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
        jPanel1.add(jbtnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 341, 60));

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

        setPreferredSize(new Dimension(1280, 700));

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 1145, 452));

        materialTabbed2.addTab("GENERAL", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/REPORTE DE PERFILES.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)))
                .addContainerGap(641, Short.MAX_VALUE))
        );

        materialTabbed2.addTab("PERFILES", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/REPORTE DE CAPACITACIONES.png"))); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_reporte_capacitaciones.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        tbl_reporte_capacitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbl_reporte_capacitaciones);

        jScrollPane2.setViewportView(jScrollPane3);

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

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setText("ÁREA");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setText("ESPECIALIZACIÓN");

        cbx_especializacion.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_especializacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_especializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especializacionActionPerformed(evt);
            }
        });

        btn_nuevabusqueda_capacitacion.setBackground(new java.awt.Color(178, 255, 255));
        btn_nuevabusqueda_capacitacion.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_nuevabusqueda_capacitacion.setText("CAPACITACIONES");
        btn_nuevabusqueda_capacitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_nuevabusqueda_capacitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevabusqueda_capacitacionActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(255, 102, 102));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btnExportar.setBackground(new java.awt.Color(76, 128, 76));
        btnExportar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EXPORTAR.png"))); // NOI18N
        btnExportar.setText("EXPORTAR");
        btnExportar.setBorder(null);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel11.setText("CAPACITACIONES:");

        lbl_contador.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lbl_contador.setText("0");

        txt_codigo_egresado.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txt_codigo_egresado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_codigo_egresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_egresadoActionPerformed(evt);
            }
        });
        txt_codigo_egresado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigo_egresadoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel12.setText("ID EGRESADO");

        btn_nuevabuqueda_egresados.setBackground(new java.awt.Color(204, 255, 204));
        btn_nuevabuqueda_egresados.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_nuevabuqueda_egresados.setText("EGRESADOS");
        btn_nuevabuqueda_egresados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_nuevabuqueda_egresados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevabuqueda_egresadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(213, 213, 213)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbx_area, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbx_especializacion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txt_codigo_egresado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_nuevabuqueda_egresados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_nuevabusqueda_capacitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(lbl_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(469, 469, 469))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4)))
                        .addGap(31, 31, 31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_nuevabusqueda_capacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_area, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbx_especializacion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_codigo_egresado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_nuevabuqueda_egresados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        materialTabbed2.addTab("CAPACITACIONES", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tbl_reporte_labores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tbl_reporte_labores);

        jScrollPane4.setViewportView(jScrollPane5);

        btn_buscar_centro_labores.setBackground(new java.awt.Color(255, 102, 102));
        btn_buscar_centro_labores.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_buscar_centro_labores.setText("BUSCAR");
        btn_buscar_centro_labores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_buscar_centro_labores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_centro_laboresActionPerformed(evt);
            }
        });

        cbx_area_labores.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_area_labores.setToolTipText("");
        cbx_area_labores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbx_area_labores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbx_area_labores.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbx_area_labores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_area_laboresActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/REPORTE DE CENTRO DE LABORES.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(cbx_area_labores, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btn_buscar_centro_labores, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(0, 94, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_area_labores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_centro_labores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        materialTabbed2.addTab("C. LABORES", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(materialTabbed2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDocActionPerformed

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

    private void jtxtcodigoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcodigoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodigoEActionPerformed

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

    private void tblDatosComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblDatosComponentResized

    }//GEN-LAST:event_tblDatosComponentResized

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

    }//GEN-LAST:event_cbx_especializacionActionPerformed

    private void btn_nuevabusqueda_capacitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevabusqueda_capacitacionActionPerformed
        modelo_capacitaciones.setColumnIdentifiers(indice);
        tbl_reporte_capacitaciones.setModel(modelo_capacitaciones);
        btn_egresado_activo=false;
        cbx_area.setSelectedIndex(0);
        cbx_area.setEnabled(true);
        cbx_especializacion.setEnabled(false);
        txt_codigo_egresado.setText("");
        txt_codigo_egresado.setEnabled(false);
        modelo_capacitaciones.setRowCount(0);
        capacitaciones =reporte.Capacitaciones();
        if (capacitaciones != null) {
            for (String[] FILA : capacitaciones) {
                modelo_capacitaciones.addRow(FILA);
            }
        }
        lbl_contador.setText(String.valueOf(capacitaciones.length));
    }//GEN-LAST:event_btn_nuevabusqueda_capacitacionActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if(btn_egresado_activo){
            modelo_capacitaciones.setRowCount(0);
            String codigo=txt_codigo_egresado.getText();
            capacitaciones=reporte.mostrar_capacitaciones_egresado(codigo);
            if (capacitaciones != null) {
                for (String[] row : capacitaciones) {
                modelo_capacitaciones.addRow(row);
                }
            }
            tbl_reporte_capacitaciones.setModel(modelo_capacitaciones);
            contador_capacitaciones=capacitaciones.length;
            lbl_contador.setText(String.valueOf(contador_capacitaciones));
        }else{
        modelo_capacitaciones.setRowCount(0);
        String area=cbx_area.getSelectedItem().toString();
        String especializacion=cbx_especializacion.getSelectedItem().toString();
        capacitaciones = reporte.mostrar_capacitaciones(area, especializacion);
        if (capacitaciones != null) {
            for (String[] row : capacitaciones) {
                modelo_capacitaciones.addRow(row);
            }
        }
        tbl_reporte_capacitaciones.setModel(modelo_capacitaciones);
        contador_capacitaciones=capacitaciones.length;
        lbl_contador.setText(String.valueOf(contador_capacitaciones));
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        String rutaArchivo=reporte.obtenerRutaArchivo();
        if(rutaArchivo!=null){
        reporte.exportar_Excel(indice, capacitaciones, rutaArchivo);
        }else{
            JOptionPane.showMessageDialog(null, "Exportación cancelada");
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btn_buscar_centro_laboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_centro_laboresActionPerformed
        modelo_centro_labores.setRowCount(0);
        String area=cbx_area_labores.getSelectedItem().toString();
        centro_labores=reporte.mostrar_centros_de_labores(area);
        if (centro_labores != null) {
            for (String[] row : capacitaciones) {
                modelo_centro_labores.addRow(row);
            }
        }
        tbl_reporte_labores.setModel(modelo_centro_labores);
    }//GEN-LAST:event_btn_buscar_centro_laboresActionPerformed

    private void cbx_area_laboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_area_laboresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_area_laboresActionPerformed

    private void txt_codigo_egresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_egresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_egresadoActionPerformed

    private void txt_codigo_egresadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigo_egresadoKeyTyped
        char car = evt.getKeyChar();
        if(Character.isDigit(car)){
        }
        else{
            evt.consume();
        }

        if(jtxtcodigoE.getText().length() >= 10)
        {
            evt.consume();
            //SONIDO ERROR
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_codigo_egresadoKeyTyped

    private void btn_nuevabuqueda_egresadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevabuqueda_egresadosActionPerformed
        btn_egresado_activo=true;
        Object[] indice_egresados={"ID","AREA","ESPECIALIZACION", "TÍTULO", "FECHA", "HORA"};
        modelo_capacitaciones.setColumnIdentifiers(indice_egresados);
        modelo_capacitaciones.setRowCount(0);
        tbl_reporte_capacitaciones.setModel(modelo_capacitaciones);
        cbx_area.setSelectedIndex(0);
        cbx_area.setEnabled(false);
        cbx_especializacion.setEnabled(false);
        btn_buscar.setEnabled(true);
        txt_codigo_egresado.setText("");
        txt_codigo_egresado.setEnabled(true);
    }//GEN-LAST:event_btn_nuevabuqueda_egresadosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmMenuReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscar_centro_labores;
    private javax.swing.JButton btn_nuevabuqueda_egresados;
    private javax.swing.JButton btn_nuevabusqueda_capacitacion;
    private javax.swing.JComboBox<String> cbx_area;
    private javax.swing.JComboBox<String> cbx_area_labores;
    private javax.swing.JComboBox<String> cbx_especializacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbtnbuscar;
    private javax.swing.JTextField jtxtcodigoE;
    private javax.swing.JLabel lbl_contador;
    private tabbed.MaterialTabbed materialTabbed2;
    public javax.swing.JTable tblDatos;
    private javax.swing.JTable tbl_reporte_capacitaciones;
    private javax.swing.JTable tbl_reporte_labores;
    private javax.swing.JTextField txtNumeroDoc;
    private javax.swing.JTextField txt_codigo_egresado;
    // End of variables declaration//GEN-END:variables
}
