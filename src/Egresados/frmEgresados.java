
package Egresados;

import datos.DatosEgresados;
import javax.swing.JOptionPane;
import metodos.Metodoss;
public class frmEgresados extends javax.swing.JFrame {
    DatosEgresados datos = new DatosEgresados();
    Metodoss metodos= new Metodoss();

    public frmEgresados() {
        initComponents();
        setTitle("EGRESADOS");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnEditar = new javax.swing.JButton();
        jbtnnuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnguardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtxtNombres = new javax.swing.JTextField();
        jtxtApellidoP = new javax.swing.JTextField();
        jtxtApellidoM = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxFilial = new javax.swing.JComboBox<>();
        cbxEstadoTrabajo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroDoc = new javax.swing.JTextField();
        cbxTipoDoc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jtxtcodigoE = new javax.swing.JTextField();
        jbtnbuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtSemestreEgreso = new javax.swing.JTextField();
        txtAñoEgreso = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtResGrado = new javax.swing.JTextField();
        cbxEstadoGrado = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtResTitulo = new javax.swing.JTextField();
        cbxEstadoTitulo = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        txtTelefono3 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnEditar.setBackground(new java.awt.Color(204, 255, 255));
        jbtnEditar.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jbtnEditar.setText("EDITAR");
        jbtnEditar.setBorder(null);
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 640, 250, 75));

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
        jPanel1.add(jbtnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 249, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL2_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 340, 200));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, -1, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo1_2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, 160));

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
        jPanel1.add(jbtnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 250, 75));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombres.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jtxtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombres", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombresActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 80));

        jtxtApellidoP.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jtxtApellidoP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Apellido Paterno", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoPActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 280, 80));

        jtxtApellidoM.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jtxtApellidoM.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Apellido Materno", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoMActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 280, 80));

        txtCorreo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Correo Electrónico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 280, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Filial:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 80, 40));

        cbxFilial.setBackground(new java.awt.Color(255, 255, 250));
        cbxFilial.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxFilial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAMPUS LIMA NORTE", "CAMPUS LIMA ESTE", "CAMPUS CALLAO", "CAMPUS ATE" }));
        cbxFilial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(cbxFilial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, 50));

        cbxEstadoTrabajo.setBackground(new java.awt.Color(255, 255, 250));
        cbxEstadoTrabajo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxEstadoTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        cbxEstadoTrabajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(cbxEstadoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 120, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Trabaja:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 80, 40));

        txtNumeroDoc.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtNumeroDoc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nº Documento de identidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtNumeroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDocActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 300, 80));

        cbxTipoDoc.setBackground(new java.awt.Color(255, 255, 250));
        cbxTipoDoc.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CARNET EXT." }));
        cbxTipoDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(cbxTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 150, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel8.setText("Tipo de Documento:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 210, 40));

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
        jPanel2.add(jtxtcodigoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 80));

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
        jPanel2.add(jbtnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 230, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 600, 570));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSemestreEgreso.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtSemestreEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Semestre de egreso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtSemestreEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemestreEgresoActionPerformed(evt);
            }
        });
        jPanel3.add(txtSemestreEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 240, 80));

        txtAñoEgreso.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtAñoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Año de egreso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtAñoEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoEgresoActionPerformed(evt);
            }
        });
        jPanel3.add(txtAñoEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, 80));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 530, 120));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Tiene Grado:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 40));

        txtResGrado.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtResGrado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resolución Grado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtResGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResGradoActionPerformed(evt);
            }
        });
        jPanel5.add(txtResGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 300, 80));

        cbxEstadoGrado.setBackground(new java.awt.Color(255, 255, 250));
        cbxEstadoGrado.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxEstadoGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        cbxEstadoGrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(cbxEstadoGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 530, 120));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMinimumSize(new java.awt.Dimension(520, 110));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel10.setText("Tiene Título:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        txtResTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtResTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resolución Título", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtResTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResTituloActionPerformed(evt);
            }
        });
        jPanel4.add(txtResTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 280, 80));

        cbxEstadoTitulo.setBackground(new java.awt.Color(255, 255, 250));
        cbxEstadoTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxEstadoTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        cbxEstadoTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(cbxEstadoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 80, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 530, 120));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelefono3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTelefono3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "3.º Teléfono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtTelefono3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono3ActionPerformed(evt);
            }
        });
        jPanel6.add(txtTelefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 250, 70));

        txtTelefono2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTelefono2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "2.º Teléfono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono2ActionPerformed(evt);
            }
        });
        jPanel6.add(txtTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 250, 70));

        txtTelefono1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTelefono1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "1.º Teléfono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });
        jPanel6.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 70));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 530, 170));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtResGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResGradoActionPerformed

    private void txtNumeroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDocActionPerformed

    private void txtSemestreEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemestreEgresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemestreEgresoActionPerformed

    private void txtTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono2ActionPerformed

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1ActionPerformed

    private void txtResTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResTituloActionPerformed

    private void jtxtApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoPActionPerformed

    private void jtxtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoMActionPerformed

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
        String codigoUCV = jtxtcodigoE.getText();
        //VERIFICAR SI EL CODIGO DE ESTUDIANTE YA EXISTE EN LA DB
        //metodos.CompararCodigo(codigoUCV);
        String filial = cbxFilial.getSelectedItem().toString();
        String estTrabajo = cbxEstadoTrabajo.getSelectedItem().toString();
        String areaTrabajo = null;
        String apellidoP = jtxtApellidoP.getText();
        String apellidoM = jtxtApellidoM.getText();
        String nombres = jtxtNombres.getText();
        String correo = txtCorreo.getText();
        String tele1 = txtTelefono1.getText();
        String tele2 = txtTelefono2.getText();
        String tele3 = txtTelefono3.getText();
        String añoEgreso = txtAñoEgreso.getText();
        String semestreEgreso = txtSemestreEgreso.getText();
        String tipoDocIdenti = cbxTipoDoc.getSelectedItem().toString();
        String numDocIdenti = txtNumeroDoc.getText();
        String estGrado = cbxEstadoGrado.getSelectedItem().toString();
        String reGrado = txtResGrado.getText();
        String estTitulo = cbxEstadoTitulo.getSelectedItem().toString();
        String reTitulo = txtResTitulo.getText();

        //GUARDAR DATOS
        datos.setCodigoUCV(codigoUCV);
        datos.setFilial(filial);
        datos.setApellidoP(apellidoP);
        datos.setApellidoM(apellidoM);
        datos.setNombres(nombres);
        datos.setCorreo(correo);
        datos.setTele1(tele1);
        datos.setTele2(tele2);
        datos.setTele3(tele3);
        datos.setAñoEgreso(añoEgreso);
        datos.setSemestreEgreso(semestreEgreso);
        datos.setTipoDocIdenti(tipoDocIdenti);
        datos.setNumDocIdenti(numDocIdenti);
        datos.setEstGrado(estGrado);
        datos.setReGrado(reGrado);
        datos.setEstTitulo(estTitulo);
        datos.setReTitulo(reTitulo);
        datos.setEstTrabajo(estTrabajo);
        datos.setAreaTrabajo(areaTrabajo);
        
        metodos.guardarEgresado(datos);
        
        //Hacemos que no se pueda editar ningun txt 
        jtxtcodigoE.setEnabled(false);
        jtxtApellidoP.setEnabled(false);
        jtxtApellidoM.setEnabled(false);
        jtxtNombres.setEnabled(false);
        txtAñoEgreso.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtNumeroDoc.setEnabled(false);
        txtResGrado.setEnabled(false);
        txtResTitulo.setEnabled(false);
        txtSemestreEgreso.setEnabled(false);
        txtTelefono1.setEnabled(false);
        txtTelefono2.setEnabled(false);
        txtTelefono3.setEnabled(false);
        
        //Hacemos que no se edite ningun cbx
        cbxEstadoGrado.setEnabled(false);
        cbxEstadoTitulo.setEnabled(false);
        cbxEstadoTrabajo.setEnabled(false);
        cbxFilial.setEnabled(false);
        cbxTipoDoc.setEnabled(false);
    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void txtTelefono3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono3ActionPerformed

    private void jtxtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombresActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void jbtnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnuevoActionPerformed

        //VACIAR LOS TEXT FIELD 
        jtxtcodigoE.setText("");
        jtxtApellidoM.setText("");
        jtxtApellidoP.setText("");
        jtxtNombres.setText("");
        txtCorreo.setText("");
        txtNumeroDoc.setText("");
        txtAñoEgreso.setText("");
        txtSemestreEgreso.setText("");
        txtResTitulo.setText("");
        txtResGrado.setText("");
        txtTelefono1.setText("");
        txtTelefono2.setText("");
        txtTelefono3.setText("");
        //y reiniciar los combobox
        cbxEstadoTrabajo.setSelectedIndex(0);
        cbxTipoDoc.setSelectedIndex(0);
        cbxFilial.setSelectedIndex(0);
        cbxEstadoTitulo.setSelectedIndex(0);
        cbxEstadoGrado.setSelectedIndex(0);
        metodos.conector();
        //Hacemos que  se pueda editar los txt 
        jtxtcodigoE.setEnabled(true);
        jtxtApellidoP.setEnabled(true);
        jtxtApellidoM.setEnabled(true);
        jtxtNombres.setEnabled(true);
        txtAñoEgreso.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtNumeroDoc.setEnabled(true);
        txtResGrado.setEnabled(true);
        txtResTitulo.setEnabled(true);
        txtSemestreEgreso.setEnabled(true);
        txtTelefono1.setEnabled(true);
        txtTelefono2.setEnabled(true);
        txtTelefono3.setEnabled(true);
        //Hacemos que se edite los cbx
        cbxEstadoGrado.setEnabled(true);
        cbxEstadoTitulo.setEnabled(true);
        cbxEstadoTrabajo.setEnabled(true);
        cbxFilial.setEnabled(true);
        cbxTipoDoc.setEnabled(true);
    }//GEN-LAST:event_jbtnnuevoActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        txtResTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DNI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        //Hacemos que  se pueda editar los txt 
        jtxtcodigoE.setEnabled(true);
        jtxtApellidoP.setEnabled(true);
        jtxtApellidoM.setEnabled(true);
        jtxtNombres.setEnabled(true);
        txtAñoEgreso.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtNumeroDoc.setEnabled(true);
        txtResGrado.setEnabled(true);
        txtResTitulo.setEnabled(true);
        txtSemestreEgreso.setEnabled(true);
        txtTelefono1.setEnabled(true);
        txtTelefono2.setEnabled(true);
        txtTelefono3.setEnabled(true);
        //Hacemos que se edite los cbx
        cbxEstadoGrado.setEnabled(true);
        cbxEstadoTitulo.setEnabled(true);
        cbxEstadoTrabajo.setEnabled(true);
        cbxFilial.setEnabled(true);
        cbxTipoDoc.setEnabled(true);
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbuscarActionPerformed
        
    }//GEN-LAST:event_jbtnbuscarActionPerformed

    private void txtAñoEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoEgresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoEgresoActionPerformed

    private void jtxtcodigoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcodigoEKeyTyped
        char car = evt.getKeyChar();
        if(Character.isDigit(car)){
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_jtxtcodigoEKeyTyped

    private void jtxtcodigoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcodigoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodigoEActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEgresados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxEstadoGrado;
    private javax.swing.JComboBox<String> cbxEstadoTitulo;
    private javax.swing.JComboBox<String> cbxEstadoTrabajo;
    private javax.swing.JComboBox<String> cbxFilial;
    private javax.swing.JComboBox<String> cbxTipoDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnbuscar;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JButton jbtnnuevo;
    private javax.swing.JTextField jtxtApellidoM;
    private javax.swing.JTextField jtxtApellidoP;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtcodigoE;
    private javax.swing.JTextField txtAñoEgreso;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNumeroDoc;
    private javax.swing.JTextField txtResGrado;
    private javax.swing.JTextField txtResTitulo;
    private javax.swing.JTextField txtSemestreEgreso;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JTextField txtTelefono3;
    // End of variables declaration//GEN-END:variables
}