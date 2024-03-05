package Egresados;

import Capacitaciones.Metodos_capacitacion;
import Excel.BD_Excel;
import datos.DatosEgresados;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import metodos.Metodoss;
import metodos.Excepciones;

public class frmEgresados extends javax.swing.JFrame {
    DatosEgresados datos = new DatosEgresados();
    Metodoss metodos= new Metodoss();
    Excepciones excepcion = new Excepciones();
    Metodos_capacitacion ejecutar= new Metodos_capacitacion();
    boolean btnCrearActivo=false;
    public frmEgresados() {
        initComponents();
        DefaultComboBoxModel<String> model5 = metodos.obtener_areas_trabajo();
        cbxarea_trabajo.setModel(model5);
        setTitle("EGRESADOS");
        llenarCombobox();
        jscpegresados.getVerticalScrollBar().setUnitIncrement(16);
        setSize(1230, 750);  // Establece el tamaño inicial del formulario
        setLocationRelativeTo(null);  
        noeditar();
    }
    
    //BLOQUEAR TODO
    public void noeditar(){
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
            cbxOpe1.setEnabled(false);
            cbxOpe2.setEnabled(false);
            cbxOpe3.setEnabled(false);
            cbxarea_trabajo.setEnabled(false);
            cbx_especializacion.setEnabled(false);
    }
    
