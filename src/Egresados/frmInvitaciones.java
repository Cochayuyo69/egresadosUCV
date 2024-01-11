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
        
        cbx_area2.setEnabled(false);
        cbx_especializacion2.setEnabled(false);
        jbtnbuscarEgresados.setEnabled(false);
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
    
    //LLENAR JTABLE
    public void llenarTabla(DefaultTableModel model, int perfil, int espe){
        String[][] datos2 = metodos.mostrarEgresadosInvi(perfil, espe);
        if (datos2 != null) {
            for (String[] row : datos2) {
                model.addRow(row);
            }
        }  
    }
    
    //BORRAR DATOS DEL JTABLE
    private void borrarDatosVisibles(DefaultTableModel model) {
        model.setRowCount(0); // Eliminar todas las filas del modelo
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
        cbx_especializacion2.setEnabled(false);
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
          cbx_area.setSelectedIndex(0);
//        cbx_modalidad.setSelectedIndex(0);
//        cbx_turno.setSelectedIndex(0);
//        dch_fecha.setDate(null);
//        rb_pagar.setSelected(false);
        borrarDatosVisibles(model1);
        borrarDatosVisibles(model2);
        jtxtTitulo.setText("");
        jtxaMensaje.setText("");
    }
    
    private void llenarCombobox() {
        DefaultComboBoxModel<String> model5 = metodos.obtener_areas_trabajo();
        cbx_area.setModel(model5);
        DefaultComboBoxModel<String> model6 = metodos.obtener_areas_trabajo();
        cbx_area2.setModel(model6);
        //DefaultComboBoxModel<String> modelo_horas=ejecutar.obtenerhoras("MAÑANA");
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxaMensaje = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jtxtTitulo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblEgreEspe = new javax.swing.JTable();
        btn_EnviarEspe = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblEgreTodos = new javax.swing.JTable();
        cbx_area2 = new javax.swing.JComboBox<>();
        cbx_especializacion2 = new javax.swing.JComboBox<>();
        jbtnbuscarEgresados = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_EnviarTodos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setText("TÍTULO DEL MENSAJE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jtxaMensaje.setColumns(20);
        jtxaMensaje.setRows(5);
        jScrollPane3.setViewportView(jtxaMensaje);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 340, 150));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setText("MENSAJE:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        jtxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTituloActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setText("EGRESADOS DE LA ESPECIALIZACIÓN");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

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

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 490, 310));

        btn_EnviarEspe.setBackground(new java.awt.Color(0, 186, 0));
        btn_EnviarEspe.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_EnviarEspe.setText("ENVIAR CORREOS");
        btn_EnviarEspe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_EnviarEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnviarEspeActionPerformed(evt);
            }
        });
        jPanel4.add(btn_EnviarEspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 190, 46));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jLabel10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel10KeyPressed(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jLabel11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel11KeyPressed(evt);
            }
        });
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 530, 430));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, 310));

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
        jPanel3.add(cbx_area2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 180, 43));

        cbx_especializacion2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cbx_especializacion2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        cbx_especializacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especializacion2ActionPerformed(evt);
            }
        });
        jPanel3.add(cbx_especializacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 200, 44));

        jbtnbuscarEgresados.setBackground(new java.awt.Color(255, 102, 102));
        jbtnbuscarEgresados.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jbtnbuscarEgresados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtnbuscarEgresados.setBorder(null);
        jbtnbuscarEgresados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbuscarEgresadosActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnbuscarEgresados, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 50, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel7.setText("PERFIL");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 22));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setText("TODOS LOS EGRESADOS");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        btn_EnviarTodos.setBackground(new java.awt.Color(0, 186, 0));
        btn_EnviarTodos.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_EnviarTodos.setText("ENVIAR CORREOS");
        btn_EnviarTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_EnviarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnviarTodosActionPerformed(evt);
            }
        });
        jPanel3.add(btn_EnviarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 190, 46));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel8.setText("ESPECIALIZACIÓN");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, 16));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jLabel13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel13KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel12KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 720, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
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
        
        
        cbx_area2.setEnabled(true);
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
        limpiar();
        Desactivar();
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

    private void jbtnbuscarEgresadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbuscarEgresadosActionPerformed
        borrarDatosVisibles(model2); 
        String Area_seleccionada=cbx_area2.getSelectedItem().toString();
        String Especializacion=cbx_especializacion2.getSelectedItem().toString();  
        
        int perfil = metodos.obtenerIdPerfil(Area_seleccionada);
        int espe = metodos.obtenerIdEspe(Especializacion);
        
        llenarTabla(model2, perfil, espe);
    }//GEN-LAST:event_jbtnbuscarEgresadosActionPerformed

    private void cbx_area2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_area2ActionPerformed
        DefaultComboBoxModel<String> modelo;
        String Texto_Seleccionado = cbx_area2.getSelectedItem().toString();
        int area=cbx_area2.getSelectedIndex();
        if(area==0){
            modelo= new DefaultComboBoxModel<>();
            cbx_especializacion2.setModel(modelo);
            cbx_especializacion2.setEnabled(false);
        }else{
            int id=metodos.obtener_id_Area_trabajo(Texto_Seleccionado);
            modelo = ejecutar.obtener_especializaciones(id);
            cbx_especializacion2.setModel(modelo);
            cbx_especializacion2.setEnabled(true);
            jbtnbuscarEgresados.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_area2ActionPerformed

    private void cbx_especializacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especializacion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_especializacion2ActionPerformed

    private void jLabel11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel11KeyPressed
        
    }//GEN-LAST:event_jLabel11KeyPressed

    private void jLabel10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel10KeyPressed
        
    }//GEN-LAST:event_jLabel10KeyPressed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        selectAllCheckboxes(jtblEgreEspe);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        selectAllCheckboxes(jtblEgreTodos);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12KeyPressed

    private void jLabel13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel13KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13KeyPressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        deselectAllCheckboxes(jtblEgreEspe);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        deselectAllCheckboxes(jtblEgreTodos);
    }//GEN-LAST:event_jLabel13MouseClicked

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
    private javax.swing.JButton btn_EnviarEspe;
    private javax.swing.JButton btn_EnviarTodos;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_nuevabusqueda;
    private javax.swing.JComboBox<String> cbx_area;
    private javax.swing.JComboBox<String> cbx_area2;
    private javax.swing.JComboBox<String> cbx_especializacion;
    private javax.swing.JComboBox<String> cbx_especializacion2;
    private javax.swing.JComboBox<String> cbx_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnbuscarEgresados;
    private javax.swing.JTable jtblEgreEspe;
    private javax.swing.JTable jtblEgreTodos;
    private javax.swing.JTextArea jtxaMensaje;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables
}
