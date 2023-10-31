/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Egresados;
import datos.DatosEgresados;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodoss;

/**
 *
 * @author anton
 */
public class frmReportes extends javax.swing.JFrame {

    DatosEgresados datos = new DatosEgresados();
    Metodoss metodos= new Metodoss();
    
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
        model.addColumn("1.º Teléfono");
        model.addColumn("2.º Teléfono");
        model.addColumn("3.º Teléfono");
        model.addColumn("Año de egreso");
        model.addColumn("Semestre de egreso");
        model.addColumn("Tipo de documento de identidad");
        model.addColumn("Nº de documento de identidad");
        model.addColumn("Tiene Grado");
        model.addColumn("Resolucion de Grado");
        model.addColumn("Tiene Título");
        model.addColumn("Resolucion de Título");
        model.addColumn("Estado de trabajo");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtcodigoE = new javax.swing.JTextField();
        txtNumeroDoc = new javax.swing.JTextField();
        jbtnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 120, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_REPORTES.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

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
        jPanel1.add(jtxtcodigoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 70));

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
        jPanel1.add(txtNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 380, 70));

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
        jPanel1.add(jbtnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 670, 60));

        tblDatos.setBackground(new java.awt.Color(255, 255, 250));
        tblDatos.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1460, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtNumeroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDocActionPerformed

    private void txtNumeroDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDocKeyTyped
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

        if (codigo.equals("") && numeroDocIdenti.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el código del estudiante o su Nº Documento de identidad.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("lol");
        }
        else if (numeroDocIdenti.equals("")){
            //instancia de la clase datos para guardar lo obtenido
            DatosEgresados datosencontrados = new DatosEgresados();
            //traer al metodo :D
            metodos.buscarPorCodigo(codigo, numeroDocIdenti,datosencontrados);
            if (datosencontrados.getReGrado() != null){
                //colocar en el formulario lo encontrado
                
            }
        }
        else {
            //instancia de la clase datos para guardar lo obtenido
            DatosEgresados datosencontrados = new DatosEgresados();
            //traer al metodo :D
            metodos.buscarPorCodigo(codigo, numeroDocIdenti,datosencontrados);
            if (datosencontrados.getReGrado() != null){
                //colocar en el formulario lo encontrado
                
            }
        }
    }//GEN-LAST:event_jbtnbuscarActionPerformed

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
    private javax.swing.JButton jbtnbuscar;
    private javax.swing.JTextField jtxtcodigoE;
    public javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtNumeroDoc;
    // End of variables declaration//GEN-END:variables
}