    //DESBLOQUEAR TODO
    public void editar(){
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
        cbxOpe1.setEnabled(true);
        cbxOpe2.setEnabled(true);
        cbxOpe3.setEnabled(true);
        cbxarea_trabajo.setEnabled(true);
    }
    //LIMPIAR TODO
    public void limpiar(){
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
        cbxOpe1.setSelectedIndex(0);
        cbxOpe2.setSelectedIndex(0);
        cbxOpe3.setSelectedIndex(0);
        cbxarea_trabajo.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jscpegresados = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtxtNombres = new javax.swing.JTextField();
        jtxtApellidoP = new javax.swing.JTextField();
        jtxtApellidoM = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxFilial = new javax.swing.JComboBox<>();
        cbxEstadoTrabajo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxTipoDoc = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbxarea_trabajo = new javax.swing.JComboBox<>();
        cbx_especializacion = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtNumeroDoc = new javax.swing.JTextField();
        jbtnbuscar = new javax.swing.JButton();
        jtxtcodigoE = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbxEstadoTitulo = new javax.swing.JComboBox<>();
        txtResTitulo = new javax.swing.JTextField();
        jbtnEditar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtSemestreEgreso = new javax.swing.JTextField();
        txtAñoEgreso = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbxEstadoGrado = new javax.swing.JComboBox<>();
        txtResGrado = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txtTelefono1 = new javax.swing.JTextField();
        cbxOpe1 = new javax.swing.JComboBox<>();
        txtTelefono2 = new javax.swing.JTextField();
        cbxOpe2 = new javax.swing.JComboBox<>();
        txtTelefono3 = new javax.swing.JTextField();
        cbxOpe3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jbtnnuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtnguardar = new javax.swing.JButton();
        jbtnnuevabusqueda = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnImportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jscpegresados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 70));

        jtxtApellidoP.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jtxtApellidoP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Apellido Paterno", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoPActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 280, 70));

        jtxtApellidoM.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jtxtApellidoM.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Apellido Materno", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jtxtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoMActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, 70));

        txtCorreo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Correo Electrónico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 280, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Filial:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 40));

        cbxFilial.setBackground(new java.awt.Color(255, 255, 250));
        cbxFilial.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxFilial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFilialActionPerformed(evt);
            }
        });
        jPanel2.add(cbxFilial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, 50));

        cbxEstadoTrabajo.setBackground(new java.awt.Color(255, 255, 250));
        cbxEstadoTrabajo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxEstadoTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));
        cbxEstadoTrabajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(cbxEstadoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 70, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Trabaja:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 80, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel8.setText("Tipo de Documento:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, 40));

        cbxTipoDoc.setBackground(new java.awt.Color(255, 255, 250));
        cbxTipoDoc.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CARNET EXT." }));
        cbxTipoDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(cbxTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 150, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel11.setText("Especialización");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 210, 40));

        cbxarea_trabajo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxarea_trabajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxarea_trabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxarea_trabajoActionPerformed(evt);
            }
        });
        jPanel2.add(cbxarea_trabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 240, 50));

        cbx_especializacion.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbx_especializacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbx_especializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especializacionActionPerformed(evt);
            }
        });
        jPanel2.add(cbx_especializacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 240, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel12.setText("Area de trabajo");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 210, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 600, 490));

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
        jPanel1.add(txtNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 340, 80));

        jbtnbuscar.setBackground(new java.awt.Color(255, 102, 102));
        jbtnbuscar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jbtnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtnbuscar.setText("BUSCAR");
        jbtnbuscar.setBorder(null);
        jbtnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 230, 80));

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
        jPanel1.add(jtxtcodigoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 290, 80));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMinimumSize(new java.awt.Dimension(520, 110));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel10.setText("Tiene Título:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        cbxEstadoTitulo.setBackground(new java.awt.Color(255, 255, 250));
        cbxEstadoTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxEstadoTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));
        cbxEstadoTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(cbxEstadoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 80, 40));

        txtResTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtResTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resolución Título", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtResTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResTituloActionPerformed(evt);
            }
        });
        jPanel4.add(txtResTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 320, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 510, 150));

        jbtnEditar.setBackground(new java.awt.Color(204, 255, 255));
        jbtnEditar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EDITAR.png"))); // NOI18N
        jbtnEditar.setText("EDITAR");
        jbtnEditar.setBorder(null);
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 850, 250, 75));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_EGRESADOS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL2_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 880, 340, 200));

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
        txtSemestreEgreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemestreEgresoKeyTyped(evt);
            }
        });
        jPanel3.add(txtSemestreEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 280, 80));

        txtAñoEgreso.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtAñoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Año de egreso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtAñoEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoEgresoActionPerformed(evt);
            }
        });
        txtAñoEgreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoEgresoKeyTyped(evt);
            }
        });
        jPanel3.add(txtAñoEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 80));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 600, 120));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Tiene Grado:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        cbxEstadoGrado.setBackground(new java.awt.Color(255, 255, 250));
        cbxEstadoGrado.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxEstadoGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));
        cbxEstadoGrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(cbxEstadoGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 80, 50));

        txtResGrado.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtResGrado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resolución Grado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtResGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResGradoActionPerformed(evt);
            }
        });
        jPanel5.add(txtResGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 320, 80));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 510, 140));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelefono1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTelefono1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "1.º Teléfono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });
        txtTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono1KeyTyped(evt);
            }
        });
        jPanel6.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 70));

        cbxOpe1.setBackground(new java.awt.Color(255, 255, 250));
        cbxOpe1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxOpe1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(cbxOpe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 140, 60));

        txtTelefono2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTelefono2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "2.º Teléfono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono2ActionPerformed(evt);
            }
        });
        txtTelefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono2KeyTyped(evt);
            }
        });
        jPanel6.add(txtTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 70));

        cbxOpe2.setBackground(new java.awt.Color(255, 255, 250));
        cbxOpe2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxOpe2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxOpe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOpe2ActionPerformed(evt);
            }
        });
        jPanel6.add(cbxOpe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 140, 60));

        txtTelefono3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTelefono3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "3.º Teléfono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        txtTelefono3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono3ActionPerformed(evt);
            }
        });
        txtTelefono3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono3KeyTyped(evt);
            }
        });
        jPanel6.add(txtTelefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 250, 70));

        cbxOpe3.setBackground(new java.awt.Color(255, 255, 250));
        cbxOpe3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbxOpe3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(cbxOpe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 140, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 510, 300));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 120, 70));

        jbtnnuevo.setBackground(new java.awt.Color(204, 255, 255));
        jbtnnuevo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jbtnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jbtnnuevo.setText("NUEVO EGRESADO");
        jbtnnuevo.setBorder(null);
        jbtnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 850, 249, 75));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo1_2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 900, -1, 160));

        jbtnguardar.setBackground(new java.awt.Color(204, 255, 255));
        jbtnguardar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jbtnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jbtnguardar.setText("GUARDAR");
        jbtnguardar.setBorder(null);
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 850, 250, 75));

        jbtnnuevabusqueda.setBackground(new java.awt.Color(255, 102, 102));
        jbtnnuevabusqueda.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jbtnnuevabusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtnnuevabusqueda.setText("NUEVA BUSQUEDA");
        jbtnnuevabusqueda.setBorder(null);
        jbtnnuevabusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnuevabusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnnuevabusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 230, 80));

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
        jPanel1.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 950, 250, 75));

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
        jPanel1.add(btnImportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 950, 250, 75));

        jscpegresados.setViewportView(jPanel1);

        getContentPane().add(jscpegresados, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombresActionPerformed

    private void jtxtApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoPActionPerformed

    private void jtxtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoMActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNumeroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDocActionPerformed

    private void txtNumeroDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDocKeyTyped
        //SOLO NÚMEROS
        char car = evt.getKeyChar();
        if(Character.isDigit(car)){
        }
        else{
            evt.consume();
        }

        if(txtNumeroDoc.getText().length() >= 8)
        {
            evt.consume();
            //SONIDO ERROR
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNumeroDocKeyTyped

    private void jbtnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbuscarActionPerformed
        //traemos el codigo a buscar
        String codigo= jtxtcodigoE.getText();
        String numeroDocIdenti =  txtNumeroDoc.getText();
        //Verificamos que ingresaran datos correctos
        String verificar=excepcion.exceptosBUSCAR(codigo,numeroDocIdenti);
        //Si son correctos se ejecuta
        if(verificar.equals("")){
            if (numeroDocIdenti.equals("")){
                //instancia de la clase datos para guardar lo obtenido
                DatosEgresados datosencontrados = new DatosEgresados();
                //traer al metodo :D
                metodos.buscarPorCodigo(codigo, numeroDocIdenti,datosencontrados);
                if (datosencontrados.getReGrado() != null){
                    //colocar en el formulario lo encontrado
                    cbxFilial.setSelectedItem(metodos.obtenerNombreFILIAL(datosencontrados.getFilial()));
                    cbxEstadoTrabajo.setSelectedItem(datosencontrados.getEstTrabajo());
                    jtxtcodigoE.setText(datosencontrados.getCodigoUCV());
                    jtxtApellidoP.setText(datosencontrados.getApellidoP());
                    jtxtApellidoM.setText(datosencontrados.getApellidoM());
                    jtxtNombres.setText(datosencontrados.getNombres());
                    txtCorreo.setText(datosencontrados.getCorreo());
                    txtTelefono1.setText(datosencontrados.getTele1());
                    cbxOpe1.setSelectedItem(metodos.obtenerNombreOPERADOR(datosencontrados.getOperador1()));
                    txtTelefono2.setText(datosencontrados.getTele2());
                    cbxOpe2.setSelectedItem(metodos.obtenerNombreOPERADOR(datosencontrados.getOperador2()));
                    txtTelefono3.setText(datosencontrados.getTele3());
                    cbxOpe3.setSelectedItem(metodos.obtenerNombreOPERADOR(datosencontrados.getOperador3()));
                    txtAñoEgreso.setText(datosencontrados.getAñoEgreso());
                    txtSemestreEgreso.setText(datosencontrados.getSemestreEgreso());
                    cbxTipoDoc.setSelectedItem(datosencontrados.getTipoDocIdenti());
                    txtNumeroDoc.setText(datosencontrados.getNumDocIdenti());
                    cbxEstadoGrado.setSelectedItem(datosencontrados.getEstGrado());
                    txtResGrado.setText(datosencontrados.getReGrado());
                    cbxEstadoTitulo.setSelectedItem(datosencontrados.getEstTitulo());
                    txtResTitulo.setText(datosencontrados.getReTitulo());
                    cbxarea_trabajo.setSelectedItem(metodos.obtener_nombre_area(datosencontrados.getAreaTrabajo()));
                    cbx_especializacion.setSelectedItem(metodos.obtener_nombre_especializacion(datosencontrados.getEspecializacion()));
                    noeditar();
                }
            }
            else {
                //instancia de la clase datos para guardar lo obtenido
                DatosEgresados datosencontrados = new DatosEgresados();
                //traer al metodo :D
                metodos.buscarPorCodigo(codigo, numeroDocIdenti,datosencontrados);
                if (datosencontrados.getReGrado() != null){
                    //colocar en el formulario lo encontrado
                    cbxFilial.setSelectedItem(metodos.obtenerNombreFILIAL(datosencontrados.getFilial()));
                    cbxEstadoTrabajo.setSelectedItem(datosencontrados.getEstTrabajo());
                    jtxtcodigoE.setText(datosencontrados.getCodigoUCV());
                    jtxtApellidoP.setText(datosencontrados.getApellidoP());
                    jtxtApellidoM.setText(datosencontrados.getApellidoM());
                    jtxtNombres.setText(datosencontrados.getNombres());
                    txtCorreo.setText(datosencontrados.getCorreo());
                    txtTelefono1.setText(datosencontrados.getTele1());
                    cbxOpe1.setSelectedItem(metodos.obtenerNombreOPERADOR(datosencontrados.getOperador1()));
                    txtTelefono2.setText(datosencontrados.getTele2());
                    cbxOpe2.setSelectedItem(metodos.obtenerNombreOPERADOR(datosencontrados.getOperador2()));
                    txtTelefono3.setText(datosencontrados.getTele3());
                    cbxOpe3.setSelectedItem(metodos.obtenerNombreOPERADOR(datosencontrados.getOperador3()));
                    txtAñoEgreso.setText(datosencontrados.getAñoEgreso());
                    txtSemestreEgreso.setText(datosencontrados.getSemestreEgreso());
                    cbxTipoDoc.setSelectedItem(datosencontrados.getTipoDocIdenti());
                    txtNumeroDoc.setText(datosencontrados.getNumDocIdenti());
                    cbxEstadoGrado.setSelectedItem(datosencontrados.getEstGrado());
                    txtResGrado.setText(datosencontrados.getReGrado());
                    cbxEstadoTitulo.setSelectedItem(datosencontrados.getEstTitulo());
                    txtResTitulo.setText(datosencontrados.getReTitulo());
                    noeditar();
                }
            }
        }
        //Sino se ejecuta se muestra el error
        else{
            JOptionPane.showMessageDialog(null, verificar, "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnbuscarActionPerformed

    private void jtxtcodigoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcodigoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodigoEActionPerformed

    private void jtxtcodigoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcodigoEKeyTyped
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
    }//GEN-LAST:event_jtxtcodigoEKeyTyped

    private void txtResTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResTituloActionPerformed

    private void txtSemestreEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemestreEgresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemestreEgresoActionPerformed

    private void txtSemestreEgresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemestreEgresoKeyTyped
        if(txtSemestreEgreso.getText().length() >= 6)
        {
            evt.consume();
            //SONIDO ERROR
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtSemestreEgresoKeyTyped

    private void txtAñoEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoEgresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoEgresoActionPerformed

    private void txtAñoEgresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoEgresoKeyTyped
        char car = evt.getKeyChar();
        if(Character.isDigit(car)){
        }
        else{
            evt.consume();
        }

        if(txtAñoEgreso.getText().length() >= 4)
        {
            evt.consume();
            //SONIDO ERROR
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtAñoEgresoKeyTyped

    private void txtResGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResGradoActionPerformed

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1ActionPerformed

    private void txtTelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono1KeyTyped
        //SOLO NÚMEROS
        char car = evt.getKeyChar();
        if(Character.isDigit(car)){
        }
        else{
            evt.consume();
        }
        if(txtTelefono1.getText().length() >= 9)
        {
            evt.consume();
            //SONIDO ERROR
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefono1KeyTyped

    private void txtTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono2ActionPerformed

    private void txtTelefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono2KeyTyped
        //SOLO NÚMEROS
        char car = evt.getKeyChar();
        if(Character.isDigit(car)){
        }
        else{
            evt.consume();
        }

        if(txtTelefono2.getText().length() >= 9)
        {
            evt.consume();
            //SONIDO ERROR
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefono2KeyTyped

    private void txtTelefono3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono3ActionPerformed

    private void txtTelefono3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono3KeyTyped
        //SOLO NÚMEROS
        char car = evt.getKeyChar();
        if(Character.isDigit(car)){
        }
        else{
            evt.consume();
        }

        if(txtTelefono3.getText().length() >= 9)
        {
            evt.consume();
            //SONIDO ERROR
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefono3KeyTyped

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        //txtResTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DNI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        editar();
        if (jtxtcodigoE.getText().equals("") && !(txtNumeroDoc.getText().equals(""))){
            txtNumeroDoc.setEnabled(false);
        }
        else if (txtNumeroDoc.getText().equals("") && !(jtxtcodigoE.getText().equals(""))){
            jtxtcodigoE.setEnabled(false);
        }
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnuevoActionPerformed
        btnCrearActivo=true;
        limpiar();
        editar();
    }//GEN-LAST:event_jbtnnuevoActionPerformed

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
        String codigoUCV = jtxtcodigoE.getText();
        int filial = metodos.obtenerIdFilial(cbxFilial.getSelectedItem().toString());
        String estTrabajo = cbxEstadoTrabajo.getSelectedItem().toString();
        String apellidoP = jtxtApellidoP.getText();
        String apellidoM = jtxtApellidoM.getText();
        String nombres = jtxtNombres.getText();
        String correo = txtCorreo.getText();
        String tele1 = txtTelefono1.getText();
        int Operador1 = metodos.obtenerIdOperador(cbxOpe1.getSelectedItem().toString());
        String tele2 = txtTelefono2.getText();
        int Operador2 = metodos.obtenerIdOperador(cbxOpe2.getSelectedItem().toString());
        String tele3 = txtTelefono3.getText();
        int Operador3 = metodos.obtenerIdOperador(cbxOpe3.getSelectedItem().toString());
        String añoEgreso = txtAñoEgreso.getText();
        String semestreEgreso = txtSemestreEgreso.getText();
        String tipoDocIdenti = cbxTipoDoc.getSelectedItem().toString();
        String numDocIdenti = txtNumeroDoc.getText();
        String estGrado = cbxEstadoGrado.getSelectedItem().toString();
        String reGrado = txtResGrado.getText();
        String estTitulo = cbxEstadoTitulo.getSelectedItem().toString();
        String reTitulo = txtResTitulo.getText();
        int area_trabajo= metodos.obtener_id_Area_trabajo(cbxarea_trabajo.getSelectedItem().toString());
        int especializacion=metodos.obtener_id_especializacion(cbx_especializacion.getSelectedItem().toString());;
        
        
        //GUARDAR DATOS
        datos.setCodigoUCV(codigoUCV);
        datos.setFilial(filial);
        datos.setApellidoP(apellidoP);
        datos.setApellidoM(apellidoM);
        datos.setNombres(nombres);
        datos.setCorreo(correo);
        datos.setTele1(tele1);
        datos.setOperador1(Operador1);
        datos.setTele2(tele2);
        datos.setOperador2(Operador2);
        datos.setTele3(tele3);
        datos.setOperador3(Operador3);
        datos.setAñoEgreso(añoEgreso);
        datos.setSemestreEgreso(semestreEgreso);
        datos.setTipoDocIdenti(tipoDocIdenti);
        datos.setNumDocIdenti(numDocIdenti);
        datos.setEstGrado(estGrado);
        datos.setReGrado(reGrado);
        datos.setEstTitulo(estTitulo);
        datos.setReTitulo(reTitulo);
        datos.setEstTrabajo(estTrabajo);
        datos.setAreaTrabajo(area_trabajo);
        datos.setEspecializacion(especializacion);
        //Traemos excepciones para guardar
        Excepciones guardar= new Excepciones();
        String necesario=guardar.ExcepcionesGuardar(codigoUCV, apellidoP, apellidoM, nombres, 
                correo, tele1, Operador1, tele2, Operador2, tele3, Operador3, añoEgreso, 
                semestreEgreso, tipoDocIdenti, numDocIdenti, estGrado, reGrado, estTitulo, reTitulo);
        if(necesario.equals("")){
            
            //VERIFICAR SI EL CODIGO DE ESTUDIANTE YA EXISTE EN LA DB
            boolean existe = metodos.buscarsiExiste(codigoUCV, numDocIdenti);
            if (existe){
                metodos.editar(datos);
            }
            else{
                metodos.guardarEgresado(datos);
            }
            noeditar();
        }else{
            JOptionPane.showMessageDialog(null, necesario, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void cbxOpe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOpe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOpe2ActionPerformed

    private void jbtnnuevabusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnuevabusquedaActionPerformed
        
        limpiar();
        noeditar();
        jtxtcodigoE.setEnabled(true);
        txtNumeroDoc.setEnabled(true);
        
    }//GEN-LAST:event_jbtnnuevabusquedaActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        BD_Excel exportar = new BD_Excel();
        exportar.exportar();
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        JFileChooser  dlg = new JFileChooser(); // crear un objeto de dialogo
        int option = dlg.showOpenDialog(this); //ABRE LA VENTANA DE DIALOGO
        if(option==JFileChooser.APPROVE_OPTION){ /// Se hace click en el boton abrir del dialogo 
            String file = dlg.getSelectedFile().getPath(); // Obtieme ruta y nombre del archivo seleccionado
            String direccion=file;
            BD_Excel importar = new BD_Excel();
            try {
                importar.importar(direccion);
            } catch (IOException ex) {
                Logger.getLogger(frmEgresados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frmEgresados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void cbxarea_trabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxarea_trabajoActionPerformed
        
        String Texto_Seleccionado = cbxarea_trabajo.getSelectedItem().toString();
        int area=cbxarea_trabajo.getSelectedIndex();
        int id=metodos.obtener_id_Area_trabajo(Texto_Seleccionado);
        DefaultComboBoxModel<String> modelo= ejecutar.obtener_especializaciones(id);
        cbx_especializacion.setModel(modelo);
        if(area==0){
            cbx_especializacion.setEnabled(false);
        }else{
            cbx_especializacion.setEnabled(true);}
    }//GEN-LAST:event_cbxarea_trabajoActionPerformed

    private void cbxFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFilialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFilialActionPerformed

    private void cbx_especializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especializacionActionPerformed

    }//GEN-LAST:event_cbx_especializacionActionPerformed
            
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEgresados().setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JComboBox<String> cbxEstadoGrado;
    private javax.swing.JComboBox<String> cbxEstadoTitulo;
    private javax.swing.JComboBox<String> cbxEstadoTrabajo;
    private javax.swing.JComboBox<String> cbxFilial;
    private javax.swing.JComboBox<String> cbxOpe1;
    private javax.swing.JComboBox<String> cbxOpe2;
    private javax.swing.JComboBox<String> cbxOpe3;
    private javax.swing.JComboBox<String> cbxTipoDoc;
    private javax.swing.JComboBox<String> cbx_especializacion;
    private javax.swing.JComboBox<String> cbxarea_trabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JButton jbtnnuevabusqueda;
    private javax.swing.JButton jbtnnuevo;
    private javax.swing.JScrollPane jscpegresados;
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

    private void llenarCombobox() {
        DefaultComboBoxModel<String> model = metodos.obtenerNombresOperadores();
        cbxOpe1.setModel(model);
        DefaultComboBoxModel<String> model2 = metodos.obtenerNombresOperadores();
        cbxOpe2.setModel(model2);
        DefaultComboBoxModel<String> model3 = metodos.obtenerNombresOperadores();
        cbxOpe3.setModel(model3);
        DefaultComboBoxModel<String> model4 = metodos.obtenerNombresFiliales();
        cbxFilial.setModel(model4);
        DefaultComboBoxModel<String> model5 = metodos.obtener_areas_trabajo();
        cbxarea_trabajo.setModel(model5);
    }
   
}
