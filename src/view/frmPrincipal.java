/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Date;
import javax.swing.JFrame;

import controllers.Vales;

/**
 *
 * @author DG15
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Date fecha = new Date();
        int anio=fecha.getYear()+1900;
        int mes = fecha.getMonth()+1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panfer = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mencon = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        conrep = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panfer.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout panferLayout = new javax.swing.GroupLayout(panfer);
        panfer.setLayout(panferLayout);
        panferLayout.setHorizontalGroup(
            panferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        panferLayout.setVerticalGroup(
            panferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagenes/archivo.jpg"))); // NOI18N
        jMenu1.setText("ARCHIVO");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem1.setText("cerrar sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem2.setText("salir");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(87, 20));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        mencon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagenes/consultas.JPG"))); // NOI18N
        mencon.setText("CANJES");
        mencon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mencon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menconMouseClicked(evt);
            }
        });
        jMenuBar1.add(mencon);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagenes/rep.png"))); // NOI18N
        jMenu2.setText("REPORTES");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        conrep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        conrep.setText("Consultar");
        conrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conrepActionPerformed(evt);
            }
        });
        jMenu2.add(conrep);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panfer))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panfer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmLogeo principal = new frmLogeo();
        principal.setVisible(true);
        principal.pack();
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void conrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conrepActionPerformed
        // TODO add your handling code here:
         frmReportes forconrep = new frmReportes();
        panfer.add(forconrep);
        forconrep.show();
    }//GEN-LAST:event_conrepActionPerformed

    private void menconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menconMouseClicked
        // TODO add your handling code here:
        frmLisVal forconrep = new frmLisVal();
        panfer.add(forconrep);
        forconrep.show();
    }//GEN-LAST:event_menconMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem conrep;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mencon;
    public static javax.swing.JDesktopPane panfer;
    // End of variables declaration//GEN-END:variables
}
