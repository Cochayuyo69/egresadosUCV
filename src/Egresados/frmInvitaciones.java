/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Egresados;

import Capacitaciones.Datos_Capacitaciones;
import Capacitaciones.Metodos_capacitacion;
import java.awt.Component;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import metodos.Metodoss;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author anton
 */
public class frmInvitaciones extends javax.swing.JFrame {
    SimpleDateFormat formato_fecha= new SimpleDateFormat("dd/MM/yyyy");
    Datos_Capacitaciones datos1= new Datos_Capacitaciones();
    Metodos_capacitacion ejecutar= new Metodos_capacitacion();
    Metodoss metodos= new Metodoss();
    private boolean btnBuscarActivo = false;
    private boolean btnCrearActivo=false;
    DefaultTableModel model1 = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    
    public frmInvitaciones() {
        initComponents();
        setPreferredSize(new Dimension(1250,750));
        llenarCombobox();
        
        model1.addColumn("Apellido P");
        model1.addColumn("Apellido M");
        model1.addColumn("Nombre");
        model1.addColumn("Correo Electrónico");
        model1.addColumn("Selección");
        jtblEgreEspe.setModel(model1);
        
        jtblEgreEspe.getColumn("Selección").setCellRenderer(new CheckBoxRenderer());
        jtblEgreEspe.getColumn("Selección").setCellEditor(new CheckBoxEditor());
        
        model2.addColumn("Apellido P");
        model2.addColumn("Apellido M");
        model2.addColumn("Nombre");
        model2.addColumn("Correo Electrónico");
        model2.addColumn("Selección");
        jtblEgreTodos.setModel(model2);
        
        jtblEgreTodos.getColumn("Selección").setCellRenderer(new CheckBoxRenderer());
        jtblEgreTodos.getColumn("Selección").setCellEditor(new CheckBoxEditor());
        
        cbx_titulo.setEnabled(false);
        cbx_area.setEnabled(true);
        cbx_especializacion.setEnabled(false);
//        lbl_id.setText("");
//        txt_monto.setEnabled(false);
//        rb_pagar.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                // Verificar si el radio button está seleccionado
//                if (e.getStateChange() == ItemEvent.SELECTED) {
//                    txt_monto.setEnabled(true); // Habilitar el JTextField
//                } else {
//                    txt_monto.setEnabled(false);
//                    txt_monto.setText("");// Deshabilitar el JTextField
//                }
//            }
//        });
        
    }
    
    public void llenarTabla(DefaultTableModel model, int perfil, int espe){
        String[][] datos2 = metodos.mostrarEgresadosInvi(perfil, espe);
        if (datos2 != null) {
            for (String[] row : datos2) {
                model.addRow(row);
            }
        }  
    }
    public void Desactivar(){
//        txt_monto.setEnabled(false);
//        txt_mensaje.setEnabled(false);
//        txt_titulo.setEnabled(false);
//        cbx_hora.setEnabled(false);
//        cbx_modalidad.setEnabled(false);
//        cbx_turno.setEnabled(false);
//        rb_pagar.setEnabled(false);
//        dch_fecha.setEnabled(false);
        cbx_area.setEnabled(false);
        cbx_especializacion.setEnabled(false);
        cbx_titulo.setEnabled(false);
    }
    
    public void activar(){
//        txt_mensaje.setEnabled(true);
//        txt_titulo.setEnabled(true);
//        cbx_hora.setEnabled(true);
//        cbx_modalidad.setEnabled(true);
//        cbx_turno.setEnabled(true);
//        dch_fecha.setEnabled(true);
//        rb_pagar.setEnabled(true);
    }
    
    public void limpiar(){
//        lbl_id.setText("");
//        txt_monto.setText("");
//        txt_mensaje.setText("");
//        txt_titulo.setText("");
//        cbx_hora.setSelectedIndex(0);
//        cbx_area.setSelectedIndex(0);
//        cbx_modalidad.setSelectedIndex(0);
//        cbx_turno.setSelectedIndex(0);
//        dch_fecha.setDate(null);
//        rb_pagar.setSelected(false);
    }
    
