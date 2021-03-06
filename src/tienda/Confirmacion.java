/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import datos.Actuacion;
import kiosco.Espectaculo;
import kiosco.Ventana;

/**
 *
 * @author Usuario
 */
public class Confirmacion extends javax.swing.JPanel {

    private Espectaculo ventanaEspectaculo;
    private Actuacion a;
    private Ventana v;

    public Espectaculo getVentanaEspectaculo() {
        return ventanaEspectaculo;
    }

    public void setVentanaEspectaculo(Espectaculo ventanaEspectaculo) {
        this.ventanaEspectaculo = ventanaEspectaculo;
    }

    public Actuacion getA() {
        return a;
    }

    public void setA(Actuacion a) {
        this.a = a;
    }

    public Ventana getV() {
        return v;
    }

    public void setV(Ventana v) {
        this.v = v;
    }

    public Confirmacion(Espectaculo ventanaEspectaculo, Actuacion a, Ventana v, int totalEntradas, String zona) {
        initComponents();
        this.ventanaEspectaculo = ventanaEspectaculo;
        this.a = a;
        this.v = v;
        
        imgEspectaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource(a.getImagen())));
        
        if (zona.equals("patio")) {
            a.setDisponiblePatio(a.getDisponiblePatio() - totalEntradas);
        }
        else if (zona.equals("palco")) {
            a.setDisponiblePalco(a.getDisponiblePalco() - totalEntradas);
        }
        else if (zona.equals("vr")) {
            a.setDisponibleVR(a.getDisponibleVR() - totalEntradas);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgEspectaculo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgEspectaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fundacion-caja-castellon-tortuga.jpg"))); // NOI18N
        add(imgEspectaculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("PAGO COMPLETADO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        btnContinuar.setBackground(new java.awt.Color(100, 255, 100));
        btnContinuar.setText("Volver a la portada");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 550, -1));

        jPanel1.setBackground(new java.awt.Color(180, 180, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("¡El pago ha funcionado correctamente!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 30, -1, -1));

        jLabel3.setText("Recoge tus entradas y el recibo.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel4.setText("¡Disfruta del espectáculo!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 440, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        this.v.getContentPane().setVisible(false);
        ventanaEspectaculo.getPadre().setVisible(true);
        v.setContentPane(ventanaEspectaculo.getPadre());
    }//GEN-LAST:event_btnContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel imgEspectaculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
