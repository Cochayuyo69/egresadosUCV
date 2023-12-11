
package Egresados;

import Capacitaciones.Datos_Capacitaciones;
import Capacitaciones.Metodos_capacitacion;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import metodos.Metodoss;

 
public class frmCREARCAPACITACION extends javax.swing.JFrame {
    SimpleDateFormat formato_fecha= new SimpleDateFormat("dd/MM/yyyy");
    Datos_Capacitaciones datos= new Datos_Capacitaciones();
    Metodos_capacitacion ejecutar= new Metodos_capacitacion();
    Metodoss metodos= new Metodoss();
    private boolean btnBuscarActivo = false;
    public frmCREARCAPACITACION() {
        initComponents();
        setPreferredSize(new Dimension(1250,750));
        cbx_capacitacion.setEnabled(false);
        llenarCombobox();
        txt_monto.setEnabled(false);
        rb_pagar.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Verificar si el radio button está seleccionado
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    txt_monto.setEnabled(true); // Habilitar el JTextField
                } else {
                    txt_monto.setEnabled(false);
                    txt_monto.setText("");// Deshabilitar el JTextField
                }
            }
        });
        Desactivar();
        btn_buscar.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_guardar.setEnabled(false);
    }

    public void Desactivar(){
        txt_monto.setEnabled(false);
        txt_mensaje.setEnabled(false);
        txt_titulo.setEnabled(false);
        cbx_hora.setEnabled(false);
        cbx_modalidad.setEnabled(false);
        cbx_turno.setEnabled(false);
        rb_pagar.setEnabled(false);
        dch_fecha.setEnabled(false);
    }
    public void activar(){
        txt_mensaje.setEnabled(true);
        txt_titulo.setEnabled(true);
        cbx_hora.setEnabled(true);
        cbx_modalidad.setEnabled(true);
        cbx_turno.setEnabled(true);
        dch_fecha.setEnabled(true);
        rb_pagar.setEnabled(true);
    }
    public void limpiar(){
        txt_monto.setText("");
        txt_mensaje.setText("");
        txt_titulo.setText("");
        cbx_hora.setSelectedIndex(0);
        cbx_area.setSelectedIndex(0);
        cbx_modalidad.setSelectedIndex(0);
        cbx_turno.setSelectedIndex(0);
        dch_fecha.setDate(null);
        rb_pagar.setSelected(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_datos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        dch_fecha = new com.toedter.calendar.JDateChooser();
        cbx_turno = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbx_hora = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbx_modalidad = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        rb_pagar = new javax.swing.JRadioButton();
        txt_monto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_mensaje = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbx_capacitacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbx_area = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_nuevabusqueda = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_datos.setBackground(new java.awt.Color(255, 255, 255));
        panel_datos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_datos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TÍTULO");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("FECHA");

        txt_titulo.setBackground(new java.awt.Color(255, 255, 255));
        txt_titulo.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        txt_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        // Establece el formato de fecha

        JTextField textField = (JTextField) dch_fecha.getDateEditor().getUiComponent();
        textField.setEditable(false);
        dch_fecha.setBackground(new java.awt.Color(255, 255, 255));
        dch_fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dch_fecha.setForeground(new java.awt.Color(0, 0, 0));
        dch_fecha.setDateFormatString("dd/MM/yyyy");
        dch_fecha.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        dch_fecha.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N

        cbx_turno.setBackground(new java.awt.Color(255, 255, 255));
        cbx_turno.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_turno.setForeground(new java.awt.Color(0, 0, 0));
        cbx_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAÑANA", "TARDE", "NOCHE" }));
        cbx_turno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_turnoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TURNO");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("HORA");

        cbx_hora.setBackground(new java.awt.Color(255, 255, 255));
        cbx_hora.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_hora.setForeground(new java.awt.Color(0, 0, 0));
        cbx_hora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("MODALIDAD");

        cbx_modalidad.setBackground(new java.awt.Color(255, 255, 255));
        cbx_modalidad.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_modalidad.setForeground(new java.awt.Color(0, 0, 0));
        cbx_modalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIRTUAL", "PRESENCIAL" }));
        cbx_modalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("PAGO");

        rb_pagar.setBackground(new java.awt.Color(255, 255, 255));
        rb_pagar.setForeground(new java.awt.Color(0, 0, 0));
        rb_pagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rb_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_pagarActionPerformed(evt);
            }
        });

        txt_monto.setBackground(new java.awt.Color(255, 255, 255));
        txt_monto.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        txt_monto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_montoActionPerformed(evt);
            }
        });
        txt_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_montoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("MONTO S/.");

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("MENSAJE");

        txt_mensaje.setBackground(new java.awt.Color(255, 255, 255));
        txt_mensaje.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        txt_mensaje.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_mensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_mensaje)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_datosLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dch_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_pagar)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_titulo)
                        .addComponent(dch_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                    .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbx_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbx_modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rb_pagar)))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(txt_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 1080, 310));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo_menu.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL2_1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CAPACITACIONES titulo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 120, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbx_capacitacion.setBackground(new java.awt.Color(255, 255, 255));
        cbx_capacitacion.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_capacitacion.setForeground(new java.awt.Color(0, 0, 0));
        cbx_capacitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_capacitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_capacitacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CAPACITACIÓN");

        cbx_area.setBackground(new java.awt.Color(255, 255, 255));
        cbx_area.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_area.setForeground(new java.awt.Color(0, 0, 0));
        cbx_area.setToolTipText("");
        cbx_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbx_area.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbx_area.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbx_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_areaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ESPECIALIZACIÓN");

        btn_buscar.setBackground(new java.awt.Color(153, 153, 255));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_nuevabusqueda.setBackground(new java.awt.Color(178, 255, 255));
        btn_nuevabusqueda.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_nuevabusqueda.setForeground(new java.awt.Color(0, 0, 0));
        btn_nuevabusqueda.setText("NUEVA BUSQUEDA");
        btn_nuevabusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_nuevabusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevabusquedaActionPerformed(evt);
            }
        });

        btn_crear.setBackground(new java.awt.Color(204, 255, 204));
        btn_crear.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(0, 0, 0));
        btn_crear.setText("CREAR");
        btn_crear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_capacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_area, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_nuevabusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_capacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_area, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_nuevabusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 1080, 110));

        btn_guardar.setBackground(new java.awt.Color(0, 153, 51));
        btn_guardar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(0, 0, 0));
        btn_guardar.setText("GUARDAR");
        btn_guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 144, 46));

        btn_editar.setBackground(new java.awt.Color(255, 255, 204));
        btn_editar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_editar.setText("EDITAR");
        btn_editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 144, 46));

        btn_eliminar.setBackground(new java.awt.Color(255, 153, 153));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 144, 46));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_areaActionPerformed
        if (btnBuscarActivo) { 
        DefaultComboBoxModel<String> modelo;
        String areaSeleccionada = cbx_area.getSelectedItem().toString();
        int area=cbx_area.getSelectedIndex();
        if(area==0){
            modelo= new DefaultComboBoxModel<>(new String[]{""});
            cbx_capacitacion.setEnabled(false);
        }else{
            modelo = ejecutar.obtenercapacitaciones(areaSeleccionada); 
            cbx_capacitacion.setModel(modelo);
            cbx_capacitacion.setEnabled(true); 
        }
        }
    }//GEN-LAST:event_cbx_areaActionPerformed


    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        btnBuscarActivo = false;
        cbx_capacitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cbx_capacitacion.setEnabled(false);
        activar();
        limpiar();
        btn_buscar.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_guardar.setEnabled(true);
    }//GEN-LAST:event_btn_crearActionPerformed

    private void rb_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_pagarActionPerformed

    }//GEN-LAST:event_rb_pagarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        //hellow
        String area= cbx_area.getSelectedItem().toString();
        String titulo=txt_titulo.getText();
        String fecha=formato_fecha.format(dch_fecha.getDate() );
        System.out.println(fecha);
        String turno=cbx_turno.getSelectedItem().toString();
        String hora=cbx_hora.getSelectedItem().toString();
        String modalidad=cbx_modalidad.getSelectedItem().toString();
        String mensaje=txt_mensaje.getText();
        boolean pago=rb_pagar.isSelected();
        double monto;
        // Evaluando si es de pago o no
        if(pago){
            monto=Double.parseDouble(txt_monto.getText());
        }else{
            monto=0;
        }
        datos.setArea(area);
        datos.setTitulo(titulo);
        datos.setFecha(fecha);
        datos.setTurno(turno);
        datos.setHora(hora);
        datos.setModalidad(modalidad);
        datos.setMensaje(mensaje);
        datos.setMonto(monto);
        
        ejecutar.guardar_Capacitacion(datos);
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevabusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevabusquedaActionPerformed
        limpiar();
        Desactivar();
        btnBuscarActivo = true;
        btn_editar.setEnabled(true);
        btn_guardar.setEnabled(false);
        btn_eliminar.setEnabled(true);
        btn_buscar.setEnabled(true);
    }//GEN-LAST:event_btn_nuevabusquedaActionPerformed

    private void txt_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_montoKeyTyped
        // SOLO NÚMEROS Y PUNTO DECIMAL
    char car = evt.getKeyChar();
    if (Character.isDigit(car) || car == '.') {
        // Permitir dígitos y punto decimal
    } else {
        evt.consume();
        getToolkit().beep();
    }
    }//GEN-LAST:event_txt_montoKeyTyped

    private void txt_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_montoActionPerformed

    private void cbx_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_turnoActionPerformed
        String turno=cbx_turno.getSelectedItem().toString();
        DefaultComboBoxModel<String> modelo_horas=ejecutar.obtenerhoras(turno);
        cbx_hora.setModel(modelo_horas);
    }//GEN-LAST:event_cbx_turnoActionPerformed

    private void cbx_capacitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_capacitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_capacitacionActionPerformed

    private void llenarCombobox() {
        DefaultComboBoxModel<String> model5 = metodos.obtener_areas_trabajo();
        cbx_area.setModel(model5);
        DefaultComboBoxModel<String> modelo_horas=ejecutar.obtenerhoras("MAÑANA");
        cbx_hora.setModel(modelo_horas);
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
            java.util.logging.Logger.getLogger(frmCREARCAPACITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCREARCAPACITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCREARCAPACITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCREARCAPACITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCREARCAPACITACION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevabusqueda;
    private javax.swing.JComboBox<String> cbx_area;
    private javax.swing.JComboBox<String> cbx_capacitacion;
    private javax.swing.JComboBox<String> cbx_hora;
    private javax.swing.JComboBox<String> cbx_modalidad;
    private javax.swing.JComboBox<String> cbx_turno;
    private com.toedter.calendar.JDateChooser dch_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel panel_datos;
    private javax.swing.JRadioButton rb_pagar;
    private javax.swing.JTextField txt_mensaje;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables

    
}