    private void llenarCombobox() {
        DefaultComboBoxModel<String> model5 = metodos.obtener_areas_trabajo();
        cbx_area.setModel(model5);
        DefaultComboBoxModel<String> modelo_horas=ejecutar.obtenerhoras("MAÑANA");
        //cbx_hora.setModel(modelo_horas);
    }
    
    //RENDER PARA EL CHECKBOX 
    static class CheckBoxRenderer extends JCheckBox implements TableCellRenderer {
        CheckBoxRenderer() {
            setHorizontalAlignment(JLabel.CENTER);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setSelected(value != null && (Boolean) value);
            return this;
        }
    }

    static class CheckBoxEditor extends DefaultCellEditor {
        CheckBoxEditor() {
            super(new JCheckBox());
            JCheckBox checkBox = (JCheckBox) getComponent();
            checkBox.setHorizontalAlignment(JLabel.CENTER);
            checkBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        @Override
        public Object getCellEditorValue() {
            return ((JCheckBox) getComponent()).isSelected();
        }
    }
    
    //ver los checkbox
    static String[][] obtenerSeleccionados(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        List<String[]> seleccionadosList = new ArrayList<>();

        for (int i = 0; i < rowCount; i++) {
            Boolean seleccionado = (Boolean) model.getValueAt(i, model.findColumn("Selección"));

            if (seleccionado != null && seleccionado) {
                String nombre = (String) model.getValueAt(i, model.findColumn("Nombre"));
                String correo = (String) model.getValueAt(i, model.findColumn("Correo Electrónico"));

                seleccionadosList.add(new String[]{nombre, correo});
            }
        }

        // Convertir la lista a una matriz
        String[][] seleccionadosArray = new String[seleccionadosList.size()][2];
        seleccionadosArray = seleccionadosList.toArray(seleccionadosArray);

        return seleccionadosArray;
    }
    
    //SELECCIONAR LOS CHECKBOXES
    static void selectAllCheckboxes(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int colIndex = model.findColumn("Selección");
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            model.setValueAt(true, i, colIndex);
        }
    }
    
    //DESSELECCIONAR LOS CHECKBOXES
    static void deselectAllCheckboxes(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int colIndex = model.findColumn("Selección");
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            model.setValueAt(false, i, colIndex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbx_especializacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbx_area = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_nuevabusqueda = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbx_titulo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblEgreTodos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblEgreEspe = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxaMensaje = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btn_EnviarEspe = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtxtTitulo = new javax.swing.JTextField();
        btn_SelecEspe = new javax.swing.JButton();
        btn_EnviarTodos = new javax.swing.JButton();
        btn_SelecTodos = new javax.swing.JButton();
        btn_DeselecEspe = new javax.swing.JButton();
        btn_DeselecTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1234, 832));
        setMinimumSize(new java.awt.Dimension(1234, 832));
        setResizable(false);
        setSize(new java.awt.Dimension(1234, 832));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbx_especializacion.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_especializacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_especializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especializacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setText("ESPECIALIZACIÓN");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setText("PERFIL");

        btn_buscar.setBackground(new java.awt.Color(153, 153, 255));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_nuevabusqueda.setBackground(new java.awt.Color(178, 255, 255));
        btn_nuevabusqueda.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_nuevabusqueda.setText("NUEVA BÚSQUEDA");
        btn_nuevabusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_nuevabusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevabusquedaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel15.setText("TÍTULO");

