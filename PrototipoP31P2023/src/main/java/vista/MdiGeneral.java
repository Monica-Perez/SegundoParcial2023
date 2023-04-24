/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MdiGeneral extends javax.swing.JFrame {

    /**
     * Creates new form MdiGeneral
     */
    public MdiGeneral() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MdiGeneral.MAXIMIZED_BOTH);
        this.setTitle("Parcial 2 Monica Perez, 9959-21-1840");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        mnuGeneral = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuSalirSistema = new javax.swing.JCheckBoxMenuItem();
        mnuCatalogos = new javax.swing.JMenu();
        mnuCatalogosMantenimientos = new javax.swing.JMenu();
        mantenimientoClientes = new javax.swing.JCheckBoxMenuItem();
        mnuProcesos = new javax.swing.JMenu();
        mnuConsultas = new javax.swing.JMenu();
        consultaBitacora = new javax.swing.JCheckBoxMenuItem();
        mnuReportes = new javax.swing.JMenu();
        mnuAyudas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");
        mnuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoActionPerformed(evt);
            }
        });

        mnuSalirSistema.setSelected(true);
        mnuSalirSistema.setText("Salir del Sistema");
        mnuSalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirSistemaActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuSalirSistema);

        mnuGeneral.add(mnuArchivo);

        mnuCatalogos.setText("Catalogos");

        mnuCatalogosMantenimientos.setText("Mantenimientos");
        mnuCatalogosMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosActionPerformed(evt);
            }
        });

        mantenimientoClientes.setSelected(true);
        mantenimientoClientes.setText("Mantenimiento Clientes");
        mantenimientoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoClientesActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientos.add(mantenimientoClientes);

        mnuCatalogos.add(mnuCatalogosMantenimientos);

        mnuGeneral.add(mnuCatalogos);

        mnuProcesos.setText("Procesos");
        mnuGeneral.add(mnuProcesos);

        mnuConsultas.setText("Informes");
        mnuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultasActionPerformed(evt);
            }
        });

        consultaBitacora.setSelected(true);
        consultaBitacora.setText("Consulta de Bitacora");
        consultaBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBitacoraActionPerformed(evt);
            }
        });
        mnuConsultas.add(consultaBitacora);

        mnuGeneral.add(mnuConsultas);

        mnuReportes.setText("Herramientas");
        mnuGeneral.add(mnuReportes);

        mnuAyudas.setText("Ayuda");
        mnuGeneral.add(mnuAyudas);

        setJMenuBar(mnuGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirSistemaActionPerformed
        // TODO add your handling code here:
        /*===== OPERACIÓN CERRAR SESIÓN ====
        Variable entera respuesta_cs*/

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión",            JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuSalirSistemaActionPerformed

    private void mnuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArchivoActionPerformed

    private void mantenimientoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoClientesActionPerformed
        // TODO add your handling code here:
        frmMantenimientoClientes ventana = new frmMantenimientoClientes();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_mantenimientoClientesActionPerformed

    private void mnuCatalogosMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCatalogosMantenimientosActionPerformed

    private void consultaBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaBitacoraActionPerformed
        // TODO add your handling code here:
        /*frmMantenimientoBitacora ventana = new frmMantenimientoBitacora();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);*/
    }//GEN-LAST:event_consultaBitacoraActionPerformed

    private void mnuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem consultaBitacora;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JCheckBoxMenuItem mantenimientoClientes;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyudas;
    private javax.swing.JMenu mnuCatalogos;
    private javax.swing.JMenu mnuCatalogosMantenimientos;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenuBar mnuGeneral;
    private javax.swing.JMenu mnuProcesos;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JCheckBoxMenuItem mnuSalirSistema;
    // End of variables declaration//GEN-END:variables
}