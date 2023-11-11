package Egresados;

public class frmMenu extends javax.swing.JFrame {

    public frmMenu() {
        initComponents();
        setTitle("MENÚ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEgresados = new javax.swing.JToggleButton();
        btnPerfiles = new javax.swing.JToggleButton();
        btnCapacitaciones = new javax.swing.JToggleButton();
        btnCentro = new javax.swing.JToggleButton();
        btnReportes = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvs.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 100, 80));

        btnEgresados.setBackground(new java.awt.Color(255, 255, 250));
        btnEgresados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/egresados.png"))); // NOI18N
        btnEgresados.setBorder(null);
        btnEgresados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgresadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnEgresados, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        btnPerfiles.setBackground(new java.awt.Color(255, 255, 250));
        btnPerfiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfiles.png"))); // NOI18N
        btnPerfiles.setBorder(null);
        jPanel1.add(btnPerfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        btnCapacitaciones.setBackground(new java.awt.Color(255, 255, 250));
        btnCapacitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/capacitaciones.png"))); // NOI18N
        btnCapacitaciones.setBorder(null);
        jPanel1.add(btnCapacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        btnCentro.setBackground(new java.awt.Color(255, 255, 250));
        btnCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centrolabores.png"))); // NOI18N
        btnCentro.setBorder(null);
        jPanel1.add(btnCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        btnReportes.setBackground(new java.awt.Color(255, 255, 250));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportemenu.png"))); // NOI18N
        btnReportes.setBorder(null);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setText("CENTRO DE LABORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setText("EGRESADOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel4.setText("PERFILES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel5.setText("CAPACITACIONES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setText("REPORTES");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/azul_menu.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, -10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo_menu.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEgresadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgresadosActionPerformed
        frmEgresados f = new frmEgresados();
        f.setVisible(true);
    }//GEN-LAST:event_btnEgresadosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        frmMenuReportes f = new frmMenuReportes();
        f.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCapacitaciones;
    private javax.swing.JToggleButton btnCentro;
    private javax.swing.JToggleButton btnEgresados;
    private javax.swing.JToggleButton btnPerfiles;
    private javax.swing.JToggleButton btnReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