        cbx_titulo.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_titulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_area, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbx_especializacion, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbx_titulo, 0, 291, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_nuevabusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_especializacion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_area, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_nuevabusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1080, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setText("TODOS LOS EGRESADOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setText("TÍTULO DEL MENSAJE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jtblEgreTodos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblEgreTodos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 490, 310));

        jtblEgreEspe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtblEgreEspe);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 490, 310));

        jtxaMensaje.setColumns(20);
        jtxaMensaje.setRows(5);
        jScrollPane3.setViewportView(jtxaMensaje);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 340, 150));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setText("EGRESADOS DE LA ESPECIALIZACIÓN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        btn_EnviarEspe.setBackground(new java.awt.Color(0, 153, 51));
        btn_EnviarEspe.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_EnviarEspe.setText("ENVIAR CORREOS");
        btn_EnviarEspe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_EnviarEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnviarEspeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_EnviarEspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, 190, 46));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setText("MENSAJE:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        jtxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTituloActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, 50));

        btn_SelecEspe.setBackground(new java.awt.Color(51, 51, 255));
        btn_SelecEspe.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_SelecEspe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EXPORTAR.png"))); // NOI18N
        btn_SelecEspe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_SelecEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelecEspeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_SelecEspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 680, 70, 46));

        btn_EnviarTodos.setBackground(new java.awt.Color(0, 153, 51));
        btn_EnviarTodos.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_EnviarTodos.setText("ENVIAR CORREOS");
        btn_EnviarTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_EnviarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnviarTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_EnviarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 680, 190, 46));

        btn_SelecTodos.setBackground(new java.awt.Color(51, 51, 255));
        btn_SelecTodos.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_SelecTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EXPORTAR.png"))); // NOI18N
        btn_SelecTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_SelecTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelecTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_SelecTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 680, 70, 46));

        btn_DeselecEspe.setBackground(new java.awt.Color(255, 51, 0));
        btn_DeselecEspe.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_DeselecEspe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMPORTAR.png"))); // NOI18N
        btn_DeselecEspe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_DeselecEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeselecEspeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_DeselecEspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, 70, 46));

        btn_DeselecTodos.setBackground(new java.awt.Color(255, 51, 0));
        btn_DeselecTodos.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_DeselecTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMPORTAR.png"))); // NOI18N
        btn_DeselecTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_DeselecTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeselecTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_DeselecTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 680, 70, 46));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_especializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especializacionActionPerformed
        DefaultComboBoxModel<String> modelo;
        if(btnCrearActivo){
            modelo=new DefaultComboBoxModel<>(new String[]{""});
            cbx_titulo.setEnabled(false);
        }else {
            String especializacion_Seleccionada = cbx_especializacion.getSelectedItem().toString();
            String area_seleccionada=cbx_area.getSelectedItem().toString();
            modelo = ejecutar.obtener_Titulos(area_seleccionada, especializacion_Seleccionada);
            cbx_titulo.setModel(modelo);
            cbx_titulo.setEnabled(true);
        }

    }//GEN-LAST:event_cbx_especializacionActionPerformed

    private void cbx_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_areaActionPerformed

        DefaultComboBoxModel<String> modelo;
        String Texto_Seleccionado = cbx_area.getSelectedItem().toString();
        int area=cbx_area.getSelectedIndex();
        if(area==0){
            modelo= new DefaultComboBoxModel<>();
            cbx_especializacion.setModel(modelo);
            cbx_especializacion.setEnabled(false);
            cbx_titulo.setModel(modelo);
            cbx_titulo.setEnabled(false);
        }else{
            int id=metodos.obtener_id_Area_trabajo(Texto_Seleccionado);
            modelo = ejecutar.obtener_especializaciones(id);
            cbx_especializacion.setModel(modelo);
            cbx_especializacion.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_areaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        model1.setRowCount(0);
        String Area_seleccionada=cbx_area.getSelectedItem().toString();
        String Especializacion=cbx_especializacion.getSelectedItem().toString();
        String Partes_titulo=cbx_titulo.getSelectedItem().toString();
        String[] parts = Partes_titulo.split("\\s{2,}");
        String id = parts[1].substring(parts[1].indexOf(":") + 1).trim();
        Datos_Capacitaciones capacitaciones= new Datos_Capacitaciones();
        Date dia = null;
        
        int perfil = metodos.obtenerIdPerfil(Area_seleccionada);
        int espe = metodos.obtenerIdEspe(Especializacion);
        
        llenarTabla(model1, perfil, espe);
        Desactivar();
        
//        ejecutar.buscar_capacitacion(Area_seleccionada, Especializacion,id, capacitaciones);
//        if(capacitaciones.getTitulo()!=null){
//            txt_titulo.setText(capacitaciones.getTitulo());
//            try {
//                dia=formato_fecha.parse(capacitaciones.getFecha());
//            } catch (ParseException ex) {
//                Logger.getLogger(frmCREARCAPACITACION.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            dch_fecha.setDate(dia);
//            cbx_turno.setSelectedItem(capacitaciones.getTurno());
//            cbx_modalidad.setSelectedItem(capacitaciones.getModalidad());
//            if(capacitaciones.getMonto()!=0){
//                rb_pagar.setSelected(true);
//                txt_monto.setText(String.valueOf(capacitaciones.getMonto()));
//            }else{
//                rb_pagar.setSelected(false);
//                txt_monto.setText(null);
//            }
//            txt_mensaje.setText(capacitaciones.getMensaje());
//            cbx_hora.setSelectedItem(capacitaciones.getHora());
//            lbl_id.setText(capacitaciones.getId());
//            Desactivar();
//        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_nuevabusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevabusquedaActionPerformed
//        limpiar();
//        Desactivar();
        btnBuscarActivo = true;
//        btnCrearActivo=false;
//        btn_editar.setEnabled(true);
//        btn_guardar.setEnabled(false);
//        btn_eliminar.setEnabled(true);
        btn_buscar.setEnabled(true);
        cbx_titulo.setEnabled(false);
        cbx_area.setEnabled(true);
        cbx_especializacion.setEnabled(false);
    }//GEN-LAST:event_btn_nuevabusquedaActionPerformed

    private void cbx_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tituloActionPerformed

    private void btn_EnviarEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnviarEspeActionPerformed
        String Titulo = jtxtTitulo.getText();
        String mensaje = jtxaMensaje.getText();
        String[][] seleccionados = obtenerSeleccionados(jtblEgreEspe);
        for (String[] datos : seleccionados) {
            String nombre = datos[0];
            String correo = datos[1];
            metodos.enviarCorreoEgre(correo, mensaje, Titulo);
        }
        //metodos.enviarCorreoEgre("correo", mensaje, Titulo);
        //mostrarSeleccionados(jtblEgreTodos, "Todos los Egresados");
    }//GEN-LAST:event_btn_EnviarEspeActionPerformed

    private void jtxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTituloActionPerformed

    private void btn_SelecEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelecEspeActionPerformed
        selectAllCheckboxes(jtblEgreEspe);
    }//GEN-LAST:event_btn_SelecEspeActionPerformed

    private void btn_EnviarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnviarTodosActionPerformed
        String Titulo = jtxtTitulo.getText();
        String mensaje = jtxaMensaje.getText();
        String[][] seleccionados = obtenerSeleccionados(jtblEgreTodos);
        for (String[] datos : seleccionados) {
            String nombre = datos[0];
            String correo = datos[1];
            metodos.enviarCorreoEgre(correo, mensaje, Titulo);
        }
    }//GEN-LAST:event_btn_EnviarTodosActionPerformed

    private void btn_SelecTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelecTodosActionPerformed
        selectAllCheckboxes(jtblEgreTodos);
    }//GEN-LAST:event_btn_SelecTodosActionPerformed

    private void btn_DeselecEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeselecEspeActionPerformed
        deselectAllCheckboxes(jtblEgreEspe);
    }//GEN-LAST:event_btn_DeselecEspeActionPerformed

    private void btn_DeselecTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeselecTodosActionPerformed
        deselectAllCheckboxes(jtblEgreTodos);
    }//GEN-LAST:event_btn_DeselecTodosActionPerformed

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
            java.util.logging.Logger.getLogger(frmInvitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInvitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInvitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInvitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInvitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DeselecEspe;
    private javax.swing.JButton btn_DeselecTodos;
    private javax.swing.JButton btn_EnviarEspe;
    private javax.swing.JButton btn_EnviarTodos;
    private javax.swing.JButton btn_SelecEspe;
    private javax.swing.JButton btn_SelecTodos;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_nuevabusqueda;
    private javax.swing.JComboBox<String> cbx_area;
    private javax.swing.JComboBox<String> cbx_especializacion;
    private javax.swing.JComboBox<String> cbx_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtblEgreEspe;
    private javax.swing.JTable jtblEgreTodos;
    private javax.swing.JTextArea jtxaMensaje;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables
}
