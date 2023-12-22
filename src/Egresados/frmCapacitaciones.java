
package Egresados;

import java.awt.Dimension;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import metodos.Metodoss;
import metodos.Render;
public class frmCapacitaciones extends javax.swing.JFrame {

    Metodoss metodo= new Metodoss();
    public frmCapacitaciones() {
        initComponents();
        setPreferredSize(new Dimension(1230, 750));
        setLocationRelativeTo(null);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_Nombres = new javax.swing.JTextField();
        cbx_area = new javax.swing.JComboBox<>();
        cbx_Capacitaciones = new javax.swing.JComboBox<>();
        txt_Codigo = new javax.swing.JTextField();
        btn_busqueda_masiva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_enviar_correo = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scroll_panetabla = new javax.swing.JScrollPane();
        tbl_egresados = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 120, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Nombres.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombres.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txt_Nombres.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombres y Apellidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.add(txt_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 15, 372, 61));

        cbx_area.setBackground(new java.awt.Color(255, 255, 255));
        cbx_area.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbx_area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbx_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_areaActionPerformed(evt);
            }
        });
        jPanel2.add(cbx_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 316, 40));

        cbx_Capacitaciones.setBackground(new java.awt.Color(255, 255, 255));
        cbx_Capacitaciones.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cbx_Capacitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_Capacitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbx_Capacitaciones.setFocusable(false);
        cbx_Capacitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_CapacitacionesActionPerformed(evt);
            }
        });
        jPanel2.add(cbx_Capacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 316, 40));

        txt_Codigo.setBackground(new java.awt.Color(255, 255, 255));
        txt_Codigo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txt_Codigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Código UCV", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 372, 61));

        btn_busqueda_masiva.setBackground(new java.awt.Color(255, 102, 102));
        btn_busqueda_masiva.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_busqueda_masiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_busqueda_masiva.setText("BUSCAR POR AREA");
        btn_busqueda_masiva.setBorder(null);
        btn_busqueda_masiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busqueda_masivaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_busqueda_masiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 210, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Área");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Capacitaciones");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 30));

        btn_enviar_correo.setBackground(new java.awt.Color(204, 255, 153));
        btn_enviar_correo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_enviar_correo.setForeground(new java.awt.Color(0, 0, 0));
        btn_enviar_correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_enviar_correo.setText("ENVIAR");
        btn_enviar_correo.setToolTipText("");
        btn_enviar_correo.setAutoscrolls(true);
        btn_enviar_correo.setBorder(null);
        btn_enviar_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviar_correoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_enviar_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 160, 130));

        btn_buscar.setBackground(new java.awt.Color(255, 102, 102));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(null);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 210, 60));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 82, 1130, 158));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CAPACITACIONES titulo.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL1_1.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        scroll_panetabla.setViewportView(tbl_egresados);

        jPanel3.add(scroll_panetabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 1130, 350));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo_menu.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL2_1.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo a arriba.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1205, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 642, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String nombre=txt_Nombres.getText();
        String codigo=txt_Codigo.getText();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_enviar_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviar_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_enviar_correoActionPerformed

    private void btn_busqueda_masivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busqueda_masivaActionPerformed
     cargartabla();
    }//GEN-LAST:event_btn_busqueda_masivaActionPerformed
    public void cargartabla(){
        tbl_egresados.setDefaultRenderer(Object.class, new Render());
        
        String [] columnas = new String []{"N°","Nombres","Correo","Area de trabajo","Seleccionar"};
        boolean [] editable = {false,false,false,false,true};
        Class [] types= new Class[]{java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class};
        
        DefaultTableModel nModel= new DefaultTableModel(columnas,0){
            public Class getColumnClass(int i){
                return types[i];
            }
            public boolean isCellEditable(int row, int column){
                return editable[column];
            }
        };
        
        LimpiarTabla(tbl_egresados, nModel);
        
        List <Object []> Egresado= new ArrayList<>();
        try {
            Connection conectar=metodo.abrirconeccion();
            String sql="SELECT Codigo_de_estudiante, Nombre_de_IE, id_filial, Carrera, Apellido_paterno, Apellido_materno, Nombres, Correo_electronico, Num_telefono, Operador_1, Num_telefono2, Operador_2, Num_telefono3, Operador_3, Año_egreso, Semestre_egreso, Tipo_documento_identidad, Numero_documento_identidad, Tiene_Grado, Resolucion_Grado, Tiene_Titulo, Resolucion_Titulo, Estado_trabajo, id_area_trabajo FROM EGRESADOS";
            PreparedStatement st = conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            int n=1;
            while(rs.next()){ 
                Object [] datos = new Object[columnas.length];
                datos[0]=n;
                datos[1]=rs.getString(5);
                datos[2]=rs.getString(8);
                int id_area=rs.getInt(24);
                String nombre_area=metodo.obtener_nombre_area(id_area);
                datos[3]=rs.getString(nombre_area);
                datos[4]=false;
                Egresado.add(datos);
            }
            conectar.close();
            // Convertir la lista en una matriz de dos dimensiones
            Object[][] dataArr = new Object[Egresado.size()][columnas.length];
            for (int i = 0; i < Egresado.size(); i++) {
                dataArr[i] = Egresado.get(i);
            }
            //PONER EN FILAS
            for (Object[] row : dataArr) {
                nModel.addRow(row);
            }
            tbl_egresados.setModel(nModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void LimpiarTabla(JTable tabla, DefaultTableModel modeloTabla){
            if(modeloTabla.getRowCount()>0){
                for(int i=0; i<tabla.getRowCount();i++){
                    modeloTabla.removeRow(i);
                    i-=1;
                }
            }
        }

    private void txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoActionPerformed

    private void cbx_CapacitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_CapacitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_CapacitacionesActionPerformed

    private void cbx_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_areaActionPerformed

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
            java.util.logging.Logger.getLogger(frmCapacitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCapacitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCapacitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCapacitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCapacitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_busqueda_masiva;
    private javax.swing.JButton btn_enviar_correo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_Capacitaciones;
    private javax.swing.JComboBox<String> cbx_area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane scroll_panetabla;
    private javax.swing.JTable tbl_egresados;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Nombres;
    // End of variables declaration//GEN-END:variables
}